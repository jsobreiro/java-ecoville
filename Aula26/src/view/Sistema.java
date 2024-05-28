package view;

import java.io.IOException;

import controller.GerenciadorObras;


public class Sistema {

    private static void exibirMenu() {
        
        System.out.println("\nGerenciamento de Obras de Arte do Museu");
        System.out.println("1) Cadastrar");
        System.out.println("2) Buscar por Título");
        System.out.println("3) Apagar");
        System.out.println("4) Listar todas as obras");
        System.out.println("0) Sair");
    }

    public static void executar() {

       try {
            GerenciadorObras.criarArquivoSeNaoExistir();
            GerenciadorObras.lerArquivo();
    
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }

        while (true) {
            
            exibirMenu();
            int op = Console.lerInt("Informe uma opção");
            
            try {
                GerenciadorObras.verificarOpcaoDigitada(op);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }

    }

    

}
