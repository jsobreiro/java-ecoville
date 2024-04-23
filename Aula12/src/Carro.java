public class Carro {

    private String modelo;
    private String placa;
    
    public Carro(String modelo, String placa) {
        this.modelo = modelo;
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void  mostrarDadosCarro() {
        System.out.println("\nModelo: " + modelo);
        System.out.println("Placa: " + placa);
    }
    
    
}
