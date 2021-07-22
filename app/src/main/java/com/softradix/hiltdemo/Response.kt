package com.softradix.hiltdemo

import com.google.gson.annotations.SerializedName

data class Response(

	@SerializedName("Response")
	var response: List<ResponseItem?>? = null
)

data class ResponseItem(

	@SerializedName("id")
	val id: Int? = null,

	@field:SerializedName("title")
	val title: String? = null,

	@field:SerializedName("body")
	val body: String? = null,

	@field:SerializedName("userId")
	val userId: Int? = null
)
