//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
open class Pessoa{
    //Atributos, propriedades
    var nome:String = ""

    //Métodos da Pessoa
    fun andar(){
        println("${nome} está andando...")
    }
}

class Aluno:Pessoa(){
    var matricula:Int = 0

    //Métodos
    fun estudar(){
        println("${nome} está estudando...")
    }
}

fun main() {

}