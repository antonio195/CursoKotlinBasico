import kotlin.math.PI

fun main() {

    println("Digite o valor do circulo: ")

    var circulo : Int = readLine()!!.toInt()

    var valorDoRaio = circulo / (2* PI)

    println("O circulo mede: $circulo\n")
    println("Valor do Raio do Círculo: $valorDoRaio\n")

}