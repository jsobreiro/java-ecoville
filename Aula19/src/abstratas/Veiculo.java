package abstratas;

public abstract class Veiculo {
    
    private String placa;

    public Veiculo(){
        placa = "ABC-1234";
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    // Classe abstrata: 
    // Não se pode instanciar objetos
    
    // Métodos abstratos:
    // Não imlementamos suas funções, apenas
    // escrevemos suas assinaturas
    public abstract String acelerar();
    public abstract String parar();
}
