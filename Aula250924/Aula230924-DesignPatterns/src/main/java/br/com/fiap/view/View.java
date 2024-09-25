package br.com.fiap.view;

import br.com.fiap.dao.InvestimentoDao;
import br.com.fiap.dao.InvestimentoDaoImpl;
import br.com.fiap.entity.Investimento;
import br.com.fiap.entity.TipoInvestimento;
import br.com.fiap.exception.CommitException;
import br.com.fiap.exception.IdNaoencontradoException;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

import javax.persistence.EntityManager;

public class View {

    public static void main(String[] args) {
        //Obter o entity manager
        EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();

        //Instanciar o DAO do investimento
        //GenericDao<Investimento, Integer> dao = new GenericDaoImpl<Investimento, Integer>(em) {}
        InvestimentoDao dao = new InvestimentoDaoImpl(em);

        //Instanciar um investimento (implementar um construtor naa classe)
        Investimento investimento = new Investimento("CDB TranquiloCoin", 1000001.0, TipoInvestimento.CRIPTO);

        //Cadastrar(CREATE->INSERT)
        try{
            dao.salvar(investimento);
            dao.commit();
            System.out.println("Investimento cadastrado!");
        } catch (CommitException e) {
            System.out.println(e.getMessage());
        }

        //Pesquisar(READ->SELECT)
        try{
            Investimento busca = dao.buscar(1);
            System.out.println(busca.getNome());

            //Atualizar um investimento(UPDATE->UPDATE)
            busca.setValor(5000000.0);
            dao.salvar(busca);
            dao.commit();
            System.out.println("Investimento atualizado!");
        } catch (CommitException e) {
            System.out.println(e.getMessage());
        } catch (IdNaoencontradoException e) {
            System.out.println(e.getMessage());
        }
        /*
        //remover um investimento(DELETE->DELETE)
        try{
            dao.remover(2);
            dao.commit();
            System.out.println("Investimento removido!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
         */
    }
}
