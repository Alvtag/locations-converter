import com.google.gson.Gson
import model.*
import java.io.BufferedReader
import java.io.File

fun main(args: Array<String>) {

    val bufferedReader: BufferedReader = File("/Users/tsd043/IdeaProjects/locations-converter/src/old-maps.json").bufferedReader()
    val inputString = bufferedReader.use { it.readText() }
    val deckList = Gson().fromJson(inputString, Array<Deck>::class.java).toList()
    var count = 0
    println("decks::${deckList.size}")
    deckList.forEach { deck ->
        println("deck:${deck.name}")
        deck.pois?.forEach { poi ->
            println("poi:${poi?.name}")
        }
        count += deck.pois?.size ?: 0
    }
    println("count:$count")

    val allClubsList = mutableListOf<ClubsInfoItem>()
    for (i in 0..5) {
        val staffList = mutableListOf<StaffItem>()
        staffList.add(StaffItem(staffPositionName = "Youth Director $i",
                staffPositionMembers = listOf("Yael Dong $i", "Yolanda Dennis $i")))

        val age = when (i) {
            0 -> Age(displayAge = "Ages 0-2", sPMSAgeClubID = "0000", minimumAge = "0", maximumAge = "2")
            1 -> Age(displayAge = "Ages 2-5", sPMSAgeClubID = "2000", minimumAge = "2", maximumAge = "5")
            2 -> Age(displayAge = "Ages 6-8", sPMSAgeClubID = "6000", minimumAge = "6", maximumAge = "8")
            3 -> Age(displayAge = "Ages 9-11", sPMSAgeClubID = "9000", minimumAge = "9", maximumAge = "11")
            4 -> Age(displayAge = "Ages 12-14", sPMSAgeClubID = "1200", minimumAge = "12", maximumAge = "14")
            else -> Age(displayAge = "Ages 15-17", sPMSAgeClubID = "1500", minimumAge = "15", maximumAge = "17")
        }
        val shortName = when (i) {
            0 -> "Under 2"
            1 -> "Penguins"
            2 -> "Stingrays"
            3 -> "Sharks"
            4 -> "Circle C"
            else -> "Club O2"
        }
        val longName = when (i) {
            0 -> "Camp Ocean | Under 2"
            1 -> "Camp Ocean | Penguins"
            2 -> "Camp Ocean | Stingrays"
            3 -> "Camp Ocean | Sharks"
            4 -> "Circle C"
            else -> "Club O2"
        }

        val clubDesc = "Club description example ${longName[i]}"

        val image = "https://placekitten.com/200/300"

        val color = "#a6bbf2"

        val extraFeeTime = ExtraFeeTime(startTime = "22:00:00",
                title = "Night Owls Time",
                description = "Deadlights jack lad schooner scallywag dance the hempen jig carouser broadside cable strike colors. Bring a spring upon her cable holystone blow the man down spanker Shiver me timbers to go on account lookout wherry doubloon chase. Belay yo-ho-ho keelhaul squiffy black spot yardarm spyglass sheet transom heave to."
        )

        val rules = listOf(RulesItem(name = "Age restrictions", description = "Be aware of certain age restrictions"))
        val rulesAndRegs = RulesAndRegulationsItem(rules = rules, name = "Example ruleset name")
        val rulesAndRegulations = listOf(rulesAndRegs)

        allClubsList.add(ClubsInfoItem(
                shortName = shortName,
                longName = longName,
                description = clubDesc,
                target = shortName,
                image = image,
                youthLandingPageIcon = image,
                youthLandingPageColor = color,
                youthFilterPageIcon = image,
                age = age,
                extension = "$i$i$i$i",
                staff = staffList,
                extraFeeTime = extraFeeTime,
                rulesAndRegulations = rulesAndRegulations))
    }

    var poiWithClubCount = 0
    var poiWithDoubleClubCount = 0
    deckList.forEach { deck ->
        deck.pois?.forEach { poi ->
            val shuffledList = (0..5).shuffled()
            val club1 = shuffledList.last()
            val club2 = shuffledList.first()

            val clubsList= mutableListOf<ClubsInfoItem> ()

            if ((0..9).shuffled().last() == 0) {
                clubsList.add(allClubsList[club1])

                if ((0..1).shuffled().last() == 0){
                    clubsList.add(allClubsList[club2])
                    poiWithDoubleClubCount++
                }
                poiWithClubCount++
            }
            poi.clubsInfo = clubsList
        }
    }

    println("count:$count")
    println("poiWithClubCount:$poiWithClubCount")
    println("poiWithDoubleClubCount:$poiWithDoubleClubCount")

    val jsonString:String = Gson().toJson(deckList)
    val file=File("/Users/tsd043/IdeaProjects/locations-converter/src/new-locations.json")
    file.writeText(jsonString)
}