fun main () {

    /*
    Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99.
     */

    var maisq50 = 0
    var menosq21 = 0
    var pessoastotal = 0

    var idade = 0

    while(idade != -99){

        print("Insira a sua idade: ")
        idade = readln().toInt()

        if(idade in 0..20){
            menosq21 += 1
            pessoastotal += 1

        } else if(idade > 50){
            maisq50 += 1
            pessoastotal += 1

        } else if(idade >= 0) {
            pessoastotal += 1

        }
    }

    println()
    println("O número de pessoas participantes na pesquisa foi de: $pessoastotal")
    println("O número exato de pessoas com idade inferior a 21 anos foi de: $menosq21")
    println("O número exato de pessoas com idade superior a 50 anos foi de: $maisq50")

}