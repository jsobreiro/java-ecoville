package model.entities;

public class Escultura extends ObraArte{

    private String material;

    public Escultura() {}

    public Escultura(String titulo, String artista, int anoCriacao, String tipoObra, String localNoMuseu,
            String material) {
        super(titulo, artista, anoCriacao, tipoObra, localNoMuseu);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return super.toString() + ", Material=" + material;
    }

    @Override
    public String exibirDados() {
        return super.exibirDados() + 
        "\nMaterial: " + material;
    }

    @Override
    public void fromString(String linha) {

        super.fromString(linha);
        
        String[] partes = linha.split(", ");
        
        material = partes[5].split("=")[1];

    }

    

}
