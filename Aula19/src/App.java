import java.util.ArrayList;

import abstratas.*;
import exercicios.Professor;
import interfaces.*;
import polimorfismo.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        // Execução do exemplo/exercício:
        Professor profe = new Professor();
        System.out.println("Dados do Professor:");
        System.out.println(profe);

        System.out.println("\nMostrando apenas o salário:");
        System.out.println(profe.calcularSalario());
        
    }
    
    private static void exemplosAula19() {
        
        // Chamada das 3 variações de "somar"(Sobrecarga):
        System.out.println(Calculadora.somar(2, 15));
        System.out.println(Calculadora.somar(2.78945, 51));
        System.out.println(Calculadora.somar(12.5f, 75.9f));
    
        // Chamada do método "falar" por objetos diferentes (Sobrescrita)
        Idoso jason = new Idoso();
        Jovem bob = new Jovem();
    
        jason.falar();
        bob.falar();
    
        // Chamada dos métodos  abstratos "acelerar" e "parar", 
        // da super classe Veiculo que foram implementados pelas 
        // subclasses Carro e Moto
        Carro celta = new Carro();
        Moto ybr = new Moto();
    
        System.out.println(celta.acelerar());
        System.out.println(celta.parar());
    
        System.out.println(ybr.acelerar());
        System.out.println(ybr.parar());
        
        // Chamada de métodos da interface implementada
        Forma meuCirculo = new Circulo();
        Forma meuQuadrado = new Quadrado();
    
        meuCirculo.desenhar();
        meuQuadrado.desenhar();

        ArrayList<Forma> minhasFormas = new ArrayList<>();
        minhasFormas.add(meuQuadrado);
        minhasFormas.add(meuCirculo);

    }
}
