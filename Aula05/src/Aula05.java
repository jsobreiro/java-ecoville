public class Aula05 {

    public static void main(String[] args) {
        
        //exemploPessoa();
        exemploCarro();
        
    }
    
    public static void exemploPessoa() {

        // instanciando objeto do tipo Pessoa
        Pessoa p1 = new Pessoa();
        p1.nome = "Jason Sobreiro";
        p1.idade = 37;
    
        System.out.println("Aula 05");
        System.out.println("Dados da pessoa p1:");
        System.out.println("Nome: " + p1.nome);
        System.out.println("Idade: " + p1.idade);
    
        // Instanciando objeto p2
        Pessoa p2 = new Pessoa();
        System.out.println("\nInforme os dados de p2:");
        System.out.print("Nome: ");
        p2.nome = Console.lerString();
        System.out.print("Idade: ");
        p2.idade = Console.lerInt();
        
        System.out.println("\nDados da pessoa p2:");
        System.out.println("Nome: " + p2.nome);
        System.out.println("Idade: " + p2.idade);
    
        // Jeito errado de se copiar um objeto:
        Pessoa p3 = new Pessoa();
        p3 = p2; // p3 aponta para mesmo lugar de p2
        // Na pratica, são o mesmo objeto
    
        p3.idade = 25;
    
        System.out.println("\nIdade de p2: " + p2.idade);
    
        System.out.println("\nDados de p3:");
        System.out.println(p3.toString());
    
        // Jeito certo de se copiar um objeto
        Pessoa p4 = new Pessoa();
        p4.nome = p1.nome;
        p4.idade = p1.idade;
    
        System.out.println("\nDados de p4:");
        System.out.println(p4.toString());
    
        p4.nome = "Beltrano";
        System.out.println("\nNome de p1: " + p1.nome);
        System.out.println("Nome de p4: " + p4.nome);
    

    }
    
    public static void exemploCarro() {

        Carro carro1 = new Carro();

        System.out.println("Cadastro do carro1:");
        System.out.print("Modelo: ");
        carro1.modelo = Console.lerString();
        System.out.print("Ano: ");
        carro1.ano = Console.lerInt();
        System.out.print("Cor: ");
        carro1.cor = Console.lerString();

        System.out.println("\nDados do carro1:");
        System.out.println(carro1.toString());

        Carro carro2 = new Carro();
        System.out.println("\nDados do carro2:");
        System.out.println(carro2.toString());

        System.out.println(); // quebra de linha

        carro1.ligar();
        carro2.ligar();
        
        System.out.println();

        carro1.desligar();
        carro2.desligar();

        Carro carro3 = new Carro("Nissan Versa", 2018, "Branco");
        System.out.println("\nDados do carro3:");
        System.out.println(carro3.toString());

        carro3.modelo = "Nissan Sentra";
        System.out.println("\nModelo alterado do carro3: " + carro3.modelo);
    
        
        System.out.println("\nCadastro do Carro 4:");
        System.out.print("Modelo: ");
        String modelo = Console.lerString();
        System.out.print("Ano: ");
        int ano = Console.lerInt();
        System.out.print("Cor: ");
        String cor = Console.lerString();

        Carro carro4 = new Carro(modelo, ano, cor);

        System.out.println("\nMostrando dados de Carro4:");
        System.out.println(carro4.toString());

        int valor = Console.lerInt();
    
    }
}
;