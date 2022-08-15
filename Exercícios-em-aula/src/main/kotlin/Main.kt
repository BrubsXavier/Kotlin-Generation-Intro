import java.time.LocalDate
import java.time.format.DateTimeFormatter

fun main() {


    /*

    O usuário digitará sua idade e o programa deverá printar o ano em que ele nasceu.

     */
    val ano = LocalDate.now().year

    print("Insira a idade que completa este ano: ")
    val idade = readln().toInt()

    print("Seu ano de nascimento é: ${ano - idade}")

}