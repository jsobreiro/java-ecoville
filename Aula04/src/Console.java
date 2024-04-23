import java.util.Scanner;

public class Console {
    
    static Scanner leitor = new Scanner(System.in);

    public static int lerInt() {
        int valor = leitor.nextInt();
        return valor;
    }

    public static String lerString() {
        String txt = leitor.nextLine();
        return txt;
    }

    public static float letFloat() {
        float valor = leitor.nextFloat();
        return valor;
    }

}
