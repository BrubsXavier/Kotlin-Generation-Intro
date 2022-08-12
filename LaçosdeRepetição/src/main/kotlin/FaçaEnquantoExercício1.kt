fun main () {

    /*
    Faça um programa que mostre uma contagem na tela de 233 a 456, só que
contando de 3 em 3 quando estiver entre 300 e 400 e de 5 em 5 quando não estiver.
     */
    var contador = 228

        do{
            contador += 5

            println("$contador")

            if (contador >= 300 && contador <= 400){
            contador += 3 }
            }while(contador <= 456)

}
