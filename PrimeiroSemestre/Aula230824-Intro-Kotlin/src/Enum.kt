
enum class StatusPedido{
    APROVADO,REPROVADO,PENDENTE
}




class Pedido{
     var status:StatusPedido = StatusPedido.APROVADO
}

fun main(){
    //Enum -> É um tipo de dado que consiste em um conjunto de constantes
    val pedido1 = Pedido()
    println(pedido1.status)

}