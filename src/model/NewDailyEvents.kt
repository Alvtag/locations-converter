package model

import javax.annotation.Generated
import com.google.gson.annotations.SerializedName

@Generated("com.robohorse.robopojogenerator")
data class NewDailyEvents(

        @field:SerializedName("VoyageDayDate")
        val voyageDayDate: String? = null,

        @field:SerializedName("Filters")
        val filters: Filters? = null,

        @field:SerializedName("EventsCount")
        val eventsCount: Int? = null,

        @field:SerializedName("Events")
        val events: List<Event?>? = null

)
