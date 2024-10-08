package com.example.notesapp.database.businesslogic

import com.example.notesapp.database.data.model.Note
import com.example.notesapp.database.data.repository.NoteRepository

class GetNote(
    private val repository: NoteRepository
) {

    suspend operator fun invoke(id: Int): Note? {
        return repository.getNoteById(id)
    }
}