package model

import javax.annotation.Generated
import com.google.gson.annotations.SerializedName

@Generated("com.robohorse.robopojogenerator")
data class TargetsItem(

	@field:SerializedName("TargetType")
	val targetType: String? = null,

	@field:SerializedName("Count")
	val count: Int? = null,

	@field:SerializedName("Name")
	val name: String? = null
)