package view;

import controller.CadastroAlunos;
import controller.CadastroTurmas;
import model.*;

public class Sistema {

    public static void executar() {

        int op;

        do {

            exibirMenu();
            op = Console.lerInt();
            verificarOpcao(op);

        } while (op != 0);

    }

    private static void exibirMenu() {

        System.out.println("\nGerenciamento de Turmas");
        System.out.println("1) Cadastrar aluno");
        System.out.println("2) Cadastrar turma");
        System.out.println("3) Listar alunos");
        System.out.println("4) Listar turmas");
        System.out.println("5) Buscar aluno");
        System.out.println("0) Sair");
        System.out.print("Sua opção: ");

    }

    private static void cadastrarAluno() {

        System.out.println("\nCadastro de Aluno:");

        int matricula;
        while (true) { // inicialmente, loop infinito

            System.out.println("Matrícula: ");
            matricula = Console.lerInt();

            // verifica se a matrícula já foi usada em algum cadastro
            if (CadastroAlunos.buscarAluno(matricula) != null) {
                System.out.println("\nAluno " + matricula +
                        " já se encontra cadastrado no sistema!");
            } else {
                break; // senão, forçamos a saída do loop
            }
        }

        System.out.println("Nome: ");
        String nome = Console.lerString();
        System.out.println("E-mail: ");
        String email = Console.lerString();

        Aluno aluno = new Aluno(nome, email, matricula);

        CadastroAlunos.cadastrarAluno(aluno);

        System.out.println("\nAluno Cadastrado com sucesso!");

    }

    private static void cadastrarTurma() {

        if (CadastroAlunos.listaAlunosVazia()) {
            System.out.println("\nPrimeiro cadastre ao menos um aluno no sistema...");
            return;
        }

        System.out.println("\nCadastro de Turma:");

        System.out.println("Código da turma:");
        int cod = Console.lerInt();

        System.out.println("Nome do professor da turma: ");
        String nomeProfessor = Console.lerString();

        System.out.println("E-mail do professor: ");
        String email = Console.lerString();

        System.out.println("Disciplina lecionada pelo professor " + nomeProfessor + ":");
        String disciplina = Console.lerString();

        Professor professor = new Professor(nomeProfessor, email, disciplina);

        Turma turma = new Turma(cod, professor, CadastroAlunos.getListaAlunos());

        CadastroTurmas.cadastrarTurma(turma);

        System.out.println("\nTurma cadastrada com sucesso!");

    }

    private static void listarAlunos() {

        System.out.println("\nLista de alunos cadastrados:");

        if (CadastroAlunos.listaAlunosVazia()) {
            System.out.println("\nNão há alunos cadastrados...");
            return;
        }

        for (Aluno tempAluno : CadastroAlunos.getListaAlunos()) {
            System.out.println(tempAluno);
        }
    }

    private static void listarTurmas() {

        System.out.println("Turmas cadastradas");

        if (CadastroTurmas.getListaTurmas().size() == 0) {
            System.out.println("\nNão há turmas cadastradas");
            return;
        }

        for (Turma tempTurma : CadastroTurmas.getListaTurmas()) {

            System.out.println(tempTurma);
        }

    }

    private static boolean verificarListaVazia(String msg) {
        if (CadastroAlunos.listaAlunosVazia()) {
            System.out.println(msg);
            return true;
        }

        return false;
    }

    private static void buscarAluno() {

        if (verificarListaVazia("\nNão há alunos cadastrados")) {
            return; // finaliza o método se o retorno acima for 'true'
        }

        System.out.println("\nInforme a matrícula do aluno:");
        int matricula = Console.lerInt();

        // buscarAlunos vai retornar um objeto do tipo Aluno
        // ou o valor nulo.
        Aluno a = CadastroAlunos.buscarAluno(matricula);

        // Se o Aluno 'a' for nulo:
        if (a == null) {
            System.out.println("\nAluno " + matricula +
                    " não cadastrado");
            return; // finalizamos o método
        }

        // se não for nulo, mostramos o objeto na tela
        System.out.println("\nAluno localizado:");
        System.out.println(a.toString());

    }

    private static void verificarOpcao(int op) {

        switch (op) {
            case 1:
                cadastrarAluno();
                break;

            case 2:
                cadastrarTurma();
                break;

            case 3:
                listarAlunos();
                break;

            case 4:
                listarTurmas();
                break;

            case 5:
                buscarAluno();
                break;

            case 0:
                System.out.println("\nO sistema foi finalizado...");
                break;

            default:
                System.out.println("\nOpção inválida. Digite novamente");
                break;
        }
    }

}
