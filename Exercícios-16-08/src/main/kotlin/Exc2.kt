fun main () {

    /*
    Faça um programa que entre com três números e coloque em ordem crescente.
     */

    println("Insira um número inteiro qualquer: ")
    val num1 = readln().toInt()
    println("Insira um número inteiro qualquer: ")
    val num2 = readln().toInt()
    println("Insira um número inteiro qualquer: ")
    val num3 = readln().toInt()

    if (num1 > num2 && num1 >num3 && num2 > num3){
        println("A ordem crescente dos números é de: $num3, $num2, $num1")
    }else if (num2 > num1 && num2 >num3 && num1 > num3){
        println("A ordem crescente dos números é de: $num3, $num1, $num2")
    }else if (num1 > num2 && num1 >num3 && num3 > num2){
        println("A ordem crescente dos números é de: $num2, $num3, $num1")
    }else if (num2 > num1 && num2 >num3 && num3 > num1){
        println("A ordem crescente dos números é de: $num3, $num1, $num2")
    }else if (num3 > num1 && num3 >num2 && num2 > num1){
        println("A ordem crescente dos números é de: $num1, $num2, $num3")
    }else{
        println("A ordem crescente dos números é de: $num2, $num1, $num3")
    }



}