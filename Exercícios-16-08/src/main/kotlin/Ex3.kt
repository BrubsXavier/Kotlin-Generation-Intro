fun main () {

    /*
    Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
categoria ela se encontra:
 10-14 infantil
 15-17 juvenil
 18-25 adulto
     */

    println("Insira sua idade: ")
    val idade = readln().toInt()

    when (idade){

        in 10..14 -> println("Você está na categoria infantil")
        in 15..17 -> println("Você está na categoria Juvenil")
        in 18..25 -> print("Você está na categoria adulto")
        else -> println("Você não está em nenhuma categoria. Idade inadequada!")
    }
}