import java.util.ArrayList;

public abstract class FolhaPagamento {

    private static ArrayList<Funcionario> listaFuncionarios = new ArrayList<>();

    public static void cadastrar(Funcionario f) throws NullPointerException {
        
        if (f == null) {
            throw new NullPointerException("\nFuncionário não pode ser nulo!");
        }
        
        listaFuncionarios.add(f);
    }

    public static ArrayList<Funcionario> getListaFuncionarios() throws Exception {

        if (listaFuncionarios.isEmpty()) {
            throw new Exception("\nNão há funcionários cadastrados!");
        }

        return listaFuncionarios;
    }



}
