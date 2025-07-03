package br.com.ulbra.myapplication.data.remote

import br.com.ulbra.myapplication.data.remote.response.ResultCharacterResponse
import retrofit2.http.GET

interface CharacterApi {
    @GET("character")
    suspend fun getCharacters(): ResultCharacterResponse
}