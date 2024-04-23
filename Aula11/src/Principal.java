public class Principal {

    public static void main(String[] args) {

        String nomeFunc;
        float horasTrab;
        float valorHora;
        int op;

        do {

            System.out.println("FOLHA DE PAGAMENTO");
            System.out.print("Nome do funcionário: ");
            nomeFunc = Console.lerString();

            System.out.print("Horas trabalhadas: ");
            horasTrab = Console.lerFloat();

            System.out.print("Valor da hora: R$ ");
            valorHora = Console.lerFloat();

            FolhaPagamento folha = new FolhaPagamento(nomeFunc, valorHora, horasTrab);
            folha.mostrarFolha();

            System.out.println("\nDeseja calcular outra folha de pagamento?");
            System.out.println("1) Sim");
            System.out.println("0) Não");
            System.out.print("Sua opção:");
            op = Console.lerInt();

            // verificação extra:
            while (op != 1 && op != 0) {
                System.out.println("\nOpção inválida, digite novamente:");
                System.out.println("\nDeseja calcular outra folha de pagamento?");
                System.out.println("1) Sim");
                System.out.println("0) Não");
                System.out.print("Sua opção:");
                op = Console.lerInt();
            }

            System.out.println(); // quebra de linha extra

        } while (op != 0);



    }


    

}
