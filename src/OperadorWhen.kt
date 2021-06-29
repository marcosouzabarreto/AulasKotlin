fun operacao(a:Int, b:Int, c:String){
    /*return when(c){
        "Soma" -> a + b

        "Subtracao" -> a - b

        else -> 0
    } */
    when {
        a > 0 && b > 0 -> {
            println("Numeros positivos")
        }
    }
    //Range - Intervalo de valores .. (Nesse caso checa se (a>0 && a<100)
    when (a) {
        in 1..99 -> {
            println("Seculo")
        }
    }
}

fun main(){
    operacao(10, 10, "Soma")
    operacao(10, 10, "Subtracao")
    operacao(10, 10, "Soma")

}