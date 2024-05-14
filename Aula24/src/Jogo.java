public class Jogo {

    private int codigo;
    private String titulo;
    private String genero;
    
    public Jogo(int codigo, String titulo, String genero) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.genero = genero;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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

    @Override
    public String toString() {
       
        return codigo + ", " + titulo + ", " + genero;
    }

    public static Jogo fromString(String linha) {

        String[] dadosJogo = linha.split(", ");

        return new Jogo(Integer.parseInt(dadosJogo[0]), 
                        dadosJogo[1], 
                        dadosJogo[2]);

    }

}
