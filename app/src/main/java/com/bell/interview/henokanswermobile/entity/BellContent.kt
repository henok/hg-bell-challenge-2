package com.bell.interview.henokanswermobile.entity

import com.google.gson.annotations.SerializedName

data class BellContent(

	@field:SerializedName("Owner")
	val owner: Owner? = null,

	@field:SerializedName("BroadcastDate")
	val broadcastDate: Any? = null,

	@field:SerializedName("Keywords")
	val keywords: List<Any?>? = null,

	@field:SerializedName("ShortDesc")
	val shortDesc: String? = null,

	@field:SerializedName("Funding")
	val funding: Any? = null,

	@field:SerializedName("AgvotDisclaimer")
	val agvotDisclaimer: Any? = null,

	@field:SerializedName("Album")
	val album: Any? = null,

	@field:SerializedName("Name")
	val name: String? = null,

	@field:SerializedName("Desc")
	val desc: String? = null,

	@field:SerializedName("MusicLabels")
	val musicLabels: List<Any?>? = null,

	@field:SerializedName("NextAuthentication")
	val nextAuthentication: Any? = null,

	@field:SerializedName("Genres")
	val genres: List<Any?>? = null,

	@field:SerializedName("BroadcastNetworks")
	val broadcastNetworks: List<Any?>? = null,

	@field:SerializedName("Tags")
	val tags: List<Any?>? = null,

	@field:SerializedName("LastModifiedDateTime")
	val lastModifiedDateTime: String? = null,

	@field:SerializedName("AgvotCode")
	val agvotCode: String? = null,

	@field:SerializedName("QfrCode")
	val qfrCode: String? = null,

	@field:SerializedName("Images")
	val images: List<ImagesItem?>? = null,

	@field:SerializedName("People")
	val people: List<Any?>? = null,

	@field:SerializedName("RatingWarnings")
	val ratingWarnings: List<Any?>? = null,

	@field:SerializedName("Episode")
	val episode: Any? = null,

	@field:SerializedName("Type")
	val type: String? = null,

	@field:SerializedName("AiringOrder")
	val airingOrder: Any? = null,

	@field:SerializedName("Authentication")
	val authentication: Authentication? = null,

	@field:SerializedName("BroadcastDateTime")
	val broadcastDateTime: Any? = null,

	@field:SerializedName("BroadcastTime")
	val broadcastTime: Any? = null,

	@field:SerializedName("Id")
	val id: Int? = null,

	@field:SerializedName("GameId")
	val gameId: Any? = null
)