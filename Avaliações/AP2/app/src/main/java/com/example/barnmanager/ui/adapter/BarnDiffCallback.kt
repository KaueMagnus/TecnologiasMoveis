package com.example.barnmanager.ui.adapter

import androidx.recyclerview.widget.DiffUtil
import com.example.barnmanager.data.model.Barn

class BarnDiffCallback : DiffUtil.ItemCallback<Barn>() {
    override fun areItemsTheSame(oldItem: Barn, newItem: Barn): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: Barn, newItem: Barn): Boolean {
        return oldItem == newItem
    }
}