fun main(){

    println("Digite um número: ")

    val numero = readLine()!!.toInt()

    val saidaFormatada = String.format("%06d", numero)

    val soma =  saidaFormatada.toInt() + saidaFormatada.toInt()

    println("Número formatado: $numero")

    println("Padrão de formatação: $saidaFormatada")

    println("Soma: $soma")

}