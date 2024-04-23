public class Jogo {
    
    private String titulo;
    private String genero;
    private String estudio;
    private int ano;

    public Jogo() {
    }

    public Jogo(String titulo, String genero, String estudio, int ano) {
        this.titulo = titulo;
        this.genero = genero;
        this.estudio = estudio;
        this.ano = ano;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        String txt = "\nTítulo: " + titulo + "\n" +
        "Gênero: " + genero + "\n" +
        "Estúdio: " + estudio + "\n" +
        "Ano de lançamento: " + ano + "\n";

        return txt;
    }

    
    

}
