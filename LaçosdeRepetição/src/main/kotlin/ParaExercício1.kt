fun main () {

    /*
     A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes,
coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:
a) média do salário da população;
b) média do número de filhos;
c) maior salário;
d) percentual de pessoas com salário até R$100,00.
     */

    var mediasal = 0.0
    var mediafilhos = 0.0
    var maiorsal = 0.0
    var cemsal = 0.0
    var sal = 0.0
    var filhos = 0.0
    var filhostotal = 0.0
    var porcentagemmenorsal = 0.0


    for(i in 1 .. 20){
        println("Salário do $i º habitante: ")
       sal = readln().toDouble()

        println("Número de filhos $i º habitante: ")
        filhos = readln().toDouble()

        mediasal += sal
        mediafilhos += filhostotal

        if(sal > maiorsal){
            maiorsal = sal
        }

        if(sal <= 100){
            porcentagemmenorsal += 1.0
        }

        cemsal += 1
    }
    mediasal /= 20
    mediafilhos = filhostotal / 20
    porcentagemmenorsal = (porcentagemmenorsal / 20) * 100

    println("A média salarial é de: R$ $mediasal")
    println("A média de filhos é de: $mediafilhos")
    println("O maior salário é de: R$ $maiorsal")
    println("O percentual de salários até 100 reais é de: $porcentagemmenorsal%")
}