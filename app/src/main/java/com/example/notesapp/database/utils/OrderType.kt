package com.example.notesapp.database.utils

sealed class OrderType {
    object Ascending: OrderType()
    object Descending: OrderType()
}