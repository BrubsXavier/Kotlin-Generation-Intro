fun main () {

    /*
     Receber valores de base e altura de um triângulo e verificar se são valores válidos
(positivos maiores que zero). Em caso afirmativo, calcular a área do triângulo.
     */

    var base: Double
    var altura: Double
    var area: Double

    println("Defina a base do triângulo: ")
    base = readln().toDouble()

    println("Defina a altura do triângulo: ")
    altura = readln().toDouble()


    if(base >= 0 && altura >= 0){
        area = (base * altura)/2

        println("A área deste triângulo é de: $area")

    }else{
        println("Error: números devem ser positivos!")

    }
}