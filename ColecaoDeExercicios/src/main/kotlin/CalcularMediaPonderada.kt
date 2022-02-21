/*
*   Este programa calcula a média ponderada entre vários valores.
*
*   nota1, nota2, nota3
*   peso1, peso2, peso3
*
*   peso1 = 2, peso2 = 3, peso3 = 4
*
*   mediaPonderada = ( (nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3) ) / (peso1 + peso2 + peso3)
*/

fun main() {

    println("Calcular a média ponderada.\n")

    println("Digite a primeira nota: ")
    var nota1:Double     = readLine()!!.toDouble()

    println("Digite a segunda nota: ")
    var nota2:Double = readLine()!!.toDouble()

    println("Digite a terceira nota: ")
    var nota3:Double = readLine()!!.toDouble()

    val calculo = calcularMediaPonderada(nota1, nota2, nota3)

    println("A média ponderada é: $calculo")
}

fun calcularMediaPonderada(nota1:Double, nota2:Double, nota3:Double): Double {

    val peso1 = 2
    val peso2 = 3
    val peso3 = 4

    return ( (nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3) ) / (peso1 + peso2 + peso3)

}
