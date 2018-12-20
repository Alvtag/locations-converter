package model

import javax.annotation.Generated
import com.google.gson.annotations.SerializedName

@Generated("com.robohorse.robopojogenerator")
data class RulesAndRegulationsItem(

	@field:SerializedName("Rules")
	val rules: List<RulesItem?>? = null,

	@field:SerializedName("Name")
	val name: String? = null
)