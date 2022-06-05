package com.yashapps.mynotesapp.feature_note.domain.use_case

import com.yashapps.mynotesapp.feature_note.domain.model.Note
import com.yashapps.mynotesapp.feature_note.domain.repository.NoteRepository

class GetNoteUseCase(
    private val repository: NoteRepository
) {
    suspend operator fun invoke(id: Int): Note? {
        return repository.getNoteById(id)
    }
}