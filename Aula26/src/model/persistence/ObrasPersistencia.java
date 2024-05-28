package model.persistence;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import model.entities.ObraArte;

public abstract class ObrasPersistencia {

    private static final String ARQUIVO = "obras-de-arte.txt";

    public static void salvarObraNoArquivo (ArrayList<ObraArte> listaObras)  throws IOException {

        try (FileWriter fWriter = new FileWriter(ARQUIVO);
             BufferedWriter bWriter = new BufferedWriter(fWriter)) {

                for (ObraArte tempObra : listaObras) {
                    fWriter.write(tempObra + "\n");
                }
        }

    }

    public static void lerArquivo(ArrayList<ObraArte> listaObras) throws IOException {

        listaObras.clear();
        
        try (FileReader fReader = new FileReader(ARQUIVO);
             BufferedReader bReader = new BufferedReader(fReader)) {

            String linha;
            while ((linha = bReader.readLine()) != null) {
                
                ObraArte tempObra = new ObraArte();

                tempObra.fromString(linha);

                listaObras.add(tempObra);

            }

        }

    }

    public static void criarArquivoSeNaoExistir() {

        try {

            File arquivo = new File(ARQUIVO);

            if (!arquivo.exists()) {
                arquivo.createNewFile();
            }

        } catch (IOException exception) {

            System.out.println(exception.getMessage());
        }

    }


}
