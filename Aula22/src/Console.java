import java.util.InputMismatchException;
import java.util.Scanner;

public class Console {
    
    private static Scanner scanner = new Scanner(System.in);

    public static int lerInt(){
        int valor = 0;

        while(true){
            try { // tenta executar a leitura do int
                valor = scanner.nextInt();
                scanner.nextLine(); // limpa o buffer
                break; // quebra o loop se o valor foi lido
            
            } catch (InputMismatchException e) {
                // senão, a exceção é capturada:
                scanner.nextLine();
                System.out.println("O valor informado não é um inteiro. Digite novamente: ");
            
            }
        }
        // retorna o valor lido:
        return valor;
    }

    public static float lerFloat() {
        float valor = 0;

        while (true) {
            try {
                valor = scanner.nextFloat();
                scanner.nextLine();
                break;

            } catch (InputMismatchException e) {
                scanner.nextLine();
                System.out.println("O valor informado não é um 'float'. Digite novamente: ");
            }
        }
        return valor;
    }

    public static String lerString() {
        return scanner.nextLine();
    }


}
