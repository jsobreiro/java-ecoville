import java.util.ArrayList;

public abstract class ListaObras {

    private static ArrayList<ObraArte> listaObras = new ArrayList<>();

    public static void salvarObra(ObraArte obra) {
        listaObras.add(obra);
    }

    public static ArrayList<ObraArte> getListaObras() {
        return listaObras;
    }

    public static ObraArte buscarObraArte(String titulo) {
        
        for (ObraArte obraArte : listaObras) {
            
            if (obraArte.getTitulo().equals(titulo)){
                return obraArte;
            }
        }

        return null;

    }

    public static void excluirObra(ObraArte obra) {

        listaObras.remove(obra);

    }



}
