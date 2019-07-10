package ru.skillbranch.devintensive.utils

import ru.skillbranch.devintensive.extensions.getFirstLetter
import ru.skillbranch.devintensive.extensions.getTranlitLetter

object Utils {
    fun stringOrNull(anyText: String?): String? {
        var sn = anyText.toString().replace(" ", "")
        if (sn.length == 0) {
            return null
        }
        return sn
    }

    fun parseFullName(fullName: String?): Pair<String?, String?> {
        //  var fullName: String?=fullName?.toRegex(" ")
        val parts: List<String>? = fullName?.split(" ")
        val firstName = parts?.getOrNull(0)
        val lastName = parts?.getOrNull(1)


        return stringOrNull(firstName) to stringOrNull(lastName.toString())

    }


    fun transliteration(payload: String, divider: String? = " "): String {
        var stringTranslate: String = ""
        for (char in payload) {
            val letter = char.toString()
            if (letter == " ") {
                stringTranslate = stringTranslate + divider
            } else {
                stringTranslate = stringTranslate + getTranlitLetter(letter)
            }
        }
        return stringTranslate
    }


    fun toInitials(firstName: String?, lastName: String?): String? {
        var strReturn: String = "${getFirstLetter(firstName)}${getFirstLetter(lastName)}"
        strReturn = strReturn.replace(" ", "")
        println(strReturn.length)
        if (strReturn.length == 0) {
            return null
        }
        return strReturn
    }

}

