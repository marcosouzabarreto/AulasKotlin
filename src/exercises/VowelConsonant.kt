package exercises

fun countVowels(phrase:String):Int{
    val VOWELS = "aeiou"
    var vowels = 0

    for (letter in phrase.lowercase()){
        if (letter in VOWELS){
            vowels++
        }
    }
    return vowels
}
fun countConsonants(phrase: String):Int{
    val CONSONANTS = "bcdfghjklmnpqrstvwxyz"
    var consonants = 0

    for (letter in phrase.lowercase()){
        if(letter in CONSONANTS){
            consonants++
        }
    }
    return consonants
}
fun countVowelsFilter(string: String):Int {
    return string.filter { it.lowercaseChar() in "aeiou"}.length
}