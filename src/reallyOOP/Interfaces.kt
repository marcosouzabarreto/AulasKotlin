package reallyOOP

interface Maquina {

    var threads:Int // Nao posso inicializar

    fun ligar()

    fun desligar(){
        println("Desligando")
    }

}

interface interface1 {
    fun ola(){
        println("Ola 1")
    }
}
interface interface2 {
    fun ola() {
        println("Ola 2")
    }
}
class Pc () : interface1, interface2 {
    override fun ola(){
        super<interface2>.ola()
    }
}