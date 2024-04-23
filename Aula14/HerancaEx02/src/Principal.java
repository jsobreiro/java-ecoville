import java.net.CacheRequest;

public class Principal {
    
    public static void main(String[] args) {
        
        Carro c1 = new Carro("Ford Fiesta", 2012, 
        "Preto", "1.6 flex");

        System.out.println(c1);

        // Não é permitido criar objetos de uma clase abstrata:
        // Veiculo v1 = new Veiculo("Ford Fiesta", 2012, "Preto");

        int res = Calculadora.somar(10, 23);
        System.out.println("\nSoma entre 10 e 23: " + res);

        // por Calculadora ser estático, não é possível
        // mais instanciar objetos desta classe:
        // Calculadora calc = new Calculadora();
        // System.out.println(calc);

    }

}
