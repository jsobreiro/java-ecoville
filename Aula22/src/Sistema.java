public abstract class Sistema {

    private static void exibirMenu(){

        System.out.println("\nSISTEMA FOLHA DE PAGAMENTO");
        System.out.println("1) Cadastrar Funcionário");
        System.out.println("2) Listar Gerentes Cadastrados");
        System.out.println("0) Sair");
        System.out.print("Sua opção: ");

    }

    private static void cadastrar() {

        System.out.println("\nNovo Funcionario:");
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
        System.out.print("Horas trabalhadas no mês: ");
        float horasTrab = Console.lerFloat();
        System.out.print("Valor da hora de trabalho: R$ ");
        float valorHora = Console.lerFloat();

        int op;

        do{
            System.out.println("\nO funcionário é:");
            System.out.println("1) Gerente");
            System.out.println("2) Desenvolvedor");
            System.out.print("Informe sua opção: ");
            op = Console.lerInt();
        } while (op != 1 && op != 2);

        Funcionario f; // objeto Funcionario  NÃO INSTANCIADO
        
        if(op == 1) {
            System.out.print("Projeto que gerencia: ");
            String projeto = Console.lerString();
            System.out.print("Bônus de gerência: R$ ");
            float valorBonus = Console.lerFloat();
            // Polimorfismo: tratando o objeto 'f' como um Gerente
            f = new Gerente(matricula, nome, horasTrab, valorHora, projeto, valorBonus);
        
        } else {
            System.out.println("Linguagens de prog. que donmina: ");
            String linguagensProg = Console.lerString();
            // Polimorfismo: tratando o objeto 'f' como um Desenvolvedor
            f = new Desenvolvedor(matricula, nome, horasTrab, valorHora, linguagensProg);
        }

        try {
            FolhaPagamento.cadastrar(f);
            System.out.println("\nFuncionário Cadastrado com Sucesso!");
                    
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
