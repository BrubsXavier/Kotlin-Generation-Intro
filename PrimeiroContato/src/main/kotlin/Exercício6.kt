fun main () {

    /*
Elabore um sistema que dada a idade de um nadador classifique-o em uma das seguintes
categorias:
Infantil A = 5 a 7 anos
Infantil B = 8 a 11 anos
Juvenil A = 12 a 13 anos
Juvenil B = 14 a 17 anos
Adultos = Maiores de 18 anos
     */

    var idade: Int

            print("Insira a idade do atleta inscrito: ")
    idade = readln().toInt()

    if(idade >= 5 && idade <= 7) {
        println("O atleta está inscrito na categoria INFANTIL A!")

    }else if(idade >= 8 && idade <= 11){

        println("O atleta está inscrito na categoria INFANTIL B")

    }else if(idade >= 12 && idade <= 13){
        println("O atleta está inscrito na categoria JUVENIL A")

    }else if(idade >= 14 && idade <= 17){
        println("O atleta está inscrito na categoria JUVENIL B")

    }else if(idade >= 18){
        println("O atleta está inscrito na categoria ADULTO")
    }
}