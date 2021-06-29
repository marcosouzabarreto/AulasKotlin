package reallyOOP

open class Machine(val marca:String) {
    open fun minhaMarca(){
        println("A minha marca é $marca")
    }
}
class Computer (marca:String, val nucleos:Int): Machine(marca){

    override fun minhaMarca(){
        println("A marca do pc é $marca")
    }

    fun ligar(){}
    fun processar(){}

    fun overload(i:Int) = println("Overload 1")
    fun overload(i:String) = println("Overload 2")


}

fun main(){
    val computador = Computer("MSI", 16)
    computador.minhaMarca()
    computador.overload("a")
    computador.overload(2) 
}