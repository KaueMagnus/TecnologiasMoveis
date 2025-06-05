package com.example.barnmanager.ui.adapter

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.barnmanager.R
import com.example.barnmanager.data.model.Barn

class BarnViewHolder(
    itemView: View,
    private val onDelete: (Barn) -> Unit,
    private val onDetails: (Barn) -> Unit
) : RecyclerView.ViewHolder(itemView) {

    private val nomeTextView: TextView = itemView.findViewById(R.id.tvNome)
    private val descricaoTextView: TextView = itemView.findViewById(R.id.tvDescricao)

    fun bind(item: Barn) {
        nomeTextView.text = item.nome
        descricaoTextView.text = item.descricao

        itemView.setOnClickListener { onDetails(item) }
        itemView.setOnLongClickListener {
            onDelete(item)
            true
        }
    }
}