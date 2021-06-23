package reallyOOP
interface Funcionario {
    fun calculaBonus()

}

class Gerente : Funcionario {
    override fun calculaBonus() {

    }

}

class Tecnico : Funcionario {
    override fun calculaBonus() {

    }
}
class Analista : Funcionario {
    override fun calculaBonus() {

    }
}
fun main(){
    val f1:Funcionario = Gerente()
    val f2:Funcionario = Tecnico()
    val f3:Funcionario = Analista()

    calculo(f1)
    calculo(f2)
    calculo(f3)

}

fun calculo(funcionario: Funcionario){
     funcionario.calculaBonus()
}
