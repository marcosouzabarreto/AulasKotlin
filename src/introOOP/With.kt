package introOOP

class Maquina (var marca:String){
    fun ligar(){}
    fun processar(){}
    fun desligar(){}
}
fun main(){
    val m:Maquina = Maquina("teste")

    with(m){
        ligar()
        processar()
        desligar()
    }

    m.ligar()
    m.processar()
    m.desligar()


}