package exercises

import kotlin.text.StringBuilder

fun reverseUsingSB(str: String): String {
    return StringBuilder(str).reverse().toString()
}

fun reverseUsingLoop(str:String): String {
    var reversedString = ""

    var i = str.length-1
    while (i>=0){
        reversedString += str[i]
        i--
    }
    return reversedString

}