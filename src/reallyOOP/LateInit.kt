package reallyOOP

class Pessoa {
    lateinit var nome:String

    fun geradorDeNome(){
        nome = "uhasd"
    }

}

fun main(){
    val p = Pessoa()
    p.geradorDeNome()
}