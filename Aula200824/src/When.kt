fun main() {
    println("Escolha uma opção de 1 a 5")
    var opcaoEscolhida:Int = readln().toInt()

    when(opcaoEscolhida){
        1-> println("Opção 1 escolhinda")
        2-> println("Opção 2 escolhinda")
        3-> println("Opção 3 escolhinda")
        4-> println("Opção 4 escolhinda")
        5-> println("Opção 5 escolhinda")
    }
}