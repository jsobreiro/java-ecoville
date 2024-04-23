public class Livro {
    
    private String titulo;
    private String autor;
    private String disponibilidade;
    
    public Livro(String titulo, String autor, String disponibilidade) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponibilidade = disponibilidade;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(String disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public void exibirDadosLivro() {
        System.out.println("\nTítulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Disponibilidade: " + disponibilidade);
    }


}
