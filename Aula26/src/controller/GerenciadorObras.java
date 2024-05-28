package controller;

public class GerenciadorObras {



    private static void salvarObra() {

    }

    private static void buscarObra() {

    }

    private static void  apagarObra() {

    }

    private static void listarObras() {

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
}
