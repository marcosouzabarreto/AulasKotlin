package collections

data class Receita(val nome: String, val calorias: Int, val ingredientes: List<Ingredientes> = listOf())
data class Ingredientes(val nome: String, val quantidade: Int)
fun hasIngredient(list:List<Ingredientes>, name:String): Boolean = list.filter { it.nome == name }.any()

fun main() {

    // Cria lista de dados
    val data = listOf(
            Receita(
                    "Lasanha", 1200,
                    listOf(
                            Ingredientes("Farinha", 1),
                            Ingredientes("Presunto", 5),
                            Ingredientes("Queijo", 10),
                            Ingredientes("Molho de tomate", 2),
                            Ingredientes("Manjerição", 3)
                    )
            ),
            Receita("Panqueca", 500),
            Receita("Omelete", 200),
            Receita("Parmegiana", 700),
            Receita("Sopa de feijão", 300),
            Receita(
                    "Hamburguer", 2000,
                    listOf(
                            Ingredientes("Pão", 1),
                            Ingredientes("Hamburguer", 3),
                            Ingredientes("Queijo", 1),
                            Ingredientes("Catupiry", 1),
                            Ingredientes("Bacon", 3),
                            Ingredientes("Alface", 1),
                            Ingredientes("Tomate", 1)
                    )
            )
    )

    //Tenho receitas na lista?
    println("Tenho receitas? ${if (data.any()) "sim" else "nao"}")

    //Quantas receitas tenho?
    println("Tenho ${data.size} receitas")

    //Primeira receita
    println("A primeira receita e ${data.first().nome}, e a ultima é ${data.last().nome}")

    //Qual a soma de calorias
    val calorias = data.sumOf { it.calorias }
    println("As receitas tem $calorias calorias")

    //Primeiras 2 receitas
    val firstTwo = data.take(2)

    for (x in firstTwo.withIndex()) {
       println("A posicao ${x.index + 1} é ${x.value.nome}")
    }

    //Sei como fazer panqueca? e sushi?
    val knowPancake = data.filter { it.nome == "Panqueca" }.any()
    val knowSushi = data.filter { it.nome == "Sushi" }.any()

    println("Sei panqueca? ${if (knowPancake) "sim" else "nao"} ")
    println("Sei sushi? ${if (knowSushi) "sim" else "nao"} ")

    //Quais sao as comidas com mais de 500 calorias?
    print("as comidas com mais de 500 calorias sao: ")
    data.filter { it.calorias > 500 }.forEach { println(it.nome) }

    //Par (chave, valor) de comidas com mais de 500 calorias
    data.filter { it.calorias > 500 }
            .map { Pair(it.nome, it.calorias)  }
            .forEach { println("${it.first} : ${it.second}") }

    //Quais receitas possui farinha como ingrediente
    data.filter { hasIngredient(it.ingredientes, "Farinha") }.forEach { println(it.nome) }
}