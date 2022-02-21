import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.time.format.DateTimeParseException

fun main() {

    val data = getDataHoraFormatada()

    println(data)

}

fun getDataHoraFormatada(): String{

    val data = LocalDateTime.now()

    val dataFormatada = DateTimeFormatter.ofPattern("HH:mm:ss")

    return data.format(dataFormatada)

}