import java.io.IOException;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        
        // Novas instâncias de Jogo:
        Jogo j1 = new Jogo(1, "The Last of Us", "Ação/Aventura");
        Jogo j2 = new Jogo(2, "Super Mario World", "Plataforma");
        Jogo j3 = new Jogo(3, "The Witcher 3", "RPG/Ação");

        // Tentar salvar jogos no arquivo:
        try {

            GerenciadorJogos.salvarJogo(j1);
            GerenciadorJogos.salvarJogo(j2);
            GerenciadorJogos.salvarJogo(j3);

            System.out.println("\n3 jogos foram salvos no arquivo!");

        } catch (IOException e) {

            System.out.println("\nErro ao ler ou gravar no arquivo: " + e.getMessage());
        }
        // Tentar exibir dados do arquivo:
        System.out.println("\nJogos Cadastrados");

        try {

            for (Jogo tempJogo : GerenciadorJogos.listarJogos()) {
                
                System.out.println(tempJogo);
            }

        } catch (Exception e) {
            
            System.out.println(e.getMessage());
        }

        // Tentar buscar jogo salvo no arquivo:

        System.out.println("\nProcurando jogo com código 2:");
        try {
            Jogo jogo = GerenciadorJogos.buscarJogo(2);
            System.out.println("Jogo encontrado: " + jogo);

            // apagar jogo com codigo 2:
            GerenciadorJogos.apagarJogo(2);
            System.out.println("\nJogo com código 2 foi excluído com sucesso!");

        
        } catch (Exception e) {

            System.out.println(e.getMessage());
        }


        System.out.println("\nProcurando jogo com código 5:");
        try {
            Jogo jogo = GerenciadorJogos.buscarJogo(5);
            System.out.println("Jogo encontrado: " + jogo);
        
        } catch (Exception e) {

            System.out.println(e.getMessage());
        }

        // Tentar exibir dados do arquivo:
        System.out.println("\nJogos Cadastrados");

        try {

            for (Jogo tempJogo : GerenciadorJogos.listarJogos()) {
                
                System.out.println(tempJogo);
            }

        } catch (Exception e) {
            
            System.out.println(e.getMessage());
        }


    }
}
