
public class Principal {

    public static void main(String[] args) {
        
        int op;
        Jogo jogo; 
        String titulo;
        String genero;
        String estudio;
        int ano;
        String nomeProprietario;

        System.out.println("\nCOLEÇÃO DE JOGOS\n");
        System.out.print("Informe o nome do proprietário da coleção: ");
        nomeProprietario = Console.lerString();

        Colecao minhaColecao = new Colecao(nomeProprietario);

        do {

            System.out.println("\nColeção de jogos de " + nomeProprietario);
            System.out.println("1) Cadastrar jogo");
            System.err.println("2) Buscar jogo");
            System.out.println("3) Listar todos os jogos");
            System.out.println("0) Finalizar programa");
            System.out.print("Informe uma opção: ");
            op = Console.lerInt();

            switch (op) {
                case 1:
                    
                    System.out.println("\nCadastro de jogo:");
                    System.out.print("Título: ");
                    titulo = Console.lerString();

                    System.out.print("Gênero: ");
                    genero = Console.lerString();

                    System.out.print("Esúdio: ");
                    estudio = Console.lerString();

                    System.out.print("Ano de lançamento: ");
                    ano = Console.lerInt();

                    jogo = new Jogo(titulo, genero, estudio, ano);

                    minhaColecao.cadastrarJogo(jogo);

                    System.out.println("\nJogo cadastrado com sucesso!");

                    break;

                case 2:

                    System.out.println("\nBuscar jogo:");
                    System.out.print("Informe o título do jogo: ");
                    titulo = Console.lerString();

                    System.out.println(minhaColecao.buscarJogo(titulo));

                    break;

                case 3:

                    minhaColecao.listarJogos();

                    break;

                case 0:

                    System.out.println("\nO programa foi finalizado...");
                    break;

                default:

                    System.out.println("\nOpção inválida. Digite novamente");
                    break;
            }

            System.out.println(); // quebra de linha adicional

        } while (op != 0);



    }

}
