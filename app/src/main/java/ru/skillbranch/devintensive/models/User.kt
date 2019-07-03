package ru.skillbranch.devintensive.models

import ru.skillbranch.devintensive.utils.Utils
import java.util.*

data class User(
    val id: String,
    var firstName: String?,
    var lastName: String?,
    var avatar: String?,
    var raiting: Int = 0,
    var respect: Int = 0,
    val lastVisit: Date? = null,
    val isOnline: Boolean = false
) {
    constructor(id: String, firstName: String?, lastName: String?) : this(
        id = id,
        firstName = firstName,
        lastName = lastName,
        avatar = null
    )

    constructor(id: String) : this(id, firstName = "Jone", lastName = "Doe $id")

    init {
        println("I'am Alive!!!")
    }



    companion object Factory {
        private var lastId: Int = -1
        fun makeUser(fullName: String?): User{
            lastId++

            val (firstName, lastName)=Utils.parseFullName(fullName)
            return User(id = "$lastId", firstName = firstName, lastName = lastName)
        }
    }
}


//    fun printMe(): Unit {
//        println(
//            """
//        id: $id
//        firstName: $firstName
//        lastName: $lastName
//        avatar: $avatar
//        raiting: $raiting
//        respect: $respect
//        LastVisit: $LastVisit
//        isOnline : $isOnline
//        """.trimIndent()
//        )
//    }