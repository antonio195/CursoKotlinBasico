/*
*   Conversor de medidas.
*   1 pé = 12 polegadas
*   1 Jarda = 3 pés
*   1 Milha = 1.760 jardas
*
*   Converter pés em polegadas = pes * 12
*   Converter pés em jardas = pes / 3
*   Converter pés em milhas = jardas / 1760
*
*   Outras possibilidades
*
*   - Distâncias, Peso e Velocidade
*
*/

fun main() {

    println("Conversor de medidas. \n\n")
    println("Informe a quantidade de pés: ")
    val pes: Int = readLine()!!.toInt()

    var polegadas = converterPesEmPolegadas(pes)
    println("$pes pés valem $polegadas polegadas. ")

    var jardas = converterPesEmJardas(pes)
    println("$pes pés valem $jardas jardas. ")

    var milhas = converterPesEmMilhas(jardas)
    println("$pes pés valem $milhas milhas. ")


}

//Converter pés em polegadas = pes * 12
fun converterPesEmPolegadas(pes: Int): Int {
    return pes * 12
}

//Converter pés em jardas = pes / 3
fun converterPesEmJardas(pes: Int): Double{
    return pes / 3.0
}

//Converter pés em milhas = jardas / 1760
fun converterPesEmMilhas(jardas: Double): Double{
    return jardas / 1760.0
}