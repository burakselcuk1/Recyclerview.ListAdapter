package com.example.listadaptertest.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.listadaptertest.adapter.viewHolder.DiffCallback
import com.example.listadaptertest.adapter.viewHolder.ViewHolderTypeOne
import com.example.listadaptertest.adapter.viewHolder.ViewHolderTypeThree
import com.example.listadaptertest.adapter.viewHolder.ViewHolderTypeTwo
import com.example.listadaptertest.databinding.ItemOneLayoutBinding
import com.example.listadaptertest.databinding.ItemThreeLayoutBinding
import com.example.listadaptertest.databinding.ItemTwoLayoutBinding
import com.example.listadaptertest.model.ItemType
import com.example.listadaptertest.model.ListItem

class MyAdapter : ListAdapter<ListItem, RecyclerView.ViewHolder>(DiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return when (viewType) {
            ItemType.TYPE_ONE.ordinal -> {
                val binding = ItemOneLayoutBinding.inflate(inflater, parent, false)
                ViewHolderTypeOne(binding)
            }
            ItemType.TYPE_TWO.ordinal -> {
                val binding = ItemTwoLayoutBinding.inflate(inflater, parent, false)
                ViewHolderTypeTwo(binding)
            }
            ItemType.TYPE_THREE.ordinal -> {
                val binding = ItemThreeLayoutBinding.inflate(inflater, parent, false)
                ViewHolderTypeThree(binding)
            }
            else -> throw IllegalArgumentException("Invalid view type")
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = getItem(position)
        when (holder) {
            is ViewHolderTypeOne -> holder.bind(item)
            is ViewHolderTypeTwo -> holder.bind(item)
            is ViewHolderTypeThree -> holder.bind(item)
            else -> throw IllegalArgumentException("Invalid view holder")
        }
    }

    override fun getItemViewType(position: Int): Int {
        return getItem(position).type.ordinal
    }
}
