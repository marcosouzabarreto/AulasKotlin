package introOOP
class Field {
    var numero:Int = 0
    var a:Float = 0f

        get() {
            println("Get foi chamado")
            return field
        } set(value) {
        println("Set foi chamado")
        field = value
    } 
}

fun main(){
    val campo = Field()
    println(campo.a)
    campo.a = 12f
    println(campo.a)
}