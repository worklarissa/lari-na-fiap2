 package br.com.fiap.view;

 import br.com.fiap.dao.ClienteDao;
 import br.com.fiap.dao.ClienteDaoIMPL;
 import br.com.fiap.entity.Cliente;
 import br.com.fiap.entity.Genero;
 import br.com.fiap.exception.IdNaoEncontradoException;

 import javax.persistence.EntityManager;
 import javax.persistence.EntityManagerFactory;
 import javax.persistence.Persistence;
 import java.util.Calendar;

 public class TesteDao {
    //Implementar o CRUD com DAO
    public static void main(String[] args){
        //Criar a fabrica
        EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");

        //Criar o Entity mananger
        EntityManager em = fabrica.createEntityManager();

        //Instanciar o DAO
        ClienteDao dao = new ClienteDaoIMPL(em);

        //Cadastrar um Cliente(CREATE -> INSERT)
        Cliente cliente = new Cliente("Ruan", Calendar.getInstance(), 100.0, "1231313", Genero.MASCULINO);

        try{
            dao.cadastrar(cliente);
        }catch (){

        }
        //Pesquisar um cliente(READ-> SELECT)
        try{
            Cliente busca = dao.buscarPorId(5);
            System.out.println(busca.getNome());
        }catch (IdNaoEncontradoException e){
            System.out.println(e.getMessage());
        }

        //Atualizar um Cliente (UPDATE -> UPDATE)
        try{
            cliente.setNome("Denner");
            cliente.setGenero(Genero.MASCULINO);
            dao.atualizar(cliente);
            dao.commit();
            System.out.println("Cliente atualizdo!");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        //Remover um cliente (DELETE->DELETE)
        try{
            dao.remover(7);
            dao.commit();
            System.out.println("Cliente removido!");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}