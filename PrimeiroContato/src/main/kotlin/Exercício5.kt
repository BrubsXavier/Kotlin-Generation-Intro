fun main () {

    /*
     A Secretaria de Meio Ambiente que controla o índice de poluição mantém 3 grupos de
indústrias que são altamente poluentes do meio ambiente. O índice de poluição aceitável
varia de 0,05 até 0,25. Se o índice sobe para 0,3 as indústrias do 1º grupo são intimadas a
suspenderem suas atividades, se o índice crescer para 0,4 as industrias do 1º e 2º grupo são
intimadas a suspenderem suas atividades, se o índice atingir 0,5 todos os grupos devem ser
notificados a paralisarem suas atividades. Faça um sistema que leia o índice de poluição
medido e emita a notificação adequada aos diferentes grupos de empresas.

    PS: indice - grau de poluição atmosférica
     */

    var indice: Double


            print("Insira o grau de poluição: ")
    indice = readln().toDouble()

    if(indice >= 0.3 &&  indice < 0.4)
    {
        println("Os grupos 1 deve parar o funcionamento imediatamente.")

    }
    if(indice >= 0.4 && indice < 0.5)
    {
        println("Os grupos 1 e 2 devem parar o funcionamento imediatamente.")

    }

    if(indice >= 0.5){
        println("Todas as indústrias devem parar o funcionamento imediatamente.")


    }
}