import java.util.ArrayList;
import java.util.List;

public class Principal {
    
    public static void main(String[] args) {
        
        // exemploSobrecargas();

        // Instancias de Pessoa (super-classe)
        Pessoa p1 = new Pessoa("João Silva", 18);
        Pessoa p2 = new Pessoa();
        p2.setNome("Fulano");
        p2.setIdade(41);

        // Instâncias de Aluno (sub-classe de Pessoa)
        Aluno a1 = new Aluno("Zezinho", 20, 12345678);
        Aluno a2 = new Aluno();
        a2.setNome("Cicrano");
        a2.setIdade(33);
        a2.setRgm(32165400);

        // Instâncias de Professor (sub-classe de Pessoa)
        Professor pf1 = new Professor("Jason", 37, 909966 );
        Professor pf2 = new Professor();
        pf2.setNome("Beltrano");
        pf2.setIdade(55);
        pf2.setMatricula(778899);

        // Instâncias de Bolsista (sub-classe de Aluno)
        Bolsista b1 = new Bolsista("Bob", 22, 12365489, 50.5f);
        Bolsista b2 = new Bolsista();
        b2.setNome("Maria");
        b2.setIdade(30);
        b2.setRgm(78945612);
        b2.setPercentualBolsa(25);

        Pessoa p3 = new Aluno();
        Pessoa p4 = new Professor();

        // "Polimorfismo" (veremos melhor sbre o conceito mais adiante)
        p3.setNome("Hugo");
        p3.setIdade(13);
        // Não permite: p3.setRgm(11122200);

        p4.setNome("Igor");
        p4.setIdade(68);
        // Não permite: p4.setMatricula(123456);

        // Não permite o inverso:
        // Aluno a3 = new Pessoa();

        System.out.println("\nP1:" + p1);
        System.out.println("\nP2:" + p2);
        System.out.println("\nP3:" + p3);
        System.out.println("\nP4:" + p4);

        System.out.println("\nA1:" + a1);
        System.out.println("\nA2:" + a2);

        System.out.println("\nPf1:" + pf1);
        System.out.println("\nPf2:" + pf2);

        System.out.println("\nB1:" + b1);
        System.out.println("\nB2:" + b2);



        // Situação comum onde polimorfismo é aplicado:
        // List<Pessoa> listaPessoas = new ArrayList<>();


    }

    // método de exemplo
    private static void exemploSobrecargas(){
        // uso da sobrecarga do construtor:
        // parametrizado:
        Pessoa p1 = new Pessoa("Jason", 37);
        // padrão:
        Pessoa p2 = new Pessoa();

        // mostrando dados dos objetos na tela
        System.out.println(p1);
        System.out.println(p2);

        // chamando sobrecargas do método "somar"

        System.out.println("Soma dos inteiros:");
        // sobrecarga com retorno int:
        System.out.println(somar(2, 5));

        System.out.println("\nSoma dos reais:");
        // sobrecarga com retorno float
        System.out.println(somar(2.5f, 8.9f));
    }

    // método para somar inteiros
    private static int somar (int n1, int n2) {
        return n1 + n2;
    }

    // método para somar valores reais
    private static float somar(float n1, float n2) {
        return n1 + n2;
    }


}
