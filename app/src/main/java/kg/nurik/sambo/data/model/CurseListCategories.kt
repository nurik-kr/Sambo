package kg.nurik.sambo.data.model

import com.google.gson.annotations.SerializedName

data class CurseListCategories(

	@SerializedName("rows") val rows : List<Rows>,
	@SerializedName("total_count") val total_count : Int
)
