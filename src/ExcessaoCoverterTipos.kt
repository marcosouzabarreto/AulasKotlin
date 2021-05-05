import java.lang.Exception

fun main() {

    try {
        println("Aashudh".toInt())
    } catch (e: NumberFormatException) {
        println("Nao pode ser formatado para numero")
    } catch (e: Exception){
        println("Erro desconhecido")
    } finally {
        println("Chegou aqui")
    }

}