fun main() {
    println("Digite um num")
    val num = readln().toInt()

    var result = num % 5

    when{
        result == 0 -> println("È multiplo por 5")

        else->{
            println("Não é multiplo por 5")
        }
    }
}