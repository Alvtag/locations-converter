package model

import javax.annotation.Generated
import com.google.gson.annotations.SerializedName

@Generated("com.robohorse.robopojogenerator")
data class Filters(

	@field:SerializedName("Categories")
	val categories: List<CategoriesItem?>? = null,

	@field:SerializedName("Targets")
	val targets: List<TargetsItem?>? = null
)