fun main () {

    /*
    Construa um sistema para ler uma variável numérica N e imprimi-la somente se a mesma
for maior que 100, caso contrário imprimi-la com o valor zero.
     */

    var N: Int

            print("Inserir número: ")
            N = readln().toInt()

    if(N < 100) {

        println("O número é: $N")
    }else{
        println("O número é: 0")
    }
}