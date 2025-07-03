package br.com.ulbra.myapplication.data.mapper

import br.com.ulbra.myapplication.data.model.Character
import br.com.ulbra.myapplication.data.remote.response.CharacterResponse

fun CharacterResponse.convertToModel() =
    Character(name = this.name, species = this.species, image = this.image)