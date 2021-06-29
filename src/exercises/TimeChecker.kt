package exercises

import java.lang.Exception

fun actualHour(a:MutableList<String>):Boolean{
    var hours:String
    var postPoints = false
    var minutes:String
    for (time in a){

        postPoints = false
        minutes = ""
        hours = ""

        for (num in time){
            if (num == ':'){
                postPoints = true
                continue
            }
            if (!postPoints) {
                hours += num
            } else {
                minutes += num
            }

        }

        var intHours = 0
        var intMinutes = 0
        try {
            intHours = hours.toInt()
            intMinutes = minutes.toInt()
        } catch (e:Exception){
            println("Digite o horario de forma certa")
            return false
        }


        println("horas: $intHours, minutos $intMinutes")
        if (intHours>23||intHours<0||intMinutes>59||intMinutes<0) return false

    }
    return true
}
fun main(){
    val a:MutableList<String> = mutableListOf("12:52", "12:63")
    val x = actualHour(a)
    print(x)
}