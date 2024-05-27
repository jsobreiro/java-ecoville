package view;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Console {

    private static Scanner scanner = new Scanner(System.in);

    public static int lerInt() {
        int valor = 0;  // Valor padrão
        boolean entradaValida = false;
        while (!entradaValida) {
            try {
                valor = scanner.nextInt();
                entradaValida = true;  // Sair do loop se ler um inteiro com sucesso
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
                scanner.next(); // Limpa o buffer do scanner para evitar um loop infinito
            }
        }
        scanner.nextLine(); // Importante: consome a nova linha deixada por nextInt()
        return valor;
    }
    

    public static float lerFloat() {
        float valor;
        while (true) {
            try{
                valor = scanner.nextFloat();
                break;
            }catch (InputMismatchException e){
                System.out.println("Valor digitado não é 'real'. Digite novamente: ");
                scanner.nextLine();
            }
        }
        
        return valor;
    }

    public static String lerString() {
        return scanner.nextLine();
    }
    
}
