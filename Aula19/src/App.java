import polimorfismo.Calculadora;
import polimorfismo.Idoso;
import polimorfismo.Jovem;

public class App {
    public static void main(String[] args) throws Exception {
        
        // Chamada das 3 variações de "somar"(Sobrecarga):
        System.out.println(Calculadora.somar(2, 15));
        System.out.println(Calculadora.somar(2.78945, 51));
        System.out.println(Calculadora.somar(12.5f, 75.9f));

        // Chamada do método "falar" por objetos diferentes (Sobrescrita)
        Idoso jason = new Idoso();
        Jovem bob = new Jovem();

        jason.falar();
        bob.falar();

    }
}
