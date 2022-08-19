val estoque = mutableListOf<String>()

fun addProduto(produto: String) {
    if (produto != "") {
        estoque.add(produto)
        println("$produto foi adicionado com sucesso ao estoque!")
    } else {
        println("Produto Inválido")
    }
}

fun removeProduto() {

    while (true) {
        println("Agora digite um item para ser excluído do sistema: ")
        val produto = readln()

        if (estoque.contains(produto)) {
            estoque.remove(produto)
            println("$produto foi excluído com sucesso!")
            break
        } else {
            println("$produto não faz parte do estoque.")
        }
    }
}

fun atualizaProduto() {

    println("Digite o nome do produto que deseja atualizar: ")
    val produto = readln()

    if (estoque.contains(produto)) {
        val pos = estoque.indexOf(produto)
        println("Digite o novo nome do produto: ")
        estoque[pos] = readln()

        println("Item atualizado com sucesso!")
    } else {
        println("O produto $produto não existe no estoque atual")
    }
}

fun listProdutos() {
    println()
    println(estoque)
}