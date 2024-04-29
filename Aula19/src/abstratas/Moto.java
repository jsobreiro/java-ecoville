package abstratas;

public class Moto extends Veiculo{
    
    @Override
    public String acelerar() {
        return "A moto acelerou! Ran-dan-dan!";
    }

    @Override
    public String parar() {
        return "A moto parou...";
    }

    
}
