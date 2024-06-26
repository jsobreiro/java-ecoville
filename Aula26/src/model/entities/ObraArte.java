package model.entities;

public class ObraArte {

    //  título, artista, ano de criação, tipo de obra e localização.
    private String titulo;
    private String artista;
    private int anoCriacao;
    private String tipoObra;
    private String localNoMuseu;

    public ObraArte() {}

    public ObraArte(String titulo, String artista, int anoCriacao, String tipoObra, String localNoMuseu) {
        this.titulo = titulo;
        this.artista = artista;
        this.anoCriacao = anoCriacao;
        this.tipoObra = tipoObra;
        this.localNoMuseu = localNoMuseu;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getAnoCriacao() {
        return anoCriacao;
    }

    public void setAnoCriacao(int anoCriacao) {
        this.anoCriacao = anoCriacao;
    }

    public String getTipoObra() {
        return tipoObra;
    }

    public void setTipoObra(String tipoObra) {
        this.tipoObra = tipoObra;
    }

    public String getLocalNoMuseu() {
        return localNoMuseu;
    }

    public void setLocalNoMuseu(String localNoMuseu) {
        this.localNoMuseu = localNoMuseu;
    }

    @Override
    public String toString() {
        return "Título=" + titulo + ", Artista=" + artista + ", Ano de criação=" + anoCriacao + ", Tipo de Obra="
                + tipoObra + ", Local no Museu=" + localNoMuseu;
    }

    public String exibirDados() {
        return "\nTítulo da obra: " + titulo + 
        "\nArtista: " + artista + 
        "\nAno de criação: " + anoCriacao + 
        "\nTipo de Obra: " + tipoObra + 
        "\nLocal da exposição no Museu: " + localNoMuseu;
    }

    public void fromString(String linha) {

        String[] partes = linha.split(", ");

        titulo = partes[0].split("=")[1];
        artista = partes[1].split("=")[1];
        anoCriacao = Integer.parseInt(partes[2].split("=")[1]);
        tipoObra = partes[3].split("=")[1];
        localNoMuseu = partes[4].split("=")[1];

    }

    
    
}