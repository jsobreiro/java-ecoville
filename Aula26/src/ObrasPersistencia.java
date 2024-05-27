import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public abstract class ObrasPersistencia {

    private static final String ARQUIVO = "obras-de-arte.txt";

    public static void salvarObraNoArquivo (ObraArte obra)  throws IOException {

        try (FileWriter fWriter = new FileWriter(ARQUIVO, true);
             BufferedWriter bWriter = new BufferedWriter(fWriter)) {

                bWriter.write(obra + "\n");
        }

    }

    public static ArrayList<ObraArte> lerArquivo() throws IOException {

        ArrayList<ObraArte> tempLista = new ArrayList<>();
        
        try (FileReader fReader = new FileReader(ARQUIVO);
             BufferedReader bReader = new BufferedReader(fReader)) {

            String linha;
            while ((linha = bReader.readLine()) != null) {
                
                ObraArte tempObra = new ObraArte();

                tempObra.fromString(linha);

                tempLista.add(tempObra);

            }

        }

        return tempLista;

    }


}
