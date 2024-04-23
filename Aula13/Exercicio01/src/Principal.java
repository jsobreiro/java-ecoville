public class Principal {

    public static void main(String[] args) {

        int op;
        String nome;

        do {

            System.out.println("\nMENU");
            System.out.println("1) Cadastrar Evento");
            System.out.println("2) Buscar evento");
            System.out.println("3) Listar todos os eventos");
            System.out.println("0) Sair");
            System.out.print("Informe uma opção: ");
            op = Console.lerInt();

            switch (op) {
                case 1:

                    System.out.println("\nNovo evento:");

                    System.out.print("Nome: ");
                    nome = Console.lerString();
                    System.out.print("Data (dd/mm/yy): ");
                    String data = Console.lerString();
                    System.out.print("Local: ");
                    String local = Console.lerString();

                    Evento evento = new Evento(nome, data, local);
                    GerenciadorDeEventos.adicionarEvento(evento);

                    System.out.println("\nEvento cadastrado com sucesso!");

                    break;

                case 2:

                    System.out.print("\n\nInforme o nome do evento que deseja encontrar: ");
                    nome = Console.lerString();

                    GerenciadorDeEventos.buscarEvento(nome);

                    break;

                case 3:

                    System.out.println("\nEventos cadastrados:");
                    GerenciadorDeEventos.listarTodosOsEventos();

                    break;

                case 0:

                    System.out.println("\nO Sistema foi finalizado...");
                    break;

                default:

                    System.out.println("\nOpção inválida. Retornando ao menu...");
                    break;
            }

        } while (op != 0);

    }

}