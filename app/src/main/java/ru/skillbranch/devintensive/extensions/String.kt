package ru.skillbranch.devintensive.extensions

fun getFirstLetter(anyText: String?): String? {
//   var strToProcess: String? = anyText!!.replace(" ", "")
    var strToProcess: String? = anyText
    println("mind $strToProcess")
    if (strToProcess == null) {
        strToProcess = ""
    } else {
        if (strToProcess?.length != 0) {
            strToProcess = strToProcess!![0]?.toString().toUpperCase()
        } else strToProcess = ""
    }
    return strToProcess
}

fun getTranlitLetter(anyLetter: String? = null): String? {
    val map = mapOf<String, String>(
        "а" to "a",

        "б" to "b",

        "в" to "v",

        "г" to "g",

        "д" to "d",

        "е" to "e",

        "ё" to "e",

        "ж" to "zh",

        "з" to "z",

        "и" to "i",

        "й" to "i",

        "к" to "k",

        "л" to "l",

        "м" to "m",

        "н" to "n",

        "о" to "o",

        "п" to "p",

        "р" to "r",

        "с" to "s",

        "т" to "t",

        "у" to "u",

        "ф" to "f",

        "х" to "h",

        "ц" to "c",

        "ч" to "ch",

        "ш" to "sh",

        "щ" to "sh'",

        "ъ" to "",

        "ы" to "i",

        "ь" to "",

        "э" to "e",

        "ю" to "yu",

        "я" to "ya"
    )

    var letter = anyLetter?.toLowerCase()
    var big: Boolean = false
    if (anyLetter != letter) {
        big = true
    }



    if (!map.containsKey(letter)) {
        letter = anyLetter
    } else {
        letter = map.getValue("$letter").toString()
        if (big) {
            if (letter.length == 2) {
                letter = letter[0].toUpperCase().toString() + letter[1]

            } else {
                letter = letter.toUpperCase()
            }

        }
    }

    return letter
}




