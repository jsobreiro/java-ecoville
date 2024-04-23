import java.util.Scanner;

public class Aula01 {
    
    public static void main(String[] args) {
        // criar "leitor" para entrada de dados:
        Scanner leitor = new Scanner(System.in);
        // Variável "nome" do tipo String:
        String nome;
        // Variável "txt" do tipo String com valor atribuido:
        String txt = "Java - Aula 01";
        
        // Saída de dados: mostrando valor de "txt"
        System.out.println(txt);
        // Sainda de dados: solicitação de entrada:
        System.out.print("Informe o nome do aluno: ");

        // Entrada de dados
        nome = leitor.nextLine();

        // mostrar valor de "nome" da tela:
        System.out.println("Aluno cadastrado: " + nome);


    }

}
