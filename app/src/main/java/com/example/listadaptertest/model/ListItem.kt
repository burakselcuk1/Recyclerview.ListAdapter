package com.example.listadaptertest.model

enum class ItemType {
    TYPE_ONE,
    TYPE_TWO,
    TYPE_THREE,
}

data class ListItem(
    val id: String,
    val title: String,
    val type: ItemType
)
