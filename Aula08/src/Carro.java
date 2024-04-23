public class Carro {

    private String marca;
    private String modelo;
    private int ano;
    private float velocidadeAtual;

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public float getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setVelocidadeAtual(float velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public Carro(){
        marca = "Volkswagen";
        modelo = "Fusca";
        ano = 1965;
        velocidadeAtual = 0;
    }

    public void acelerar() {

        if (velocidadeAtual >= 80) {
            velocidadeAtual = 80;
            return;
        }

        velocidadeAtual += 10;
        System.out.println("Acelerando...");
        exibirStatusCarro();
    }

    public void frear(){

        if (velocidadeAtual <= 0) {
            velocidadeAtual = 0;
            return;
        }

        velocidadeAtual -= 10;
        System.out.println("Freando...");
        exibirStatusCarro();

    }

    public void exibirStatusCarro() {
        System.out.println("\nO carro " + marca + 
        " " + modelo + 
        " (" + ano + ") possui velocidade atual de: " +
        velocidadeAtual + "Km/h\n");
    }




}
