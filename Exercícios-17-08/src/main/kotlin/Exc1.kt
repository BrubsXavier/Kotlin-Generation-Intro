fun main() {

    /*
    Informar todos os números de 1000 a 1999 que quando divididos por 11
obtemos resto = 5.
     */

    println("Os números entre 1000 e 1999 que quando divididos por 11 têm resto 5 são: ")

    for (i in 1000..1999)

        if (i % 11 == 5) {

            println("$i")

        }

}