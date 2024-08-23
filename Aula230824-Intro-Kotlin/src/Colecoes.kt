fun main(){
    //listof -> imutável, tamanho fixo, não pode ser alterado
    var estadosBr = listOf("RS", "SC", "PR")

    //arrayListof -> mut´´avel, tamanho n fixo, e pode ser alterado
    var nomesAlunos = arrayListOf("Larissa", "Luna", "Deyckson")
    nomesAlunos.add("Lucas")
    nomesAlunos.remove("Larissa")
    //remover pelo indice
    nomesAlunos.removeAt(2)

    var idadeAlunos = hashSetOf(10, 15,22,30,30, 55, 58)
    println(idadeAlunos)

    var mapa = hashMapOf(
        "Leão" to "Rei da floresta",
        "Cachorro" to "Melhor amigo do homem",
        "Gato" to "arranha"
    )

    mapa.put("Panda","só hiberna")
    mapa.remove("Gato")

    for(item in mapa){
        println(mapa.values)
    }
}