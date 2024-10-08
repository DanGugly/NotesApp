package com.example.notesapp.database.database

import android.app.Application
import androidx.room.Room
import com.example.notesapp.database.businesslogic.AddNote
import com.example.notesapp.database.businesslogic.DeleteNote
import com.example.notesapp.database.businesslogic.GetNote
import com.example.notesapp.database.businesslogic.GetNotes
import com.example.notesapp.database.businesslogic.NoteFuncs
import com.example.notesapp.database.data.db.NoteDatabase
import com.example.notesapp.database.data.repository.NoteRepository
import com.example.notesapp.database.data.repository.NoteRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun provideNoteDatabase(app: Application): NoteDatabase {
        return Room.databaseBuilder(
            app,
            NoteDatabase::class.java,
            NoteDatabase.DATABASE_NAME
        ).build()
    }

    @Provides
    @Singleton
    fun provideNoteRepository(db: NoteDatabase): NoteRepository {
        return NoteRepositoryImpl(db.noteDao)
    }

    @Provides
    @Singleton
    fun provideNoteUseCases(repository: NoteRepository): NoteFuncs {
        return NoteFuncs(
            getNotes = GetNotes(repository),
            deleteNote = DeleteNote(repository),
            addNote = AddNote(repository),
            getNote = GetNote(repository)
        )
    }
}