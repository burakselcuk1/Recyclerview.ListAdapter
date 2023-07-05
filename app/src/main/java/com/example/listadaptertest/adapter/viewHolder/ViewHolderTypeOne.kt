package com.example.listadaptertest.adapter.viewHolder

import androidx.recyclerview.widget.RecyclerView
import com.example.listadaptertest.databinding.ItemOneLayoutBinding
import com.example.listadaptertest.databinding.ItemThreeLayoutBinding
import com.example.listadaptertest.databinding.ItemTwoLayoutBinding
import com.example.listadaptertest.model.ListItem

class ViewHolderTypeOne(private val binding: ItemOneLayoutBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bind(item: ListItem) {
        binding.title.text = item.title
    }
}

class ViewHolderTypeTwo(private val binding: ItemTwoLayoutBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bind(item: ListItem) {
        binding.title.text = item.title
    }
}


class ViewHolderTypeThree(private val binding: ItemThreeLayoutBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bind(item: ListItem) {
        binding.textview.text = item.title
    }
}
