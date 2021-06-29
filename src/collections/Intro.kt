package collections

fun main(){
    // List - array, Set, Hashmap
    val l1 = listOf("Madrid", "Sao Paulo", "Tokyo") // Lista fixa
    val l2 = mutableListOf("Madrid", "Sao Paulo", "Tokyo") // Tenho funcoes add, remove

    val a1 = arrayListOf("Madrid", "Sao Paulo", "Tokyo") // Herda do Java

    val s1 = setOf("Madrid", "Sao Paulo", "Tokyo", "Tokyo") // Nao repete valores, size=3
    val s2 = mutableSetOf("Madrid", "Sao Paulo", "Tokyo", "Tokyo") // Mesma coisa q setOf, so que mutavel

    val h1 = hashMapOf<String, String>(Pair("Key", "Value"), Pair("Franca", "Paris"))
    //Hashmap precisa de uma chave para pegar o valor, nesse caso
    //na entrada de um pais sai a sua capital

    //hashMapOf nao tem um "mutableHashMapOf" pois ja e mutavel, utilizando o
    //h1["Chave"] = "Valor"

    val m1 = mapOf(Pair("Key", "Value")) // Basicamente um hashmap constante
    val m2 = mutableMapOf(Pair("Key", "Value")) // Basicamente a mesma coisa que o HashMap

}
