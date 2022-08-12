fun main () {

    /*
     Desenvolva um sistema em que:
Leia 4 (quatro) números;
Calcule o quadrado de cada um;
Se o valor resultante do quadrado do terceiro for &gt;= 1000, imprima-o e finalize;
Caso contrário, imprima os valores lidos e seus respectivos quadrados.
     */

    var num1: Int
    var num2: Int
    var num3: Int
    var num4: Int
    var r1: Int
    var r2: Int
    var r3: Int
    var r4: Int

        print("Insira o primeiro número: ")
        num1 = readln().toInt()
        println("Insira o segundo número: ")
        num2 = readln().toInt()
        println("Insira o terceiro número: ")
        num3 = readln().toInt()
        println("Insira o quarto número: ")
        num4 = readln().toInt()

        r1 = num1 * num1
        r2 = num2 * num2
        r3 = num3 * num3
        r4 = num4 * num4

    if(r3 >= 1000){
        print("$num3 x $num3 = $r3")
    }else{
        println("$num1 x $num1 = $r1")
        println("$num2 x $num2 = $r2")
        println("$num3 x $num3 = $r3")
        println("$num4 x $num4 = $r4")
    }


}