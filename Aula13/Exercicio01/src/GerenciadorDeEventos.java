import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeEventos {

    private static List<Evento> eventos = new ArrayList<>();

    public static void adicionarEvento(Evento e){
        eventos.add(e);
    }

    public static void buscarEvento(String nome) {

        for (Evento tempEvento : eventos) {
            if (tempEvento.getNome().equals(nome)){
                System.out.println("\nEvento encontrado:");
                tempEvento.mostrarDadosEvento();
                return;
            }
        }

        System.out.println("Evento " + nome + " não localizado");

    }

    public static void listarTodosOsEventos() {

        if (eventos.size() == 0) {
            System.out.println("\nNão há eventos cadastrados");
            return;
        }

        System.out.println("\nEventos cadastrados:");
        for (Evento tempEvento : eventos) {
            tempEvento.mostrarDadosEvento();
        }

    }

}