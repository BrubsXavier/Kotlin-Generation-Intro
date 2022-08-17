fun main() {

    /*
    Escrever um programa que receba vários números inteiros no teclado. E no
final imprimir a média dos números múltiplos de 3. Para sair digitar
0(zero).
    */

    var multiplos = 0.0
    var soma = 0
    var media = 0.0

    do {

        print("Escreva um número inteiro qualquer: ")
        val num = readln().toInt()

        if (num % 3 == 0 && num != 0) {
            multiplos += 1
            soma += num

        }

    } while (num != 0)

    media = soma / multiplos

    println("Os múltiplos de 3 que foram digitados são: $multiplos")
    println("A média desses múltiplos é de: ${"%.2f".format(media)}")


}