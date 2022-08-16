import kotlin.math.sqrt

fun main () {

    /*
    Faça um programa em que permita a entrada de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado.
     */

    print("Insira um número inteiro qualquer: ")
    val num = readln().toInt()

    if (num % 2 == 0){

        val raiz = sqrt(num.toDouble())
        println("O número inserido é par! E sua raiz quadrada é: $raiz")
    }else{

        val potencia = num * num
        println("O número inserido é ímpar! E quando elevado ao quadrado tem como resultado: $potencia")

    }

}