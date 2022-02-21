fun main() {


    val arrayElementos = Array<String>(size = 15, init = { index -> "Elementos do Array" })

    println(arrayElementos.size)

    for (i in arrayElementos) {
        println(i)
    }


}

