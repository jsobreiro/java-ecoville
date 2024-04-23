import java.util.ArrayList;
import java.util.List;

public class Colecao {

    private String nomeProprietario;

    private List<Jogo> listaJogos;

    public Colecao(String nomeProprietario) {
        this.nomeProprietario = nomeProprietario;
        listaJogos = new ArrayList<Jogo>();
    }

    public void cadastrarJogo(Jogo j) {
        listaJogos.add(j);
    }

    public String buscarJogo(String titulo) {

        String jogos = "\nResultado da busca:";
        boolean encontrou = false;
        
        for (Jogo temp : listaJogos) {
            
            // veriricar se o titulo informado é igual
            // ao título do jogo atual:
            if (temp.getTitulo().equals(titulo)) {
                jogos += temp.toString();
                encontrou = true;
            }

        }

        if (encontrou) {
            return jogos;
        }

        return "\nJogo " + titulo + " não localizado...";

    }

    public void listarJogos() {

        if (listaJogos.size() == 0) {
            System.out.println("\nNão há jogos na sua coleção...");
            return;
        }

        System.out.println("\nJogos Cadastrados:");
        for (Jogo temp : listaJogos) {
            
            System.out.println(temp);

        }

    }
    

}
