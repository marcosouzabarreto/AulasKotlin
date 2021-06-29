package reallyOOP

open class Maquinas(val marca:String) {
    fun minhaMarca(){
        println("A minha marca é $marca")
    }
}
class Computador (marca:String, val nucleos:Int): Maquinas(marca){

    fun ligar(){}
    fun processar(){}
}

fun main(){
    val computador = Computador("MSI", 16)
    computador.minhaMarca()
}