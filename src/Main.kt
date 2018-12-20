import com.google.gson.Gson
import model.CategoriesItem
import model.Filters
import model.NewDailyEvents
import model.Event
import java.io.BufferedReader
import java.io.File

fun main(args: Array<String>) {

    val bufferedReader: BufferedReader = File("/Users/tsd043/IdeaProjects/events-converter/src/old-events.json").bufferedReader()
    val inputString = bufferedReader.use { it.readText() }
    val oldEventList = Gson().fromJson(inputString, Array<Event>::class.java).toList()

    // run through all events and create map of date: list of events
    val oldEventsMap = HashMap<String, MutableList<Event>>()
    oldEventList.forEach { event ->
        val key = event.startTime?.split("T")?.get(0)?.let { key ->
            if (oldEventsMap.containsKey(key)) {
                oldEventsMap.get(key)?.add(event)
            } else {
                val newList = mutableListOf(event)
                oldEventsMap.put(key, newList)
            }
        }
    }


    val finalList = mutableListOf<NewDailyEvents>()
    oldEventsMap.keys.forEach { date ->
        val dailyOldEventList = oldEventsMap[date]
        val dailyCategoryMap = HashMap<String, Int>()

        dailyOldEventList?.forEach { oldEvent ->
            oldEvent.categories?.forEach { category ->
                category?.let {
                    if (dailyCategoryMap.containsKey(category)) {
                        dailyCategoryMap.put(category, dailyCategoryMap[category]?.plus(1) ?: 1)
                    } else {
                        dailyCategoryMap.put(category, 1)
                    }
                }
            }
        }

        val categoriesItemList = mutableListOf<CategoriesItem>()
        dailyCategoryMap.keys.forEach { categoriesItemList.add(CategoriesItem(dailyCategoryMap[it], it)) }

        finalList.add(NewDailyEvents(
                "${date}T00:00:00-05:00",
                Filters(categoriesItemList, listOf()),
                dailyOldEventList?.size ?: 0,
                dailyOldEventList ?: listOf()))
    }
    println("oldEventList:${oldEventList.size}")
    // for each date, wrap its list of events in a NewDailyEvents object (with other necessary fields)

    // for each date, create a map of category:string to count:int,
    //     run through the daily list and populate these 2 maps

    val jsonString:String = Gson().toJson(finalList)
    val file=File("/Users/tsd043/IdeaProjects/events-converter/src/new-events.json")
    file.writeText(jsonString)
}