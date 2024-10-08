package com.example.notesapp.ui.main.viewmodel.states

import com.example.notesapp.database.data.model.Note
import com.example.notesapp.database.utils.NoteOrder
import com.example.notesapp.database.utils.OrderType

data class NotesState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)