public class Principal {

    public static void main(String[] args) {
        
        ex06();
    }

    private static void ex01() {

        System.out.println("Ex 01 - Calculadora");
        float n1;
        float n2;
        float result;
        int op;

        
        do {
            System.out.print("Informe o primeiro valor: ");
            n1 = Console.lerFloat();
    
            System.out.print("Informe o segundo valor: ");
            n2 = Console.lerFloat();
            
            System.out.println("Informe agora a operação: ");
            System.out.println("1) Adição");
            System.out.println("2) Subração:");
            System.out.println("3) Multiplicação");
            System.out.println("4) Divisão");
            System.out.println("0) Cancelar");
            op = Console.lerInt();

            switch (op) {
                case 1:
                    result = Calculadora.somar(n1, n2);
                    System.out.println("Adição: " + result);
                    break;

                case 2:
                    result = Calculadora.somar(n1, n2);
                    System.out.println("Subtração: " + result);
                    break;

                case 3: 
                    result = Calculadora.multiplicar(n1, n2);
                    System.out.println("Multiplicação: " + result);
                    break;

                case 4:
                    result = Calculadora.dividir(n1, n2);
                    System.out.println("Divisão: " + result);
                    break;

                case 0:
                    System.out.println("Programa finalizado...");
                    break;
                    
                default:
                    System.out.println("\nOpção inválida...");
                    break;
            }


        } while (op != 0);


    }

    private static void ex02() {

        // Livro 1
        Livro l1 = new Livro(); // construtor padrao
        l1.setTitulo("Bla bla bla - Parte 1");
        l1.setAutor("Jão Jão");
        l1.setAno(2021);

        // Livro 2
        Livro l2 = new Livro("Ble bli", "Zezin", 2019);

        // Mostrar livros
        l1.exibirInfo();
        l2.exibirInfo();
        

    }

    private static void ex03() {


        ContaBancaria c1 = new ContaBancaria();
        c1.setNumeroConta(10001);
        c1.setNomeTitular("Joãozin Silva");
        c1.setSaldo(3521.56f);

        ContaBancaria c2 = new ContaBancaria(10002,
        "Zezin Souza", 
        5000.45f);

        // operações da conta c1:
        c1.exibirSaldo();
        c1.depositar(150);
        c1.sacar(2100.45f);

        // operações da conta c2:
        c2.exibirSaldo();
        c2.sacar(1426.15f);
        c2.depositar(3741);


    }

    private static void ex04() {

        Jogador player1 = new Jogador("Fulano", 1500, 2);
        Jogador player2 = new Jogador("Beltrano", 3000, 3);

        player1.aumentarPontuacao(150);
        player1.aumentarPontuacao(500);
        player1.subirNivel();
        player1.exibirStatusJogador();

        player2.exibirStatusJogador();
        player2.aumentarPontuacao(100);
        player2.subirNivel();
        player2.exibirStatusJogador();

    }

    private static void ex05() {
      
        Carro car = new Carro();

        car.exibirStatusCarro();

        car.acelerar();
        car.acelerar();

        car.frear();
        car.frear();
        car.frear();




    }

    private static void ex06() {

        // Criar nova agenda com no máximo 3 contatos
        Agenda agenda = new Agenda(3);

        Contato c1 = new Contato("Zezin", "(41) 2345-6789");
        Contato c2 = new Contato("Joaozin", "(41) 9 9999-6789");
        Contato c3 = new Contato("Mariazinha", "(11) 9999-8888");
        Contato c4 = new Contato("Juquinha", "SN");


        agenda.adicionarContato(c1);
        agenda.adicionarContato(c2);
        agenda.adicionarContato(c3);
        agenda.adicionarContato(c4);

        agenda.buscarContato("João");
        agenda.buscarContato("Joaozin");


    }
}