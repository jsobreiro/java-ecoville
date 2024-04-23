public class Carro extends Veiculo {
    
    private String motor;
    
    public Carro(String marca, int ano, String cor, String motor) {
        super(marca, ano, cor);
        this.motor = motor;
    }

    public Carro() {
        
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }


    @Override
    public String toString() {
        
        // permitido alterar diretamente atributo protected:
        cor = "Vermelho";
        // não permitido para atributo private:
        // ano = 2023;
        // para alterar atributo private deve invocar o set:
        setAno(2023);
        
        String txt = super.toString() +
        "\nMotor: " + motor;


        return txt;
    }
    

}
