public class Aula04 {

    public static void main(String[] args) {

        exVetorObjeto();
    }

    public static void ex00() {

        /*
         * Ler um valor inteiro entre 2 e 10.
         * Criar um vetor deste tamanho e ler todos os valores
         * deste vetor. Apresentar o vetor na tela
         */

        System.out.println("EX 00:");

        int tamanho;
        do {
            System.out.print("Informe um valor entre 2 e 10: ");
            tamanho = Console.lerInt();
        } while (tamanho < 2 || tamanho > 10);

        int[] vetor = new int[tamanho];

        System.out.println("\nIniciando a leitura do vetor:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Valor para a pos " + i + ": ");
            vetor[i] = Console.lerInt();
        }

        System.out.println("\nVetor Gerado: ");

        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }

    }

    public static void exMatriz() {

        System.out.println("\nExemplo Matriz:");

        int[][] m1 = new int[3][3];
        for (int lin = 0; lin < m1.length; lin++) {
            for (int col = 0; col < m1[0].length; col++) {

                System.out.print("Informe o valor para a pos " + lin + " - " + col + ": ");
                m1[lin][col] = Console.lerInt();
            }
        }

        System.out.println("\nEXIBINDO MATRIZ GERADA:");
        for (int lin = 0; lin < m1.length; lin++) {
            for (int col = 0; col < m1[0].length; col++) {

                System.out.print(m1[lin][col] + "\t");
            }
            System.out.println(); // QUEBRA DE LINHA
        }

    }

    public static void exObjetoAluno() {

        Aluno aluno1 = new Aluno();
        System.out.println("\nCADASTRO DE ALUNO:");
        System.out.print("Nome: ");
        aluno1.nomeAluno = Console.lerString();
        System.out.print("Curso: ");
        aluno1.curso = Console.lerString();
        System.out.print("Campus: ");
        aluno1.campus = Console.lerString();

        System.out.println("\nAluno cadastrado:");
        System.out.println(aluno1.toString());

    }

    public static void exVetorObjeto() {

        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        Aluno a3 = new Aluno();

        /* O laço FOR e o vetor de alunos, substitui
        todo o bloco de código abaixo:

        System.out.println("PRIMEIRO ALUNO:");
        System.out.print("Nome: ");
        a1.nomeAluno = Console.lerString();
        System.out.print("Curso: ");
        a1.curso = Console.lerString();
        System.out.print("Campus: ");
        a1.campus = Console.lerString();

        System.out.println("\nSEGUNDO ALUNO:");
        System.out.print("Nome: ");
        a2.nomeAluno = Console.lerString();
        System.out.print("Curso: ");
        a2.curso = Console.lerString();
        System.out.print("Campus: ");
        a2.campus = Console.lerString();

        System.out.println("\nTERCEIRO ALUNO:");
        System.out.print("Nome: ");
        a3.nomeAluno = Console.lerString();
        System.out.print("Curso: ");
        a3.curso = Console.lerString();
        System.out.print("Campus: ");
        a3.campus = Console.lerString();
        */

        // Vetor de alunos:
        Aluno[] alunos = new Aluno[3];
    

        for (int i = 0; i < alunos.length; i++) {
            System.out.println("\nALUNO " + (i+1));
            alunos[i] = new Aluno(); // inicializa o aluno
            
            System.out.print("Nome: ");
            alunos[i].nomeAluno = Console.lerString();
            System.out.print("Curso: ");
            alunos[i].curso = Console.lerString();
            System.out.print("Campus: ");
            alunos[i].campus = Console.lerString();
        }

        System.out.println("\nALUNOS CADASTRADOS:");
        for (int i = 0; i < alunos.length; i++) {
            System.out.println(alunos[i].toString() + "\n");
        }

    }

}
