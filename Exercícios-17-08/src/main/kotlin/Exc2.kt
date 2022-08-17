fun main() {

    /*
    Ler 10 números e imprimir quantos são pares e quantos são ímpares.
     */

    var npar = 0
    var nimpar = 0

    for (i in 1..10) {


        print("Insira um número inteiro qualquer: $i")
        val num = readln().toInt()

        if (num % 2 == 0) {

            npar += 1

        } else {

            nimpar += 1
        }
    }
    println("A quantidade de números pares é de: $npar")
    println("A quantidade de números ímpares é de: $nimpar")

}