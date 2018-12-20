package model

import javax.annotation.Generated
import com.google.gson.annotations.SerializedName

@Generated("com.robohorse.robopojogenerator")
data class TagsItem(

	@field:SerializedName("Description")
	val description: String? = null,

	@field:SerializedName("Color")
	val color: String? = null,

	@field:SerializedName("Icon")
	val icon: String? = null,

	@field:SerializedName("Name")
	val name: String? = null
)