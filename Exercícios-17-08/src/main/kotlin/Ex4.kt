fun main () {

    /*Uma empresa desenvolveu uma pesquisa para saber as características
    psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
    era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
    (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
    agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
    pessoas, calcule e mostre:

     o número de pessoas calmas;
     o número de mulheres nervosas;
     o número de homens agressivos;
     o número de outros calmos;
     o número de pessoas nervosas com mais de 40 anos;
     o número de pessoas calmas com menos de 18 anos.

     */


    var individuos = 0
    var calma = 0
    var nervosa = 0
    var agressivo = 0
    var nbcalmos = 0
    var pessoasnervosasmaisq40 = 0
    var pessoascalmasmenosq18 = 0

    while(individuos < 150){

        print("Insira a sua idade ")
        val idade = readln().toInt()

        print("Insira seu sexo considerando 1 para Feminino, 2 para Masculinos e 3 para Outros")
        val sexo = readln()

        print("Voce é: 1 - Calmo, 2 - Nervoso, 3 - Agressivo? ")
        val personalidade = readln()

        if(personalidade == "1"){
            calma++
        }
        if(sexo == "1" && personalidade == "2"){
            nervosa++
        }
        if(sexo == "2" && personalidade == "3"){
            agressivo++
        }
        if(sexo == "3" && personalidade == "1"){
            nbcalmos++
        }
        if(personalidade == "2" && idade > 40){
            pessoasnervosasmaisq40++
        }
        if(personalidade == "1" && idade < 18){
            pessoascalmasmenosq18++
        }
        individuos++
    }
    println("$individuos pessoas foram entrevistadas")
    println("O número de pessoas calmas foi de: $calma")
    println("O número de mulheres nervosas foi de: $nervosa")
    println("O número de homens agressivos foi de: $agressivo")
    println("O número de pessoas que se declararam como 'Outro' e são calmo foi de: $nbcalmos")
    println("O número de pessoas acima de 40 anos que são nervosas foi de: $pessoasnervosasmaisq40")
    println("O número de pessoas abaixo de 18 anos que são calmas foi de: $pessoascalmasmenosq18")
}