fun main () {

    /*
    Faça um programa que pegue um número do teclado e calcule a soma de todos os
números de 1 até ele. Ex.: o usuário entra 7, o programa vai mostrar 28, pois
1+2+3+4+5+6+7=28.
     */

    var num: Int
    var result: Int = 0

    println("Digite um número: ")
    num = readln().toInt()

    do{
        result += num
        num --

    }while(num > 0)

    print("A soma de todos os números é de:  $result")
}