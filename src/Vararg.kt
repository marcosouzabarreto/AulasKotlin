fun media2(vararg medias:Float) {
    var soma = 0f
    if (medias.isNotEmpty()){

        for (media in medias){
            soma += media
        }
    }
    println("A media e : ${soma/medias.size}")
}

fun <T> media(vararg valores:T){
    for (valor in valores){
        println(valor)
    }
}

fun main() {

    media(1f, 2, "", "Nao", true)
}