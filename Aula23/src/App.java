import exemplo1.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        teste2Exemplo1();


    }


    private static void teste2Exemplo1() {

        int op;

        do {

            System.out.println("\nGerenciar Carros");
            System.out.println("1) Cadastrar");
            System.out.println("2) Listar");
            System.out.println("0) Sair");
            System.out.print("Sua opção: ");
            op = Console.lerInt();

            switch (op) {
                case 1:
                    
                    System.out.println("\nNovo carro:");
                    System.out.print("Placa: ");
                    String placa = Console.lerString();

                    System.out.print("Modelo: ");
                    String modelo = Console.lerString();

                    System.out.println("Cor: ");
                    String cor = Console.lerString();

                    Carro carro = new Carro(placa, modelo, cor);

                    GerenciarCarros.salvarCarro(carro);

                    System.out.println("\nCarro cadastrado com sucesso!");

                    break;

                case 2: 

                    System.out.println("\nCarros Cadastrados: ");
                    GerenciarCarros.listarCarros();
                    break;

                case 0: 

                    System.out.println("\nO sistema foi finalizado...");
                    break;  

                default:
                    System.out.println("\nOpção inválida. Digite novamente");
                    break;
            }


        } while (op != 0);


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
