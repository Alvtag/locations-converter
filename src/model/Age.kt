package model

import javax.annotation.Generated
import com.google.gson.annotations.SerializedName

@Generated("com.robohorse.robopojogenerator")
data class Age(

	@field:SerializedName("DisplayAge")
	val displayAge: String? = null,

	@field:SerializedName("SPMSAgeClubID")
	val sPMSAgeClubID: String? = null,

	@field:SerializedName("MinimumAge")
	val minimumAge: String? = null,

	@field:SerializedName("MaximumAge")
	val maximumAge: String? = null
)