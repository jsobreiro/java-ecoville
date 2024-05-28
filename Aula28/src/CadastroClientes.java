import java.util.ArrayList;
import java.util.List;

public class CadastroClientes {

    private static List<Cliente> clientes = new ArrayList<>();

    public static void adicionarCliente(Cliente c) {
        clientes.add(c);
    }

    public static void buscarCliente(String email) {

        for (Cliente tempCliente : clientes) {

            if (tempCliente.getEmail().equals(email)) {
                System.out.println("\nCliente encontrado:");
                tempCliente.exibirDadosCliente();
                return;
            }
        }

        System.out.println("\nCliente com o e-mail " + email + " não licalizado.");
    }

    public static void listarTodosOsClientes() {

        if (clientes.size() == 0) {
            System.out.println("\nNenhum cliente cadastrado.");
            return;
        }

        System.out.println("\nClientes cadastrados:");

        for (Cliente tempCliente : clientes) {

            tempCliente.exibirDadosCliente();
        }
    }

    public static void excluirCliente(String email) {

        for (Cliente tempCliente : clientes) {

            if (tempCliente.getEmail().equals(email)) {
                clientes.remove(tempCliente);
                System.out.println("\nCliente " + email + " removido com sucesso");
                return;
            }
        }

        System.out.println("\nCliente com o e-mail " + email + " não licalizado.");

    }

}
