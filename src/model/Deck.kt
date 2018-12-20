package model

import javax.annotation.Generated
import com.google.gson.annotations.SerializedName

@Generated("com.robohorse.robopojogenerator")
data class Deck(

	@field:SerializedName("IsPizzaEnabled")
	val isPizzaEnabled: Boolean? = null,

	@field:SerializedName("DeckId")
	val deckId: String? = null,

	@field:SerializedName("SVGMap")
	val sVGMap: String? = null,

	@field:SerializedName("Height")
	val height: Any? = null,

	@field:SerializedName("Image")
	val image: String? = null,

	@field:SerializedName("Width")
	val width: Any? = null,

	@field:SerializedName("Name")
	val name: String? = null,

	@field:SerializedName("Pois")
	val pois: List<PoisItem>? = null
)