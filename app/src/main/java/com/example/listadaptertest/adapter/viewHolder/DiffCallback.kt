package com.example.listadaptertest.adapter.viewHolder

import androidx.recyclerview.widget.DiffUtil
import com.example.listadaptertest.model.ListItem

class DiffCallback : DiffUtil.ItemCallback<ListItem>() {
    override fun areItemsTheSame(oldItem: ListItem, newItem: ListItem): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: ListItem, newItem: ListItem): Boolean {
        return oldItem == newItem
    }
}
