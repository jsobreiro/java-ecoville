package model.entities;

public class Pintura extends ObraArte {

    private String tecnica;

    public Pintura() {
    }

    public Pintura(String titulo, String artista, int anoCriacao, String tipoObra, String localNoMuseu,
            String tecnica) {
        super(titulo, artista, anoCriacao, tipoObra, localNoMuseu);
        this.tecnica = tecnica;
    }

    public String getTecnica() {
        return tecnica;
    }

    public void setTecnica(String tecnica) {
        this.tecnica = tecnica;
    }

    @Override
    public String toString() {
        return super.toString() + ", Tecnica=" + tecnica;
    }

    @Override
    public String exibirDados() {
        return super.exibirDados() + 
        "\nTécnica: " + tecnica;
    }

    @Override
    public void fromString(String linha) {

        super.fromString(linha);
        
        String[] partes = linha.split(", ");
        
        tecnica = partes[5].split("=")[1];

    }

    

}
