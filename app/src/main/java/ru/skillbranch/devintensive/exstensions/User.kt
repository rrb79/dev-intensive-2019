package ru.skillbranch.devintensive.exstensions

import ru.skillbranch.devintensive.models.User
import ru.skillbranch.devintensive.models.UsersView
import ru.skillbranch.devintensive.utils.Utils

fun User.toUserView(): UsersView {
    val nickName = Utils.transliteration("$firstName $lastName"," ")
    val initials = Utils.toInitials(firstName,lastName)
    val status = if (lastVisit == null) "Еще ни разу не был"
    else if (isOnline) "online"
    else "Последний раз был ${lastVisit!!.humanizeDiff()}"

    return UsersView(
        id,
        fullName = "$firstName $lastName",
        nickName = nickName,
        initiials = initials,
        avatar = avatar,
        status = status
    )



}
