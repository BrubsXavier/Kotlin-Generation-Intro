fun main(args: Array<String>) {

    /*

	  Elaborar um programa que efetue a leitura sucessiva de valores numéricos e
apresente no final o total do somatório, a média e o total de valores lidos. O programa
deve fazer as leituras dos valores enquanto o usuário estiver fornecendo valores
positivos. Ou seja, o programa deve parar quando o usuário fornecer um valor
negativo.
	 */

    var num: Int = 0
    var soma: Int =  0
    var valores: Int = 0

    while(num >= 0){

        println("Digite um número: ")
        num = readln().toInt()

        if(num >= 0){
            soma += num
            valores += 1
        }
    }

    println("Somatório final: $soma")
    println("Média final : ${soma/valores}")
    println("Total de valores processados: $valores")
}