package br.com.ulbra.myapplication.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import br.com.ulbra.myapplication.data.CharacterRepository
import br.com.ulbra.myapplication.data.model.Character
import br.com.ulbra.myapplication.ui.utils.Result
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class CharacterViewModel : ViewModel() {
    private val repository = CharacterRepository()
    private val _characters = MutableLiveData<Result<List<Character>>>()
    val characters = _characters

    init {
        fetchCharacters()
    }

    private fun fetchCharacters() {
        _characters.value = Result.Loading

        viewModelScope.launch(Dispatchers.IO) {
            delay(5000)

            val characters = repository.fetchCharacters()
             withContext(Dispatchers.Main) {
                 _characters.value = Result.Success(characters)
             }
        }
    }
}