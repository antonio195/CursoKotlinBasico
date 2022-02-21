fun main() {

    var a = 10
    var b = 20

    var i = 23

    if(i >= 60){
        executarProcessamento()
    }else{
        naoExecutarProcessamento()
    }

}

fun executarProcessamento(){
    println("prrocessando")
}
fun naoExecutarProcessamento(){
    println("sem processamento")
}