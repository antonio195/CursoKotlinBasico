/*
*   Calcular a área do triângulo
*   Área = ( base * altura) / 2
*/

fun main() {

    println("Calcular área do triângulo\n")

    println("Digite a base do triangulo: ")
    val base : Int = readLine()!!.toInt()

    println("Digite a altura do triangulo: ")
    val altura : Int = readLine()!!.toInt()

    val calculo = calcularAreaDoTriangulo(base, altura)
    println("A área do triangulo é: $calculo")

}

fun calcularAreaDoTriangulo(base: Int, altura: Int): Int {
    return (base * altura) / 2
}