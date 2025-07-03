package br.com.ulbra.myapplication.data

import br.com.ulbra.myapplication.data.mapper.convertToModel
import br.com.ulbra.myapplication.data.model.Character
import br.com.ulbra.myapplication.data.remote.RetrofitClient

class CharacterRepository {
    suspend fun fetchCharacters(): List<Character> {
        return RetrofitClient.api.getCharacters().characterResponseResult.map { item -> item.convertToModel()}
    }
}