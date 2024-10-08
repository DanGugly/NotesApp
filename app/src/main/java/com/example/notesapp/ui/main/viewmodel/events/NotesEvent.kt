package com.example.notesapp.ui.main.viewmodel.events

import com.example.notesapp.database.data.model.Note
import com.example.notesapp.database.utils.NoteOrder

sealed class NotesEvent {
    data class Order(val noteOrder: NoteOrder): NotesEvent()
    data class DeleteNote(val note: Note): NotesEvent()
    object RestoreNote: NotesEvent()
    object ToggleOrderSection: NotesEvent()
}