package com.example.notesapp.database.businesslogic

import com.example.notesapp.database.data.model.InvalidNoteException
import com.example.notesapp.database.data.model.Note
import com.example.notesapp.database.data.repository.NoteRepository

class AddNote(
    private val repository: NoteRepository
) {

    @Throws(InvalidNoteException::class)
    suspend operator fun invoke(note: Note) {
        if(note.title.isBlank()) {
            throw InvalidNoteException("The title of the note can't be empty.")
        }
        if(note.content.isBlank()) {
            throw InvalidNoteException("The content of the note can't be empty.")
        }
        repository.insertNote(note)
    }
}