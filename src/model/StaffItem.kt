package model

import javax.annotation.Generated
import com.google.gson.annotations.SerializedName

@Generated("com.robohorse.robopojogenerator")
data class StaffItem(

	@field:SerializedName("StaffPositionName")
	val staffPositionName: String? = null,

	@field:SerializedName("StaffPositionMembers")
	val staffPositionMembers: List<String?>? = null
)