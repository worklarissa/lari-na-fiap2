//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
open class Cidadao{
    fun direitoDeveres(){
        println("Todo cidadão tem direito e deveres")
    }
}
interface Professor{
    fun passarConcursos()

}



class ProfFernando{

}

class ProfGuilherme:Cidadao(), Professor{
    override fun passarConcursos() {
        println("Foi aprovado em concurso no RN")
    }
}

fun main() {

    var profGui =ProfGuilherme()
    profGui.direitoDeveres()
    profGui.passarConcursos()
}