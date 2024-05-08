public abstract class Sistema {

    private static void exibirMenu(){

        System.out.println("\nSISTEMA FOLHA DE PAGAMENTO");
        System.out.println("1) Cadastrar Gerente");
        System.out.println("2) Listar Gerentes Cadastrados");
        System.out.println("0) Sair");
        System.out.print("Sua opção: ");

    }

    private static void cadastrar() {

        System.out.println("\nNovo Gerente:");
        System.out.print("Matricula: ");
        int matricula = Console.lerInt();

        try {
            FolhaPagamento.matriculaValida(matricula);
        } catch (Exception e ) {
            System.out.println(e.getMessage());
            return;
        }


        System.out.print("Nome: ");
        String nome = Console.lerString();
        System.out.print("Projeto que gerencia: ");
        String projeto = Console.lerString();
        System.out.print("Bônus de gerência: R$ ");
        float valorBonus = Console.lerFloat();
        System.out.print("Horas trabalhadas no mês: ");
        float horasTrab = Console.lerFloat();
        System.out.print("Valor da hora de trabalho: R$ ");
        float valorHora = Console.lerFloat();

        Gerente g1 = new Gerente(matricula, nome, horasTrab, valorHora, projeto, valorBonus);

        try {
            FolhaPagamento.cadastrar(g1);
        
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        
        }

    }

    private static void listarFuncionarios() {

        System.out.println("\nFolha de Pagamento dos Funcionários:");

        try {

            for (Funcionario tempFuncionario : FolhaPagamento.getListaFuncionarios())
            {
                System.out.println(tempFuncionario.retornarDados());
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    private static void verificarOp(int op) {

        switch (op) {
            case 1:
                cadastrar();
                break;
            
            case 2:
                listarFuncionarios();
                break;

            case 0:
                System.out.println("\nO sistema foi finalizado...");
                break;
        
            default:
                System.out.println("\nOpção inválida! Digite novamente: ");
                break;
        }

    }

    public static void executar() {

        int op;
        do {
        
            exibirMenu();
            op = Console.lerInt();
            verificarOp(op);
        
        } while (op != 0);

    }
}
