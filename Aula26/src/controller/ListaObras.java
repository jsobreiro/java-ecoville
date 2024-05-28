package controller;
import java.util.ArrayList;

import model.entities.ObraArte;

public abstract class ListaObras {

    private static ArrayList<ObraArte> listaObras = new ArrayList<>();

    public static void salvarObraArte(ObraArte obra) {
        listaObras.add(obra);
    }

    public static ArrayList<ObraArte> getListaObras() {
        return listaObras;
    }

    public static void verificarListaVazia() throws Exception {
        
        if (listaObras.isEmpty()) {
            throw new Exception("\nATENÇÃO: Não há obras cadastradas.\n");
        }
    }

    public static ObraArte buscarObraArte(String titulo) throws Exception {

       for (ObraArte tempObra : listaObras) {
            if (tempObra.getTitulo().contains(titulo)) {
                return tempObra;
            }
       }

       throw new Exception("\nObra de arte " + titulo + " não localizada.\n");
    }

    public static void apagarObra(ObraArte obra) {
        listaObras.remove(obra);
    }



}
