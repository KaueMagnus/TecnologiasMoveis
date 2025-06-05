package com.example.barnmanager.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.example.barnmanager.data.model.Barn
import com.example.barnmanager.R

class BarnAdapter(
    private val onDelete: (Barn) -> Unit,
    private val onDetails: (Barn) -> Unit
) : ListAdapter<Barn, BarnViewHolder>(BarnDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BarnViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.barn_item_list, parent, false)
        return BarnViewHolder(view, onDelete, onDetails)
    }

    override fun onBindViewHolder(holder: BarnViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}