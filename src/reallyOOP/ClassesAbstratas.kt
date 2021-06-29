package reallyOOP
abstract class Mamifero(var nome:String) {
    var peso:Float = 0f
    abstract fun falar()
    open fun dormir(){
        println("Estou dormindo")
    }
    fun printaPeso(){
        println("peso  $peso kg")
    }
}
class Cachorro(nome: String, peso:Float) : Mamifero(nome) {
    init {
        this.peso = peso
    }

    override fun falar() {
        println("au au")

    }
}
class Gato(nome: String) : Mamifero(nome) {

    override fun dormir(){
        println("Vou dormir o dia todo")
    }

    override fun falar() {
        println("miau")
    }
}
fun main(){
    val c:Cachorro = Cachorro("Bolt", 14f)
    c.dormir()
    c.falar()

}