public class Principal {
    
    public static void main(String[] args) {
        
        //exConstrutores();
        //exGettersSetters();
        exMetodosDeObjetos();

    }
    
    public static void exConstrutores(){
        
        Pessoa p1 = new Pessoa("Fulano", 22);
        System.out.println("Pessoa p1:");
        System.out.println(p1.nome);
        System.out.println(p1.idade);
    
        Pessoa p2 = new Pessoa();
        p2.nome = "Beltrano";
        p2.idade = 23;
        System.out.println("\nPessoa p2:");
        System.out.println(p2.nome);
        System.out.println(p2.idade);
    
        Pessoa p3 = new Pessoa("Cicrano");
        System.out.println("\nPessoa p3:");
        System.out.println(p3.nome);
        System.out.println(p3.idade);
    
        Pessoa p4 = new Pessoa(32);
        System.out.println("\nPessoa p4:");
        System.out.println(p4.nome);
        System.out.println(p4.idade);
    }

    public static void exGettersSetters() {

        Convidado c1 = new Convidado();
        c1.setNome("Fulano da Silva");
        c1.setEmail("fulano@gmail.com");

        System.out.println("Convidado c1:");
        System.out.println(c1.getNome());
        System.out.println(c1.getEmail());

        Convidado c2 = new Convidado("Beltrano", "beltrano@hotmail.com");
        System.out.println("\nConvidado c2:");
        System.out.println(c2.getNome());
        System.out.println(c2.getEmail());

        c2.setNome("Cicrano");
        System.out.println("\nNome alterado de c2: " + c2.getNome());

        Convidado c3 = new Convidado();
        System.out.println("\nCadastro do convidado c3:");
        System.out.print("Informe o nome: ");
        
        String nome = Console.lerString();
        c3.setNome(nome);

        System.out.print("Informe o e-mail: ");
        c3.setEmail(Console.lerString());

        System.out.println("\nConvidado c3:");
        System.out.println(c3.getNome());
        System.out.println(c3.getEmail());


    }       

    public static void exMetodosDeObjetos() {

        Funcionario f1 = new Funcionario();
        String nome;
        float valorHora;
        float horasTrab;

        System.out.println("\nCadastro do Funcionário 1:");
        System.out.print("\nNome: ");
        nome = Console.lerString();
        System.out.print("Horas trabalhadas: ");
        horasTrab = Console.lerFloat();
        System.out.print("Valor da hora: R$ ");
        valorHora = Console.lerFloat();

        f1.setNome(nome);
        f1.setHorasTrab(horasTrab);
        f1.setValorHora(valorHora);

        System.out.println();

        // calcular salário de f1:
        f1.calcularSalario();
        // mostrar dados de f1:
        System.out.println("\nDados do Funcionario 1");
        f1.exibirFolhaPagamento();

        // instanciar funcionario 2
        Funcionario f2 = new Funcionario("João Silva", 120f, 55.12f);
        System.out.println("\nDados do Funcionario 2");
        f2.exibirFolhaPagamento();
    }

}
