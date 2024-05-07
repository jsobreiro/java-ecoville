public class App {
    public static void main(String[] args)  {
        
        // Exemplo para Conta Corrente:
        ContaCorrente cc = new ContaCorrente(1234, 2500.50f, 500);

        // Depositar 500
        System.out.println(cc.depositar(500));
        // Mostrar saldo atual
        System.out.println(cc.retornarSaldo());

        // Tentar sacar 3500 reais
        try {
            System.out.println(cc.sacar(3500));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Tentar sacar 1 real
        try {
            System.out.println(cc.sacar(1));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Depositar 250 reais
        System.out.println(cc.depositar(250));

        // Mostrar saldo atual
        System.out.println(cc.retornarSaldo());

        System.out.println("\n");

        // Exemplo para Conta Poupança
        ContaPoupanca cp = new ContaPoupanca(1235, 150, 2);

        // Mostrar saldo atual
        System.out.println(cp.retornarSaldo());
        // Depositar 4500,00 reais
        System.out.println(cp.depositar(4350));

        // tentar sacar 1500
        try {
            System.out.println(cp.sacar(1500));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // tentar sacar 6000
        try {
            System.out.println(cp.sacar(6000));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // mostrar saldo atual
        System.out.println(cp.retornarSaldo());

    }

    private static void teste01() {

        Pessoa p = null;

        try {
            p.setNome("Fulano");
        } catch (NullPointerException e) {
            System.out.println("Não é possível alterar o nome, pois o objeto 'p' é nulo");
        }


        
        System.out.print("Informe sua idade: ");
        int idade = Console.lerInt();
        
        System.out.print("Agora, informe seu nome: ");
        String nome = Console.lerString();
        System.out.println("Usuário cadastrado: " + nome + 
                            " (" + idade + " anos)");


    }
}
