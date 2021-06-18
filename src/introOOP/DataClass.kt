package introOOP
class Quadrado(val area: Float)

data class Triangulo(val area:Float)


fun main() {
    val q1 = Quadrado(12f)
    val q2 = Quadrado(12f)

    val t1 = Triangulo(11f)
    val t2 = Triangulo(11f)

    println(q1.hashCode())
    println(q2.hashCode())

    println(t1.hashCode())
    println(t2.hashCode())

    // var q3 = q2.copy() -- vai dar erro
    var t3 = t2.copy()
}