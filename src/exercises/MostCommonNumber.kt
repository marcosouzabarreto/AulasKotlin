package exercises

fun main(){
    val a = mutableListOf("12", "13", "7", "245", "1233")
    val b = mutableListOf<Int>()
    for (p in 0..9) {
        b.add(p, 0)
    }
    for (string in a) {
        for (letter in string) {

            if (letter.digitToInt()==0) b[0]++
            if (letter.digitToInt()==1) b[1]++
            if (letter.digitToInt()==2) b[2]++
            if (letter.digitToInt()==3) b[3]++
            if (letter.digitToInt()==4) b[4]++
            if (letter.digitToInt()==5) b[5]++
            if (letter.digitToInt()==6) b[6]++
            if (letter.digitToInt()==7) b[7]++
            if (letter.digitToInt()==8) b[8]++
            if (letter.digitToInt()==9) b[9]++

        }
    }
    var max = 0
    b.forEach {
        if (it > max) max = it
    }
    val x = mutableListOf<String>()
    var count = 0
    var c = 0
    b.forEach {
        if (it == max){
            x.add(count, c.toString())
            count++
        }
    c++

    }
    print(x)
}