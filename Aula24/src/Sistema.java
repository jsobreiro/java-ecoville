import java.io.IOException;

public class Sistema {

    private static void exibirMenu() {

        System.out.println("\nGERENCIADOR DE JOGOS");
        System.out.println("1) Cadastrar");
        System.out.println("2) Buscar");
        System.out.println("3) Listar todos");
        System.out.println("4) Apagar");
        System.out.println("0) Sair");
        System.out.print("Sua opção: ");

    }

    private static void verificarOpcao(int op) {

        switch (op) {
            case 1:
                salvarJogo();
                break;

            case 2:
                buscarJogo();
                break;
            
            case 3:
                listarTodos();
                break;

            case 4:
                apagarJogo();
                break;

            case 0: 
                System.out.println("\nO Programa foi finalizado...");
                break;
        
            default:
                System.out.println("\nOpção inválida Digite novamente:");
                break;
        }

    }

    private static void salvarJogo() {

        System.out.println("\nNovo Jogo:");
        
        System.out.print("Informe o código: ");
        int codigo = Console.lerInt();

        System.out.print("Informe o título: ");
        String titulo = Console.lerString();

        System.out.print("Informe o gênero: ");
        String genero = Console.lerString();

        Jogo jogo = new Jogo(codigo, titulo, genero);

        try {

            GerenciadorJogos.salvarJogo(jogo);

        } catch (IOException e) {

            System.out.println(e.getMessage());
        }


    }

    private static void buscarJogo() {

        System.out.println("\nBuscar Jogo");
        System.out.print("Informe o código: ");
        int codigo = Console.lerInt();

        try {

            Jogo jogo = GerenciadorJogos.buscarJogo(codigo);
            System.out.println("\nJogo encontrado: " + jogo);

        } catch (Exception e) {

            System.out.println(e.getMessage());
        }

    }

    private static void listarTodos() {

        System.out.println("\nJogos Cadastrados:");

        try {

            for (Jogo tempJogo : GerenciadorJogos.listarJogos())
            {
                System.out.println(tempJogo);
            }
        
        } catch (Exception e) {

            System.out.println(e.getMessage());
        }

    }

    private static void apagarJogo() {

        System.out.println("\nApagar Jogo");
        System.out.print("Informe o código do jogo que deseja apagar: ");
        int codigo = Console.lerInt();

        try {

            GerenciadorJogos.apagarJogo(codigo);
            System.out.println("\nJogo excluído com sucesso!");
        
        } catch (Exception e) {
            
            System.out.println(e.getMessage());
        }

    }

    public static void executar() {

        int op;
        do {
            
            exibirMenu();
            op = Console.lerInt();
            verificarOpcao(op);

        } while(op != 0);

    }


    
}
