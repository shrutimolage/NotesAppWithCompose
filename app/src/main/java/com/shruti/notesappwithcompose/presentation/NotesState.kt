package com.shruti.notesappwithcompose.presentation

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import com.shruti.notesappwithcompose.data.Note

data class NotesState(
    val notes: List<Note> = emptyList(),
    val title: MutableState<String> = mutableStateOf(""),
    val description:MutableState<String> = mutableStateOf("")
)




