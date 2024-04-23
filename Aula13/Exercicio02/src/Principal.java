public class Principal {

    public static void main(String[] args) {

        int op;
        String titulo;
        String autor;
        String disponibilidade;
        ControleBiblioteca matriz = new ControleBiblioteca();
        ControleBiblioteca filial = new ControleBiblioteca();

        do {

            System.out.println("\nBIBLIOTECA - Menu Principal");
            System.out.println("1) Cadastrar livro para Matriz");
            System.out.println("2) Cadastrar livro para Filial");
            System.out.println("3) Buscar livro");
            System.out.println("4) Mostrar acervo Matriz");
            System.out.println("5) Mostrar acervo Filial");
            System.out.println("0) Sair");
            System.out.print("Informe uma opção: ");
            op = Console.lerInt();

            switch (op) {
                case 1:

                    System.out.println("\nNovo livro para Matriz:");

                    System.out.print("Título: ");
                    titulo = Console.lerString();

                    System.out.print("Autor: ");
                    autor = Console.lerString();

                    System.out.print("Disponibilidade: ");
                    disponibilidade = Console.lerString();

                    matriz.adicionarLivro(new Livro(titulo, autor, disponibilidade));

                    System.out.println("\nLivro adicionado ao acerto da matriz");

                    break;

                case 2:

                    System.out.println("\nNovo livro para Filial:");

                    System.out.print("Título: ");
                    titulo = Console.lerString();

                    System.out.print("Autor: ");
                    autor = Console.lerString();

                    System.out.print("Disponibilidade: ");
                    disponibilidade = Console.lerString();

                    filial.adicionarLivro(new Livro(titulo, autor, disponibilidade));

                    System.out.println("\nLivro adicionado ao acerto da filifal");

                    break;

                case 3:

                    System.out.print("\nInforme o título do livro que deseja buscar: ");
                    titulo = Console.lerString();

                    System.out.println("\nResultado da busca na Matriz:");
                    matriz.buscarLivro(titulo);

                    System.out.println("\nResultado da busca na Filial:");
                    filial.buscarLivro(titulo);

                    break;

                case 4:

                    System.out.println("\nAcervo de livros da Matriz:");
                    matriz.listarTodosOsLivros();
                    break;

                case 5:

                    System.out.println("\nAcervo de livros da Filial:");
                    filial.listarTodosOsLivros();
                    break;

                case 0:

                    System.out.println("\nO sistema foi finalizado");
                    break;

                default:

                    System.out.println("\nOpção inválida. Digite novamente.");
                    break;
            }

        } while (op != 0);

    }

}
