package reallyOOP
class Constants private constructor(){

    companion object {
        val TABLE = "Pessoa"

        fun teste() {
            println("Sou um metodo estatico")
        }
    }
    object VENDAS {
        val TABLE_NAME = "Vendas"

        object COLUNAS {
            val ID = "ID"
            val TOTAL = "TOTAL"
        }
    }


}
fun main(){
    println(Constants.TABLE)
    Constants.teste()
    println(Constants.VENDAS.COLUNAS.ID)
}