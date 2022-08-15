import kotlin.math.pow

fun main () {

    /*
     Faça um programa em que o usuário digite o diâmetro de um círculo e calcule a área e o perímetro dele
     */

    val pi = 3.14

    println("Digite o diâmetro do círculo: ")
    val diametro = readln().toDouble()

    val raio = diametro/2
    val area = pi * raio.pow(2)

    println("A área do círculo é de: ${"%.2f".format(area)}")
    println("O perímetro é de: ${"%.2f".format(diametro * pi)}")
}