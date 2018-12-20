package model

import javax.annotation.Generated
import com.google.gson.annotations.SerializedName

@Generated("com.robohorse.robopojogenerator")
data class ClubsInfoItem(

	@field:SerializedName("YouthFilterPageIcon")
	val youthFilterPageIcon: String? = null,

	@field:SerializedName("Description")
	val description: String? = null,

	@field:SerializedName("Staff")
	val staff: List<StaffItem?>? = null,

	@field:SerializedName("ShortName")
	val shortName: String? = null,

	@field:SerializedName("Image")
	val image: String? = null,

	@field:SerializedName("ExtraFeeTime")
	val extraFeeTime: ExtraFeeTime? = null,

	@field:SerializedName("Extension")
	val extension: String? = null,

	@field:SerializedName("YouthLandingPageIcon")
	val youthLandingPageIcon: String? = null,

	@field:SerializedName("Target")
	val target: String? = null,

	@field:SerializedName("YouthLandingPageColor")
	val youthLandingPageColor: String? = null,

	@field:SerializedName("LongName")
	val longName: String? = null,

	@field:SerializedName("RulesAndRegulations")
	val rulesAndRegulations: List<RulesAndRegulationsItem?>? = null,

	@field:SerializedName("Age")
	val age: Age? = null
)