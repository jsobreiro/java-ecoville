public class Principal {

    public static void main(String[] args) {

        int op;
        String nome;
        String email;
        String endereco;

        do {

            System.out.println("\nSistema Clientes - Menu");
            System.out.println("1) Cadastrar");
            System.out.println("2) Buscar");
            System.out.println("3) Remover");
            System.out.println("4) Listar todos");
            System.out.println("0) Sair");
            System.out.print("Informe uma opção: ");
            op = Console.lerInt();

            switch (op) {
                case 1:

                    System.out.println("\nInforme os dados:");
                    System.out.print("Nome: ");
                    nome = Console.lerString();
                    System.out.print("E-mail: ");
                    email = Console.lerString();
                    System.out.print("Endereço: ");
                    endereco = Console.lerString();

                    CadastroClientes.adicionarCliente(new Cliente(nome, email, endereco));

                    System.out.println("\nCliente cadastrado com sucesso!");

                    break;

                case 2:

                    System.out.println("\nInforme o e-mail do cliente que deseja encontrar: ");
                    email = Console.lerString();

                    CadastroClientes.buscarCliente(email);

                    break;

                case 3:

                    System.out.println("\nInforme o e-mail do cliente que deseja remover: ");
                    email = Console.lerString();

                    CadastroClientes.excluirCliente(email);

                    break;

                case 4:

                    System.out.println("\nClientes cadastrados:");
                    CadastroClientes.listarTodosOsClientes();

                    break;

                case 0:

                    System.out.println("\nO sistema foi finalizado...");
                    break;

                default:

                    System.out.println("\nOpção inválida. Digite novamente.");
                    break;
            }

        } while (op != 0);

    }

}
