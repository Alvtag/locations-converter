package model

import javax.annotation.Generated
import com.google.gson.annotations.SerializedName

@Generated("com.robohorse.robopojogenerator")
data class PoisItem(

	@field:SerializedName("IsPizzaEnabled")
	val isPizzaEnabled: Boolean? = null,

	@field:SerializedName("Description")
	val description: String? = null,

	@field:SerializedName("Categories")
	val categories: List<String?>? = null,

	@field:SerializedName("Coordinates")
	val coordinates: Coordinates? = null,

	@field:SerializedName("UseLocationNameOnly")
	val useLocationNameOnly: Boolean? = null,

	@field:SerializedName("LocationId")
	val locationId: String? = null,

	@field:SerializedName("Thumbnail")
	val thumbnail: Any? = null,

	@field:SerializedName("Name")
	val name: String? = null,

	@field:SerializedName("tags")
	val tags: String? = null,

	@field:SerializedName("OpenTime")
	val openTime: Any? = null,

	@field:SerializedName("GenericName")
	val genericName: String? = null,

	@field:SerializedName("LocationText")
	val locationText: String? = null,

	@field:SerializedName("CloseTime")
	val closeTime: Any? = null,

	@field:SerializedName("Visible")
	val visible: Boolean? = null,

	@field:SerializedName("AgeRestrictions")
	val ageRestrictions: String? = null,

	@field:SerializedName("ClubsInfo")
	var clubsInfo: List<ClubsInfoItem>? = null
)