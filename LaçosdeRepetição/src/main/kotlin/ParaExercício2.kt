fun main () {

    /*
     Desenvolver um sistema que efetue a soma de todos os números ímpares que são
múltiplos de três e que se encontram no conjunto dos números de 1 até 500.
     */
    var soma: Int = 0
    var i: Int

    for (i in 1..500){

        if(i % 2 == 1 && i % 3 == 0)

        soma += i
    }

    print("A soma de todos os números é: $soma")


}