fun main () {

    /*
Elabore um sistema que leia as variáveis C e N, respectivamente código e número de
horas trabalhadas de um operário. E calcule o salário sabendo-se que ele ganha R$ 10,00
por hora. Quando o número de horas exceder a 50 calcule o excesso de pagamento
armazenando-o na variável E, caso contrário zerar tal variável. A hora excedente de
trabalho vale R$ 20,00. No final do processamento imprimir o salário total e o salário
excedente.
     */

    var c: Int
    var n: Int
    var s: Int
    var e: Int

        print("Inserir código de funcionário: ")
        c = readln().toInt()
        println("Inserir número de horas trabalhadas: ")
        n = readln().toInt()

    if (n > 50){
        e = n - 50
        s = e *20 + 500

    }else {
        e = 0
        s = n * 10
    }

    println("O número de horas extras é de: $e")
    println("O valor final do salário é de: $s")

}