fun main() {
    println("Informe as medidas de um retângulo(base e altura.)")
    println("Quantos é a medida de base de retãngulo?")
    val base = readln().toDouble()
    println("Quantos é a medida de altura de retãngulo?")
    val altura = readln().toDouble()

    var area = base * altura

    println("Área do retângulo é: $area")
}