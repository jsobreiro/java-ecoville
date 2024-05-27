import java.util.ArrayList;

public abstract class ListaObras {

    private static ArrayList<ObraArte> listaObras = new ArrayList<>();

    public static void salvarObra(ObraArte obra) {
        listaObras.add(obra);
    }


}
