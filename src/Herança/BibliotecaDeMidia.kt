package Herança

open class ItemMultimidia(
    val titulo: String,
    val duracao: Int
) {
    open fun reproduzir() {
        println("Reproduzindo $titulo")
    }
}

class Filme(titulo: String, duracao: Int, val diretor: String) : ItemMultimidia(titulo, duracao) {
    override fun reproduzir() {
        println("Assistindo $titulo, sua duração de $duracao e é dirigito por $diretor")
    }
}

class Musica(titulo: String, duracao: Int, val cantor: String) : ItemMultimidia(titulo, duracao){
    override fun reproduzir() {
        println("Ouvindo $titulo, sua duração é de $duracao e é cantada por $cantor")
    }
}

class Livro(titulo: String, val escritor: String, val anoDePublicacao: Int) : ItemMultimidia(titulo, 0) {
    override fun reproduzir() {
        println("Lendo $titulo do escritor $escritor no ano de $anoDePublicacao")
    }
}

fun main() {
    val filme = Filme("Os vingadores", 160,"Anthony Russo")
    val musica = Musica("LSD", 2, "Diplo")
    val livro = Livro("Apocalipse segundo Fausto", "Carlos Neto", 1998)

    val items = listOf(filme, musica, livro)

    for (item in items) {
        item.reproduzir()
    }
}