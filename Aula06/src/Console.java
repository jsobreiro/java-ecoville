import java.util.Scanner;

public class Console {
    
    private static Scanner leitor = new Scanner(System.in);

    public static int lerInt() {
        int valor = leitor.nextInt();
        // limpeza de buffer
        leitor.nextLine();
        return valor;
    }

    public static String lerString() {
        String txt = leitor.nextLine();
        return txt;
    }

    public static float lerFloat() {
        float valor = leitor.nextFloat();
        // limpeza de buffer
        leitor.nextLine();
        return valor;
    }

}
