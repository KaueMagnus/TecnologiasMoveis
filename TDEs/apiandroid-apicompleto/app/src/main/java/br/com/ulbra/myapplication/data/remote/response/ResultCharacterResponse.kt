package br.com.ulbra.myapplication.data.remote.response

import com.google.gson.annotations.SerializedName

data class ResultCharacterResponse(
    @SerializedName("results")
    val characterResponseResult: List<CharacterResponse>
)
