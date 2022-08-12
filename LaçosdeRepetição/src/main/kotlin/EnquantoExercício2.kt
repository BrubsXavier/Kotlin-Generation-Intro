fun main () {

    /*
    Obtenha um número digitado pelo usuário e repita a operação de multiplicar ele por
três (imprimindo o novo valor) até que ele seja maior do que 100. Ex.: se o usuário
digita 5, deveremos observar na tela a seguinte sequência: 5 15 45 135.
     */

    var num: Int
    var maiorq100: Int = 0

    println("Insira um número: ")
    num = readln().toInt()

    while(num <= 100 || maiorq100 == 0){
        println("$num")

        if(num > 100){
            maiorq100 = 1
        }

        num = num * 3

    }
}