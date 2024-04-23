import java.util.ArrayList;
import java.util.List;

public class ControleBiblioteca {
    
    private List<Livro> acervoLivros;

    public ControleBiblioteca() {
        acervoLivros = new ArrayList<>();
    }

    public void adicionarLivro(Livro l) {
        acervoLivros.add(l);
    }

    public void buscarLivro(String titulo) {

        for (Livro tempLivro : acervoLivros) {
            
            if (tempLivro.getTitulo().equals(titulo)){
                System.out.println("\nLivro encontrado no acervo:");
                tempLivro.exibirDadosLivro();
                return;
            }

        }

        System.out.println("\nLivro " + titulo + " não encontrado.");

    }

    public void listarTodosOsLivros() {

        if (acervoLivros.size() == 0) {
            System.out.println("\nNão há livros cadastrados...");
            return;
        }

        System.out.println("\nLivros cadastrados:");

        for (Livro tempLivro : acervoLivros) {
            
            tempLivro.exibirDadosLivro();

        }

    }


}
