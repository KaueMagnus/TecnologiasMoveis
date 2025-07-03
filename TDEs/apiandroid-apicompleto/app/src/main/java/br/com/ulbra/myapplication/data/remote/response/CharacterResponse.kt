package br.com.ulbra.myapplication.data.remote.response

import com.google.gson.annotations.SerializedName

data class CharacterResponse(
    @SerializedName("name")
    val name: String,
    @SerializedName("species")
    val species: String,
    @SerializedName("image")
    val image: String
)
