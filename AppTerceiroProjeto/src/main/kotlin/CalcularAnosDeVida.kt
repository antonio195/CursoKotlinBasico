/*
Como calcular quantos de vida uma pessoa tem?
 */

fun main() {

    val anoDeNascimento = 1999
    val anoAtual = 2022
    val resultadoCalculo = calcularAnosDeVida(anoAtual, anoDeNascimento)

    imprimirResultados(anoAtual, anoDeNascimento, resultadoCalculo)

}

fun calcularAnosDeVida(anoAtual: Int, anoDeNascimento: Int): Int {

    val anosDeVida = anoAtual - anoDeNascimento

    return anosDeVida
}

fun imprimirResultados(anoAtual: Int, anoDeNascimento: Int, resultadoCalculo: Int) {

    println("Ano de Nascimento: $anoDeNascimento")
    println("Ano Atual: $anoAtual")
    println("Idade atual: ${calcularAnosDeVida(anoAtual, anoDeNascimento)}")
    println("Você tem: $resultadoCalculo anos de vida!")

}