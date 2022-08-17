fun main () {

    /*
    Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.
     */

    var total = 0

    do{
        print("Digite um numero: ")
        val num = readln().toInt()

        total += num

    }while(num != 0)

    println("A soma de todos os números digitados é de: $total")
}

