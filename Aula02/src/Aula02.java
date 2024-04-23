import java.util.Scanner;

public class Aula02 {
    
    public static void main(String[] args) {
        // declaração de variáveis e
        // saída de dados:
        String txt = "Aula 02 - Java\n";
        String aluno;

        System.out.print(txt);
        aluno = "Jason Soreiro";
        System.out.println("Aluno: " + aluno);

        // declarar outras variaveis
        String curso = "ES";
        int periodo = 3;
        String campus = "Ecoville";
        String turno = "Noite";

        String txtFormatado = "Curso: " + curso +
        "\nPeríodo: " + periodo + "º" +
        "\nCampus: " + campus + 
        "\nTurno: " + turno;

        System.out.println(txtFormatado);

        // entrada de dados:
        // criando "variável" para leitura de dados
        Scanner leitor = new Scanner(System.in);
        int dificuldade;

        System.out.println("\n\n");

        System.out.println("Qual o nível de dificuldade da disciplina até agora?");
        System.out.println("1 (Fácil) - 2 (Médio) - 3 (Difícil)");
        System.out.print("Informe um valor: ");
        // entrada de dados para a variável "dificuldade":
        dificuldade = leitor.nextInt();

        if (dificuldade == 1) {
            System.out.println("FÁCIL");
        }
        else if (dificuldade == 2) {
            System.out.println("MÉDIO");
        }
        else if (dificuldade == 3) {
            System.out.println("DIFÍCIL");
        }
        else {
            System.out.println("VALOR INVÁLIDO");
        }

        int avaliacao;

        System.out.println("\n\nAvalie o conteúdo:");
        System.out.println("1) Ruim - 2) Regular - 3) Bom");
        System.out.print("Informe um valor: ");
        avaliacao = leitor.nextInt();

        // switch case
        switch (avaliacao) {
            case 1:
                System.out.println("RUIM :(");
                break;

            case 2:
                System.out.println("REGULAR :|");
                break;

            case 3:
                System.out.println("BOM :)");
                break;
        
            default:
                System.out.println("VALOR INVÁLIDO!");
                break;
        }

    }


}
