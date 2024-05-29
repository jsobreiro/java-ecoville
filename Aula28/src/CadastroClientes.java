import java.util.ArrayList;
import java.util.List;

public class CadastroClientes {

    private static List<Cliente> listaClientes = new ArrayList<>();

    public static void adicionarCliente(Cliente cliente)  {
        
        try {
            listaClientes.add(cliente);
        
        } catch (NullPointerException nullPointerException) {
            
            System.out.println(nullPointerException.getMessage());
        }
    }

    public static Cliente buscarCliente(String email) throws Exception {

        for (Cliente tempCliente : listaClientes) {

            if (tempCliente.getEmail().equals(email)) {
                return tempCliente;
            }
        }

        throw new Exception("\nCliente com o e-mail " + email + " não licalizado.");

        
    }

    public static List<Cliente> getListaClientes() {

        return listaClientes;
        
    }

    public static void removerCliente(Cliente cliente) {

        listaClientes.remove(cliente);
    }

    public static void verificarListaVazia() throws ListaVaziaException{
        if (listaClientes.isEmpty()) {
            throw new ListaVaziaException("\nNão há clientes cadastrados");
        }
    }

}
