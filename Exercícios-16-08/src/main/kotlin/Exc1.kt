fun main () {

    /*
    Faça um programa que receba três inteiros e diga qual deles é o maior.
     */

    println("Insira um número inteiro qualquer: ")
    val num1 = readln().toInt()
    println("Insira um número inteiro qualquer: ")
    val num2 = readln().toInt()
    println("Insira um número inteiro qualquer: ")
    val num3 = readln().toInt()

    if (num1 > num2 && num1>num3){

        println("O maior número dentre os três é: $num1")
    }else if (num2 > num1 && num2>num3){
        println("O maior número dentre os três é: $num2")
    }else
        println("O maior número dentre os três é: $num3")


}