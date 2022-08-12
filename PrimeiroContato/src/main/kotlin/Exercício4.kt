fun main () {

    /*
    Faça um sistema que leia um número inteiro e mostre uma mensagem indicando se este
    número é par ou ímpar, e se é positivo ou negativo.

    PS: O resto da divisão de qualquer número por 2 determina se é ímpar ou par.
     */

    var num: Int

        print("Insira um número qualquer: ")
        num = readln().toInt()

    if(num % 2 == 0){
        println("Par!")
    }else{
        println("Ímpar!")
    }
    if(num >=0){
        println("Positivo!")
    }else{
        println("Negativo!")
    }
}