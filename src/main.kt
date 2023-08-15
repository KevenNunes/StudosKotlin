open class Personagem(val nome: String, val pontosVida: Int) {
    open fun atacar() {
        println("$nome está atacando!")
    }
}

class Jogador(nome: String, pontosVida: Int, val nivel: Int) : Personagem(nome, pontosVida) {
    override fun atacar() {
        println("$nome (Nível $nivel) está atacando com sua espada!")
    }
}

class Inimigo(nome: String, pontosVida: Int, val tipo: String) : Personagem(nome, pontosVida) {
    override fun atacar() {
        println("$nome ($tipo) está atacando com garras afiadas!")
    }
}

class NPC(nome: String, pontosVida: Int, val dialogo: String) : Personagem(nome, pontosVida) {
    fun falar() {
        println("$nome diz: \"$dialogo\"")
    }

    override fun atacar() {
        println("Você não pode bater em um NPC!")
    }
}

fun main() {
    val jogador = Jogador("Herói", 100, 5)
    val inimigo = Inimigo("Monstro", 50, "Orc")
    val npc = NPC("Tavern Keeper", 80, "Bem-vindo à taverna!")

    val personagens = listOf(jogador, inimigo, npc)

    for (personagem in personagens) {
        personagem.atacar()
        if (personagem is NPC) {
            personagem.falar()
        }
    }
}
