package controller;

import java.util.ArrayList;

import model.entities.ListaLivros;
import model.entities.Livro;
import model.persistence.GerenciadorArquivo;
import view.Console;

public class Sistema {

    static ArrayList<Livro> listaLivros = ListaLivros.getListaLivros();
   
    public static void executarSistema() {

        carregarDadosDoArquivo();

        while (true) {
            
            exibirMenu();
            int op = Console.lerInt("Informe uma opção");
            verificarOpcaoMenu(op);

        }
        
    }

    private static void exibirMenu() {

        System.out.println("\nBiblioteca Sysyem");
        System.out.println("1) Cadastrar Livro");
        System.out.println("2) Listar todos");
        System.out.println("3) Buscar livro");
        System.out.println("4) Apagar livro");
        System.out.println("0) Sair");

    }

    private static void verificarOpcaoMenu(int op) {

        switch (op) {
            case 1:
                salvarLivro();
                break;

            case 2:
                listarLivros();
                break;

            case 3:
                buscarLivro();
                break;

            case 4:
                apagarLivro();
                break;

            case 0:
                System.out.println("\nO Sistema foi finalizado...\n");
                System.exit(0);
                break;
        
            default:
                System.out.println("\nOpção inválida. Digite novamente.");
                break;
        }


    }
    
    private static void carregarDadosDoArquivo() {
        
        try {
            GerenciadorArquivo.criarArquivoSeNaoExistir();
            GerenciadorArquivo.lerArquivo(listaLivros);
        } catch (Exception e) {
    
            System.out.println(e.getMessage());
        }

    }

    private static void salvarLivro() {

        System.out.println("\nNovo Livro");
        String titulo = Console.lerString("Informe o Titulo");
        String autor = Console.lerString("Informe o autor");

        Livro livro = new Livro(titulo, autor);

        try { 
            ListaLivros.salvarLivro(livro);
            GerenciadorArquivo.salvarLivroNoArquivo(listaLivros);
            System.out.println("\nLivro foi salvo no arquivo!");
        
        } catch (Exception e) {

            System.out.println(e.getMessage());
        }

    }

    private static void listarLivros() {

        try {
            ListaLivros.verificarListaVazia();
            
            System.out.println("\nLivros Cadastrados");
    
            for(Livro tempLivro : listaLivros) {
    
                System.out.println(tempLivro.exibirDados());
    
            }
            

        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
        
        
        

    }

    private static void buscarLivro() {

        try {
            ListaLivros.verificarListaVazia();

            System.out.println("\nBuscar livro por título.");
            String titulo = Console.lerString("Informe o título");

            Livro tempLivro = ListaLivros.buscarLivro(titulo);

            System.out.println("\nLivro encontrado:" + tempLivro.exibirDados());

        } catch (Exception e){

            System.out.println(e.getMessage());
        }


    }

    private static void apagarLivro() {

        try {
            ListaLivros.verificarListaVazia();

            System.out.println("\nInforme o título do livro que deseja apagar:");
            String titulo = Console.lerString("Titulo");

            Livro tempLivro = ListaLivros.buscarLivro(titulo);

            ListaLivros.apagarLivro(tempLivro);
            GerenciadorArquivo.salvarLivroNoArquivo(listaLivros);
            
            System.out.println("\nLivro apagado com sucesso do arquivo!");

        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
    }




}
