package Encapsulamento

class Carro() {
    private var velocidade: Int = 0

    fun acelerar() {
        velocidade += 10
    }

    fun freiar() {
        velocidade -= 10
    }

    fun getVelocidade(): Int {
        return velocidade
    }
}

// chamada no main
fun main() {
    val meuCarro = Carro()
    meuCarro.acelerar()
    meuCarro.acelerar()
    meuCarro.freiar()

    val velocidadeAtual = meuCarro.getVelocidade()
    println("A velocidade atual do carro é: $velocidadeAtual")
}