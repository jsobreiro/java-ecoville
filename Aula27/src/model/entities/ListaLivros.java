package model.entities;
import java.util.ArrayList;

public abstract class ListaLivros {

    private static ArrayList<Livro> listaLivros = new ArrayList<>();

    public static void salvarLivro(Livro livro) {
        listaLivros.add(livro);
    }

    public static ArrayList<Livro> getListaLivros() {
        return listaLivros;
    }

    public static void verificarListaVazia() throws Exception {

        if (listaLivros.isEmpty()) {
            throw new Exception("\nNão há livros cadastrados");
        }

    }

    public static Livro buscarLivro(String titulo) throws Exception {

        for(Livro tempLivro : listaLivros) {

            if (tempLivro.getTitulo().contains(titulo)) {
                return tempLivro;
            }
        }

        throw new Exception("Livro " + titulo + " não encontrado");
    }

    public static void apagarLivro(Livro livro) {
        listaLivros.remove(livro);
    }


}
