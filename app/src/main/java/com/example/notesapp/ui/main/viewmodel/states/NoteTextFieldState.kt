package com.example.notesapp.ui.main.viewmodel.states

data class NoteTextFieldState(
    val text: String = "",
    val hint: String = "",
    val isHintVisible: Boolean = true
)