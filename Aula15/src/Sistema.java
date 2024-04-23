public class Sistema {

    private static void exibirMenu() {

        System.out.println("\nCADASTRO DE FUNCIONÁRIOS - MENU");
        System.out.println("1) Cadastrar Gerente");
        System.out.println("2) Cadastrar Programador");
        System.out.println("3) Listar todos os funcionários");
        System.out.println("4) Listar todos os gerentes");
        System.out.println("5) Listar todos os Programadores");
        System.out.println("6) Remover funcionário");
        System.out.println("0) Sair");
        System.out.print("Informe uma opção:");

    }

    private static void verificarOpcao(int op) {

        String nome;
        int matricula;

        switch (op) {
            case 1:

                System.out.println("\nCADASTRO DE GERENTE:");
                // leitura dos dados
                System.out.print("Nome: ");
                nome = Console.lerString();
                System.out.print("Matícula: ");
                matricula = Console.lerInt();
                System.out.print("Nome do projeto que gerencia: ");
                String nomeProjeto = Console.lerString();

                // instância temporária de Gerente:
                Gerente gerente = new Gerente(nome, matricula, nomeProjeto);

                // Adicionar gerente na lista de funcionários:
                CadastroFuncionarios.cadastrar(gerente);

                // Sucesso:
                System.out.println("\nGerente cadastrado com sucesso!");

                break;

            case 2:

                System.out.println("\nCADASTRO DE PROGRAMADOR:");
                // leitura dos dados
                System.out.print("Nome: ");
                nome = Console.lerString();
                System.out.print("Matícula: ");
                matricula = Console.lerInt();
                System.out.print("Senioridade: ");
                String senioridade = Console.lerString();

                // instância temporária de Programador:
                Programador programador = new Programador(nome, matricula, senioridade);

                // Adicionar programador na lista de funcionários:
                CadastroFuncionarios.cadastrar(programador);

                // Sucesso:
                System.out.println("\nProgramador cadastrado com sucesso!");

                break;

            case 3:

                if (CadastroFuncionarios.getListaFuncionarios().size() == 0) {
                    System.out.println("Não há funcionários cadastrados...");
                    break;
                }
            
                System.out.println("\nFUNCIONÁRIOS CADASTRADOS:");
                for (Funcionario tempFuncionario : CadastroFuncionarios.getListaFuncionarios()) {
                    System.out.println(tempFuncionario);
                }

                break;

            case 4:

                System.out.println("\nGERENTES CADASTRADOS:");

                for (Funcionario tempFuncionario : CadastroFuncionarios.getGerentes()) {
                    System.out.println(tempFuncionario);
                }

                break;

            case 5:

                System.out.println("\nPROGRAMADORES CADASTRADOS:");
                for (Funcionario tempFuncionario : CadastroFuncionarios.getListaFuncionarios()) {
                    
                    if(tempFuncionario instanceof Programador) {
                        System.out.println(tempFuncionario);
                    }

                }

                break;

            case 6:

                System.out.println("\nREMOVER FUNCIONÁRIO");
                System.out.print("Informe a matícula do funcionário: ");
                matricula = Console.lerInt();

                // tenta excluir funcionario com base na matricula 
                // informada. O método abaixo retornará true, caso
                // tenha excluído o funcionario, e false, caso não.
                if (CadastroFuncionarios.excluir(matricula)){
                    System.out.println("\nFuncionário foi rmeovido com sucesso!");
                } else {
                    System.out.println("\nFuncionário " + matricula + " não localizado no cadastro");
                }

                break;

            case 0:

                System.out.println("\nO Sistema foi finalizado...");
                break;

            default:
                System.out.println("\nOpção inválida. Digite novamente.");
                break;
        }

        System.out.println();

    }

    public static void executar() {

        int op;

        do {

            exibirMenu();
            op = Console.lerInt();
            verificarOpcao(op);

        } while (op != 0);

    }

}
