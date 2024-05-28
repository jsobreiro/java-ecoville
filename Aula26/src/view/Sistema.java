package view;

import controller.GerenciadorObras;
import model.persistence.ObrasPersistencia;

public class Sistema {

    private static void exibirMenu() {
        
        System.out.println("\nGerenciamento de Obras de Arte do Museu");
        System.out.println("1) Cadastrar");
        System.out.println("2) Buscar por T~itulo");
        System.out.println("3) Apagar");
        System.out.println("4) Listar todas as obras");
        System.out.println("0) Sair");
    }

    public static void executar() {

        ObrasPersistencia.criarArquivoSeNaoExistir();

        while (true) {
            
            exibirMenu();
            int op = Console.lerInt("Informe uma opção");
            
            try {
                GerenciadorObras.verificarOpcaoDigitada(op);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }

    

}
