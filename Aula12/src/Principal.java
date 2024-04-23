public class Principal {
    
    public static void main(String[] args) {
        
        Carro c1 = new Carro("Ford Fiesta", "ABC-1234");
        Carro c2 = new Carro("Chevrolet Celta", "ADD-6677");
        Carro c3 = new Carro("Nissan Kicks", "PAW-5A788");

        Estacionamento.estacionarCarro(c1);
        Estacionamento.estacionarCarro(c2);
        Estacionamento.estacionarCarro(c3);

        Estacionamento.listarCarrosEstacionados();

        Estacionamento.procurarCarro("ABC-1234");
        Estacionamento.procurarCarro("ABC-0000");




    }


}
