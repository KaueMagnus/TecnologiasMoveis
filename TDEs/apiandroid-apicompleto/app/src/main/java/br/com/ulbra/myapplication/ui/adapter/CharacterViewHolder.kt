package br.com.ulbra.myapplication.ui.adapter

import androidx.recyclerview.widget.RecyclerView
import br.com.ulbra.myapplication.data.model.Character
import br.com.ulbra.myapplication.databinding.CharacterItemListBinding
import com.bumptech.glide.Glide

class CharacterViewHolder(
    private val binding: CharacterItemListBinding,
) : RecyclerView.ViewHolder(binding.root) {
    fun bind(character: Character) {
        binding.character = character

        Glide
            .with(binding.root)
            .load(character.image)
            .into(binding.avatar)
    }
}