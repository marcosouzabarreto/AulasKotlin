package introOOP
class Field {
    var numero:Int = 0


        get() {
            println("Get foi chamado")
            return field
        } set(value) {
        println("Set foi chamado")
        field = value
    } 
}

fun main(){
    val campo:Field = Field()
    println(campo.numero)
    campo.numero = 12
    println(campo.numero)
}