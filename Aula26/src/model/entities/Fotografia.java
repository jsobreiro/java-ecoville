package model.entities;

public class Fotografia extends ObraArte {

    private String tipoFilme;

    public Fotografia() {
    }

    public Fotografia(String titulo, String artista, int anoCriacao, String tipoObra, String localNoMuseu,
            String tipoFilme) {
        super(titulo, artista, anoCriacao, tipoObra, localNoMuseu);
        this.tipoFilme = tipoFilme;
    }

    public String getTipoFilme() {
        return tipoFilme;
    }

    public void setTipoFilme(String tipoFilme) {
        this.tipoFilme = tipoFilme;
    }

    @Override
    public String toString() {
        return super.toString() + ", Tipo de filme=" + tipoFilme;
    }

    @Override
    public String exibirDados() {
        return super.exibirDados() + 
        "\nTipo de filme: " + tipoFilme;
    }

    @Override
    public void fromString(String linha) {

        super.fromString(linha);
        
        String[] partes = linha.split(", ");
        
        tipoFilme = partes[5].split("=")[1];

    }

    

}
