import java.util.ArrayList;
import java.util.List;

public class Estacionamento {

    private static List<Carro> listaCarros = new ArrayList<>();

    public static void estacionarCarro(Carro carro) {
        listaCarros.add(carro);
    }

    public static void listarCarrosEstacionados() {

        System.out.println("Carros Estacionados:\n");
        for (Carro carro : listaCarros) {
            carro.mostrarDadosCarro();
            System.out.println();
        }

    }

    public static void procurarCarro(String placa) {

        for (Carro carro : listaCarros) {
            if (carro.getPlaca().equals(placa)){
                System.out.println("\nCarro Encontrado:");
                carro.mostrarDadosCarro();
                return; // break; tbm funcionaria!
            }
        }

        System.out.println("\nCarro " + placa + " não se encontra estacionado aqui.");


    }

    
}
