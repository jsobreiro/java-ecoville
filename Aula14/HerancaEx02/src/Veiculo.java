public abstract class Veiculo {
    
    private String marca;
    private int ano;
    protected String cor;

    public Veiculo(String marca, int ano, String cor) {
        this.marca = marca;
        this.ano = ano;
        this.cor = cor;
    }

    public Veiculo() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    
    @Override
    public String toString() {
        String txt = "\nMarca/Modelo: " + marca +
        "\nAno: " + ano +
        "\nCor: " + cor;

        return txt;
    }
    

}
