package br.com.ulbra.myapplication.ui.adapter

import androidx.recyclerview.widget.DiffUtil
import br.com.ulbra.myapplication.data.model.Character

class CharacterDiffCallback : DiffUtil.ItemCallback<Character>() {
    override fun areItemsTheSame(oldItem: Character, newItem: Character): Boolean {
        return oldItem.name == newItem.name
    }

    override fun areContentsTheSame(oldItem: Character, newItem: Character): Boolean {
        return oldItem == newItem
    }
}