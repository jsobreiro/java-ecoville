import java.util.Scanner;

public class Aula03 {
    
    static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {
                
      int op;

      do {
            System.out.println("\nAULA 03 - MENU");
            System.out.println("1) Exemplo FOR");
            System.out.println("2) Exemplo While");
            System.out.println("3) Exemplo Do/While");
            System.out.println("4) Exemplo vetor");
            System.out.println("0) Sair");
            System.out.print("Informe uma opção: ");
            op = leitor.nextInt();

            switch (op) {
                case 1:
                    exemploFor();
                    break;
                case 2:
                    exemploWhile();
                    break;
                case 3:
                    exemploDoWhile();
                    break;
                case 4:
                    exemploVetor();
                    break;
                case 0:
                    System.out.println("\nFIM DO PROGRAMA...");
                    break;            
                default:
                    System.out.println("\nOPÇÃO INVÁLIDA. DIGITE NOVAMENTE\n");
                    break;
            }
            // quebra de linha antes de reixibir o menu
            System.out.println(); 

      } while (op != 0);

    }

    public static void exemploFor() {
        
        /*
         * Ler um valor inteiro e mostrar na tela
         * a tabuada deste valor, do x1 ao x10
         */
        System.out.println("\nEXEMPLO FOR:");
        System.out.print("Informe um valor inteiro: ");
        int valor = leitor.nextInt();

        System.out.println("\nTabuada do " + valor);
        for(int i = 1; i <= 10; i++) {
            //int mult = valor * i;
            System.out.println(valor + " x " + i + " = " + (valor * i));
        }

    }

    public static void exemploWhile() {

        /*
         * Ler um valor inteiro e mostrar todos os valores
         * entre o número digitado e 100.
         */
        System.out.println("\nEXEMPLO WHILE:");
        System.out.print("Informe um valor inteiro: ");
        int valor = leitor.nextInt();

        if (valor > 100) {
            System.out.println("Valor é maior que 100");
        }

        while (valor <= 100) {
            System.out.println("Valor atual " + valor);
            valor++; // valor = valor + 1;
        }

    }

    public static void exemploDoWhile() {

        /*
         * Solicitar a entrada de um valor inteiro que esteja entre
         * 100 e 200. Mostrar todos os valores PARES dentro deste intervalo.
         * (número digitado até 200); Se for informado um valor FORA
         * do intervalo solicitado, pedir para o usuário digitar novamente e
         * não prosseguir enquanto esta condição não for atendida
         */
        System.out.println("\nEXEMPLO DO/WHILE:");
        int valor;
        

        do {
            System.out.print("\nInforme um valor inteiro ENTRE 100 e 200: ");
            valor = leitor.nextInt();
        } while (valor < 100 || valor > 200);

        while (valor <= 200) {
            
            if(valor % 2 == 0) {
                System.out.println("Valor par atual: " + valor);
            }
            valor++;
        }
    }

    public static void exemploVetor() {

        /*
         * Ler 5 valores do teclado e armazenar esses valores
         * em um vetor de inteiros. Em seguida, armazenar em um
         * segundo vetor, o dobro dos valores do primeiro.
         * Mostrar os dois vetores na tela
         */
        
         int[] vetor = new int[5];
         int[] dobro = new int[5];

        // atribuindo valores a um vetor na sua declaração
        int[] exemplo = {2, 4, 5, 7, 8};


         System.out.println("\nEXEMPLO VETOR");

         for(int i = 0; i < vetor.length; i++) {
            // leitura de dados pra o vetor "vetor":
            System.out.print("Valor para a pos " + i + ": ");
            vetor[i] = leitor.nextInt();
            // atribuição de valores para o vetor "dobro"
            dobro[i] = vetor[i] * 2;
         }

         System.out.println("\nPRIMEIRO VETOR:");
         for(int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
         }

         System.out.println("\nSEGUNDO VETOR:");
         for(int i = 0; i < dobro.length; i++) {
            System.out.print(dobro[i] + " ");
         }


    }

}
