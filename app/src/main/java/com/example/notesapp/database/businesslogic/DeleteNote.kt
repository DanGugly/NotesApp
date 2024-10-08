package com.example.notesapp.database.businesslogic

import com.example.notesapp.database.data.model.Note
import com.example.notesapp.database.data.repository.NoteRepository

class DeleteNote(
    private val repository: NoteRepository
) {
    suspend operator fun invoke(note: Note) {
        repository.deleteNote(note)
    }
}