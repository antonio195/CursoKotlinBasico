fun main() {

    var a = 10
    var b = 20

    var i = 23

    if ((i == null) || (a <= b)) {}

    if ((i == null) || (a <= b)) {
        naoProcessar()
    }

}

fun processar() {
    println("true")
}

fun naoProcessar() {
    println("false")
}