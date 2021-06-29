package introOOP

class Pessoa (private var nome:String) {
    private var ano:Int? = null

    constructor(nome:String, ano:Int):this(nome){
        this.ano = ano
    }


    fun saudacao(){
        println("ola, meu nome e $nome")
    }
}

fun main() {
    val pessoa2:Pessoa = Pessoa("Jose")
    val pessoa:Pessoa = Pessoa("Marco", 2002)

}
