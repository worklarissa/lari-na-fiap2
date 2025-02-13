//Função Concat
/*const nome = "Larissa"
const sobreNome = "Abreu"

const nomeCompleto = nome.concat(sobreNome)

console.log(nomeCompleto)*/

const alunos = ["Felipe", "Ana", "Pedro", "Beatriz", "Miguel", "Enzo"]
const professores = ["Fernando", "Douglas", "Léo"]

//Método para adicionar um item no Array: PUSH
/*professores.push("João")
console.log(professores)*/

//Ordenando o vetor
/*alunos.sort()
console.log(alunos)*/

//Deletando item do array pelo indice
/*delete alunos[0]
console.log(alunos)*/

//Removendo o último item do array - POP()
/*alunos.pop()
console.log(alunos)*/

//Removendo o primeiro item do array - SHIFT()
/*alunos.shift()
console.log(alunos)*/

//Método para remover a partir de determinado indice
/*alunos.splice(2)
console.log(alunos)*/

//ForEach
/*alunos.forEach(function(nome,indice){
    console.log(nome,indice)
})*/

/*const alunos2 = [
    {nomeAluni: "Murillo", nota: 9, participativo: true},
    {nomeAluni: "Lucas", nota: 6, participativo: false},
    {nomeAluni: "Larissa", nota: 8, participativo: false},
    {nomeAluni: "Fabiola", nota: 7, participativo: true}
]

//metodo filter para filtrar os elementos do array e exibir apenas os alunos que tem nota maior ou igual a 8
console.log(alunos2.filter(function(RetornaNotasBoasParticipativos){

    return RetornaNotasBoasParticipativos.nota >= 8 && RetornaNotasBoasParticipativos.participativo == true

}))


//metodo filter para filtrar os elementos do array e exibir apenas os alunos que são participativos mas usando arrow function
console.log(alunos2.filter((RetornaParticipativos) => RetornaParticipativos.participativo == true))

//Função que recebe dois números e retorna soma, subtração, multiplicação e divisão desses números em um objeto
function operacoesMat(num1,num2){
    return{
        soma:num1+num2,
        subtracao:num1-num2,
        multiplicacao:num1*num2,
        divisao:num1/num2

    };
}*/

//Exercício
function positivoNegativo(x){
    return x>0?"Positivo": x<0?"Negativo" : "Zero"
    
}
console.log(positivoNegativo())













