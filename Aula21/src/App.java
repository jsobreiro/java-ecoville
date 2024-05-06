public class App {
    public static void main(String[] args)  {
        
        ContaCorrente cc = new ContaCorrente(1234, 2500.50f, 500);

        System.out.println(cc.depositar(500));
        System.out.println(cc.retornarSaldo());

        try {
            System.out.println(cc.sacar(3500));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(cc.sacar(1));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println(cc.depositar(250));

        System.out.println(cc.retornarSaldo());

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
