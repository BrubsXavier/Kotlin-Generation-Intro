fun main() {

    /*
    Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
trabalhar com Collection do tipo List do Kotlin para manipular os dados desse estoque, o
programa deverá atender as seguintes funcionalidades:

Armazenar dados da List
Remover dados da list;
Atualizar dados da list.
Apresentar todos os dados da list.
     */

    while (true) {
        println()
        println("1 - Adicionar um produto")
        println("2 - Remover um produto")
        println("3 - Atualizar produtos")
        println("4 - Exibir produtos")
        println("5 - Sair")
        println()
        println("Escolha uma das opções acima: ")

        when (readln().toInt()) {
            1 -> {
                println("Digite o nome do produto: ")
                val produto = readln()
                addProduto(produto)
            }
            2 -> removeProduto()
            3 -> atualizaProduto()
            4 -> listProdutos()
            5 -> {
                println("Obrigada por utilizar nosso sistema: ")
                break
            }
            else -> println("Opção Inválida")
        }
    }

}