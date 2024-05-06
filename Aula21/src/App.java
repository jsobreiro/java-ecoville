public class App {
    public static void main(String[] args)  {
        


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
