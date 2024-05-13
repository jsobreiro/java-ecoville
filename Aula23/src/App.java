import exemplo1.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        
    }
    
    private static void testeExemplo1() {
        
                // Limpando arquivo antes de gravar novos dados
                GerenciarCarros.apagarDados();
        
                // Novas instâncias de Carro
                Carro carro1 = new Carro ("ABC-1234", "Toyota Corola", "Preto");
                Carro carro2 = new Carro("XYZ-4567", "Honda Civic", "Branco");
        
                // Gravando carros no arquivo
                GerenciarCarros.salvarCarro(carro1);
                GerenciarCarros.salvarCarro(carro2);
        
                // Mensagem de confirmação
                System.out.println("Carros salvos no arquivo 'carros.txt'");
        
                System.out.println("\nCarros salvos no arquivo:");
        
                // Ler e exibir linhas salvas no arquivo
                GerenciarCarros.listarCarros();

    }
}
