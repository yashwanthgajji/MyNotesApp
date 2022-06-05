package com.yashapps.mynotesapp.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.yashapps.mynotesapp.ui.theme.*

@Entity
data class Note(
    val title: String,
    val content: String,
    var timestamp: Long,
    val color: Int,
    @PrimaryKey var id: Int? = null
) {
    companion object {
        val noteColors = listOf(RedOrange, LightGreen, Violet, BabyBlue, RedPink)
        val noteCategories = listOf("TODO", "Shopping", "Ideas", "Remember", "Goals")
    }
}

class InvalidNoteException(message: String): Exception(message)