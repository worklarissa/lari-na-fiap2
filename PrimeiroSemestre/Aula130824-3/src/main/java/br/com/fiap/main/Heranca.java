import br.com.fiap.beans.Analista;
import br.com.fiap.beans.Engenheiro;
import br.com.fiap.beans.Estagiario;
import br.com.fiap.beans.Gerente;

public class Heranca {
    public static void main(String[] args) {
        Gerente g = new Gerente();
        g.setNome(g.getNome("Lucas"));
        g.printNome();
        g.calcSalario();
        g.printSalario();
    }

    Engenheiro e = new Engeheiro();

    {
        e.setNome(estag.getNome("Murillo"));
        e.printNome();
        e.calcSalario();
        e.printSalario();
    }

    Analista a = new Analista();

    {
        a.setNome(a.getNome("Pedro"));
        a.printNome();
        a.calcSalario();
        a.printSalario();
    }

    Estagiario estag = new Estagiario();

    {
        estag.setNome(estag.getNome("Larissa"));
        estag.printNome();
        estag.calcSalario();
        estag.printSalario();
    }
}

