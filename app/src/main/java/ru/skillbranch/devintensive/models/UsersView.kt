package ru.skillbranch.devintensive.models

import android.provider.ContactsContract
import java.sql.ClientInfoStatus

class UsersView(
    val id: String,
    val fullName: String,
    val nickName: String,
    var avatar: String? = null,
    var status: String? = "offline",
    val initiials: String?
) {
    fun printMe() {
        println(
            """
            id: $id
            fullName: $fullName
            nickName: $nickName
            avatar: $avatar
            status: $status
            initiials : $initiials  
        """.trimIndent()
        )
    }
}
