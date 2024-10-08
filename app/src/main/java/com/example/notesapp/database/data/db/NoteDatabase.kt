package com.example.notesapp.database.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.notesapp.database.dao.NoteDao
import com.example.notesapp.database.data.model.Note

@Database(
    entities = [Note::class],
    version = 1
)
abstract class NoteDatabase: RoomDatabase() {
    abstract val noteDao: NoteDao
}