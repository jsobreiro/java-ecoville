package abstratas;

public class Carro extends Veiculo{

    @Override
    public String acelerar() {
        return "O carro acelerou!";
    }

    @Override
    public String parar() {
        return "O carro parou!";
    }
    
}
