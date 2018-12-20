package model

import javax.annotation.Generated
import com.google.gson.annotations.SerializedName

@Generated("com.robohorse.robopojogenerator")
data class Event(

        @field:SerializedName("Action")
        val action: Any? = null,

        @field:SerializedName("Description")
        val description: String? = null,

        @field:SerializedName("EndTime")
        val endTime: String? = null,

        @field:SerializedName("DiningAttireTitle")
        val diningAttireTitle: Any? = null,

        @field:SerializedName("DiningReservationInstructions")
        val diningReservationInstructions: Any? = null,

        @field:SerializedName("GroupingType")
        val groupingType: Any? = null,

        @field:SerializedName("TriggerReminder")
        val triggerReminder: Boolean? = null,

        @field:SerializedName("DiningCancelRule")
        val diningCancelRule: Any? = null,

        @field:SerializedName("ChildTitle")
        val childTitle: Any? = null,

        @field:SerializedName("Image")
        val image: String? = null,

        @field:SerializedName("PlannerSubHeader")
        val plannerSubHeader: Any? = null,

        @field:SerializedName("DateTime")
        val dateTime: String? = null,

        @field:SerializedName("Target")
        val target: String? = null,

        @field:SerializedName("DisplayTime")
        val displayTime: String? = null,

        @field:SerializedName("DiningReservationMaxPartySize")
        val diningReservationMaxPartySize: Any? = null,

        @field:SerializedName("EventId")
        val eventId: String? = null,

        @field:SerializedName("IconImage")
        val iconImage: Any? = null,

        @field:SerializedName("Children")
        val children: List<Any?>? = null,

        @field:SerializedName("ReminderMinutesTimeOffset")
        val reminderMinutesTimeOffset: Any? = null,

        @field:SerializedName("Teaser")
        val teaser: Any? = null,

        @field:SerializedName("Categories")
        val categories: List<String?>? = null,

        @field:SerializedName("DiningCode")
        val diningCode: Any? = null,

        @field:SerializedName("IsRemovable")
        val isRemovable: Boolean? = null,

        @field:SerializedName("Priority")
        val priority: Any? = null,

        @field:SerializedName("StartTime")
        val startTime: String? = null,

        @field:SerializedName("LocationId")
        val locationId: String? = null,

        @field:SerializedName("DiningPagedInstructions")
        val diningPagedInstructions: Any? = null,

        @field:SerializedName("Title")
        val title: String? = null,

        @field:SerializedName("TelExtension")
        val telExtension: Any? = null,

        @field:SerializedName("Ages")
        val ages: Any? = null,

        @field:SerializedName("Offers")
        val offers: List<Any?>? = null,

        @field:SerializedName("ExtraFee")
        val extraFee: Boolean? = null,

        @field:SerializedName("Price")
        val price: Any? = null,

        @field:SerializedName("DiningCancelRuleDescription")
        val diningCancelRuleDescription: Any? = null,

        @field:SerializedName("ReservationReq")
        val reservationReq: Boolean? = null,

        @field:SerializedName("DiningAttireMessage")
        val diningAttireMessage: Any? = null,

        @field:SerializedName("Menus")
        val menus: List<Any?>? = null,

        @field:SerializedName("DiningType")
        val diningType: Any? = null,

        @field:SerializedName("ReminderCustomText")
        val reminderCustomText: Any? = null,

        @field:SerializedName("LoyaltyLevels")
        val loyaltyLevels: List<Any?>? = null,

        @field:SerializedName("Tags")
        val tags: List<TagsItem?>? = listOf()
)