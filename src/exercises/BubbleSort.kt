package exercises

fun sortShit(a:MutableList<Int>){
    var done = 0
    var temp:Int
    var j = 0
    val len = a.size
    while(true){
        done = 0
        while (j<len-1){

            if (a[j]>a[j+1]){
                temp = a[j]
                a[j] = a[j+1]
                a[j+1] = temp
                done++
            }
            j++
        }

        j = 0
        if (done==0) break
    }
}
fun main(){

    val a = mutableListOf<Int>(9, 8, 7, 6, 5, 4, 3, 2, 1)
    sortShit(a)
    println(a)


}