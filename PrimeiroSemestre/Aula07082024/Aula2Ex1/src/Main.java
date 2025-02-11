//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Correção do exercício-criando objetos da classe Produto
        Produto produto1 = new Produto("Sabão", "OMO",9.5,1);
        Produto produto2 = new Produto("Farofa", "Andorinha",15.60,1);
        Produto produto3 = new Produto("Arroz", "Namorado",29.90,5);

        //Exemplo para alterar valores dos objetos criados
        produto1.setMarca("Ariel");
        produto2.setPreco(19.90);
        produto3.setPeso(3.5);

        //Correção do exercício-imprimindo informações dos objetos, com os valores já alterados
        System.out.println("O produto " + produto1.getNome() + ", da marca " + produto1.getMarca() + "\nTem " + produto1.getPeso() + " quilos e está por:" + produto1.getPreco());
        System.out.println("O produto " + produto2.getNome() + ", da marca " + produto2.getMarca() + "\nTem " + produto2.getPeso() + " quilos e está por:" + produto2.getPreco());
        System.out.println("O produto " + produto3.getNome() + ", da marca " + produto3.getMarca() + "\nTem " + produto3.getPeso() + " quilos e está por:" + produto3.getPreco());
        }
    }
