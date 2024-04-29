import polimorfismo.Calculadora;

public class App {
    public static void main(String[] args) throws Exception {
        
        // Chamada das 3 variações de "somar":
        System.out.println(Calculadora.somar(2, 15));
        System.out.println(Calculadora.somar(2.78945, 51));
        System.out.println(Calculadora.somar(12.5f, 75.9f));

    }
}
