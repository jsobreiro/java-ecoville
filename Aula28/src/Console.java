import java.util.InputMismatchException;
import java.util.Scanner;

public class Console {

    private static Scanner leitor = new Scanner(System.in);

    public static int lerInt() {
        String msg = "Digite um valor 'int': ";
        return lerInt(msg);
    }

    public static int lerInt(String msg) {
       
        int valor = 0;
        while (true) {
            
            try {
                System.out.print(msg);
                valor = leitor.nextInt();
                break;
                
            } catch (InputMismatchException exception) {
                System.out.print("\nValor inválido. Digite um valor 'int': ");
            
            } finally {

                // necessário limpar o buffer antes da proxima leitura:
                leitor.nextLine();
            }
        
        }
            
        return valor;
    }

    public static float lerFloat() {
        
        String msg = "Digite um valor 'float': ";
        return lerFloat(msg);
    }

    public static float lerFloat(String msg) {
        
        float valor = 0;
        while (true) {
            
            try {
                System.out.print(msg);
                valor = leitor.nextFloat();
                break;
                
            } catch (InputMismatchException exception) {
                System.out.print("\nValor inválido. Digite um valor 'float': ");
            
            } finally {

                // necessário limpar o buffer antes da proxima leitura:
                leitor.nextLine();
            }
        
        }
            
        return valor;
        
        
    }

    public static String lerString() {
        String msg = "Digite uma 'String': ";
        return lerString(msg);
    }

    public static String lerString(String msg) {
        System.out.print(msg);
        return leitor.nextLine();
    }



}
