package Herança

open class Personagem(
    val nome: String,
    val pontosDeVida: Int,
    val ataque: Int,
    val defesa: Int
) {
    open fun atacar() {
        println("$nome está atacando")
    }
}

class Jogador(
    nome: String,
    pontosDeVida: Int,
    ataque: Int,
    defesa: Int,
) : Personagem(
    nome,
    pontosDeVida,
    ataque,
    defesa
) {
    override fun atacar() {
        println("$nome, ataca!")
    }
}

class Inimigo(
    nome: String,
    pontosDeVida: Int,
    ataque: Int,
    defesa: Int
) : Personagem(
    nome,
    pontosDeVida,
    ataque,
    defesa
) {
    override fun atacar() {
        println("$nome, usa aumento de defesa: +$defesa foram adicionados a defesa do Javali")
    }
}

class NPC(
    nome: String,
    val fala: String
) : Personagem(
    nome,
    0,
    0,
    0,
) {
    fun falar() {
        println("$nome diz:\"$fala\"")
    }
    override fun atacar() {
        println("Você não pode bater em um NPC!")
    }
}


fun main() {
    val jogador = Jogador("Seiko", 1000,300,200)
    val inimigo = Inimigo("Javali", 1500, 90,170)
    val npc = NPC("Vendedor", "Oque quer compar? O que quer vender?")

    val personagens = listOf(jogador, inimigo, npc)

    for (listas in personagens) {
        listas.atacar()
        if (listas is NPC) {
            listas.falar()
        }
    }
}