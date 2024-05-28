package controller;

import java.io.IOException;
import java.util.ArrayList;

import model.entities.ObraArte;
import model.persistence.ObrasPersistencia;
import view.Console;

public class GerenciadorObras {

    private static ArrayList<ObraArte> listaObras = ListaObras.getListaObras();

    private static void salvarObra() {

        System.out.println("\nNova Obra");
        String titulo = Console.lerString("Título");
        String artista = Console.lerString("Artista");
        int anoCriacao = Console.lerInt("Ano de criação");
        String tipoObra = Console.lerString("Tipo de obra (Pintura, Escultura, Fogografia)");
        String localnoMuseu = Console.lerString("Local da exposição");

        ObraArte obra = new ObraArte(titulo, artista, anoCriacao, tipoObra, localnoMuseu);

        try {

            ListaObras.salvarObraArte(obra);
            ObrasPersistencia.salvarObraNoArquivo(listaObras);
            System.out.println("\nObra cadastrada com sucesso!\n");

        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }

    }

    private static void buscarObra() {

        try {
            ListaObras.verificarListaVazia();

            System.out.println("\nBuscar obra:");
            String titulo = Console.lerString("Informe o título");
            
            ObraArte obra = ListaObras.buscarObraArte(titulo);

            System.out.println("\nObra localizada:");
            System.out.println(obra.exibirDados());

        } catch (Exception exception) {

            System.out.println(exception.getMessage());
        }

    }

    private static void apagarObra() {
        
        try {
            
            ListaObras.verificarListaVazia();
       
            System.out.println("\nApagar obra:");
            String titulo = Console.lerString("Informe o título");

            ObraArte obra = ListaObras.buscarObraArte(titulo);

            ListaObras.apagarObra(obra);
            ObrasPersistencia.salvarObraNoArquivo(listaObras);

            System.out.println("\nObra " + obra.getTitulo() + " excluída com sucesso!");

        } catch (Exception exception) {

            System.out.println(exception.getMessage());
        }

    }

    private static void listarObras() {

        try {

            ListaObras.verificarListaVazia();

            System.out.println("\nObras Cadastradas:");
            for (ObraArte tempObra : listaObras) {
                
                System.out.println(tempObra.exibirDados());
            }

        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }

    }

    public static void verificarOpcaoDigitada(int op) throws Exception {

        switch (op) {
            case 1:
                salvarObra();
                break;

            case 2:
                buscarObra();
                break;

            case 3:
                apagarObra();
                break;

            case 4:
                listarObras();
                break;

            case 0:
                System.exit(0);
            default:
                throw new Exception("\nOpção inválida. Digite novamente\n");
        }

    }

    public static void criarArquivoSeNaoExistir() throws IOException {
        ObrasPersistencia.criarArquivoSeNaoExistir();
    }

    public static void lerArquivo() throws IOException {
        ObrasPersistencia.lerArquivo(listaObras);
    }
}
