import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public abstract class GerenciadorJogos {

    private static final String ARQUIVO = "jogos.txt";
    


    public static void salvarJogo(Jogo jogo) throws IOException {

        try (FileWriter fw = new FileWriter(ARQUIVO, true);
             BufferedWriter bw = new BufferedWriter(fw)) {

            bw.write(jogo + "\n");

        }

    }

    public static ArrayList<Jogo> listarJogos() throws IOException, Exception {

        ArrayList<Jogo> listaJogos = new ArrayList<>();

        try (FileReader fr = new FileReader(ARQUIVO);
             BufferedReader br = new BufferedReader(fr)) {

                String linha;
                while ((linha = br.readLine()) != null) {
                    
                    Jogo jogo = Jogo.fromString(linha);
                    listaJogos.add(jogo);
                }
        } 

        if (listaJogos.isEmpty()) {
            throw new Exception("\nNão há jogos cadastrados");
        }

        return listaJogos;

    }

    public static Jogo buscarJogo(int codigo) throws Exception {

        ArrayList<Jogo> listaJogos = listarJogos();

        for (Jogo tempJogo : listaJogos) {

            if(tempJogo.getCodigo() == codigo) {

                return tempJogo;
            }
        }

        throw new Exception("\nJogo com o código " + codigo + " não localizado!");

    }

    public static void apagarJogo(int codigo) throws Exception{

        ArrayList<Jogo> listaJogos = listarJogos();       
    
        boolean encontrou = false;
        for (Jogo temp : listaJogos) {

            if(temp.getCodigo() == codigo) {
                listaJogos.remove(temp);
                encontrou = true;
                break;
            }
        }

        if (!encontrou) {
            throw new Exception("\nJogo com o código " + codigo + " não localizado!");
        }

        // sobrescrever arquivo com array list atualizado:
        try (FileWriter fw = new FileWriter(ARQUIVO);
        BufferedWriter bw = new BufferedWriter(fw)) {

            for (Jogo j : listaJogos) {

                bw.write(j + "\n");
            }
        }
    }

}
