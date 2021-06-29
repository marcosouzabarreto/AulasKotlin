package introOOP
enum class Prioridade1 {
    BAIXA, MEDIA, ALTA
}
enum class Prioridade2 (val id:Int){
    BAIXA(1){
        override fun toString(): String {
            return "Super baixa, nao se preocupe"
        }
    }, MEDIA(2), ALTA(5)
}

class Aviso (val texto:String, val p:Prioridade2)

fun main() {

    Aviso("Alarme", Prioridade2.BAIXA)

    for (p in Prioridade2.values()){
        println("$p - ${p.id} - ${p.ordinal}")
    }
}