public class Principal {

    private static void exibirMenu() {

        System.out.println("\nSistema Clientes - Menu" + 
                            "\n1) Cadastrar" + 
                            "\n2) Buscar" + 
                            "\n3) Remover" +
                            "\n4) Listar todos" +
                            "\n0) Sair");

    }

    private static void cadastrarCliente() {

        System.out.println("\nInforme os dados:");
        String nome = Console.lerString("Nome: ");
        String email = Console.lerString("E-mail: ");
        String endereco = Console.lerString("Endereço: ");

        Cliente novoCliente = new Cliente(nome, email, endereco);

        CadastroClientes.adicionarCliente(novoCliente);

        System.out.println("\nCliente cadastrado com sucesso!");

    }

    private static void buscarCliente() {
        
        
        try {

            CadastroClientes.verificarListaVazia();

            String email = Console.lerString("Informe o e-mail do cliente que deseja encontrar: ");

            Cliente clienteEncontrado = CadastroClientes.buscarCliente(email);

            System.out.println("\nCliente encontrado: " 
                                + clienteEncontrado.exibirDadosCliente());

        } catch (Exception exception) {

            System.out.println(exception.getMessage());
        }
          

    }

    private static void removerCliente() {

        try {

            CadastroClientes.verificarListaVazia();

            String email = Console.lerString("Informe o e-mail do cliente que deseja encontrar: ");

            Cliente clienteEncontrado = CadastroClientes.buscarCliente(email);

            CadastroClientes.removerCliente(clienteEncontrado);

            System.out.println("\nCliente foi removido com sucesso!");

        } catch (Exception exception) {

            System.out.println(exception.getMessage());
        }


    }

    private static void listarTodosClientes() {

        try {

            CadastroClientes.verificarListaVazia();

            System.out.println("\nClientes Cadastrados:");

            for(Cliente tempCliente : CadastroClientes.getListaClientes()) {

                System.out.println(tempCliente.exibirDadosCliente());
            }


        } catch (Exception exception) {

            System.out.println(exception.getMessage());
        }

    }

    private static void verificarOpcaoMenu(int opcao) {

        switch (opcao) {
            case 1:
                cadastrarCliente();
                break;

            case 2:
                buscarCliente();
                break;
            
            case 3: 
                removerCliente();
                break;
            
            case 4:
                listarTodosClientes();
                break;
             
            case 0:
                System.out.println("\nSistema finalizado\n");
                System.exit(0);
                break;
        
            default:
                System.out.println("\nOpção inválida, digite novamente.");
                break;
        }


    }

    public static void main(String[] args) {

        while (true) {
            
            exibirMenu();
            int opcao = Console.lerInt("Informe sua opção: ");
            verificarOpcaoMenu(opcao);

        }


    }

}
