package model.persistence;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import model.entities.Livro;

public abstract class GerenciadorArquivo {

    private static final String ARQUIVO_LIVRO = "lista-livros.txt";

    
    public static void criarArquivoSeNaoExistir() {

        File arquivo = new File(ARQUIVO_LIVRO);

        try {
            if (!arquivo.exists()) {
                arquivo.createNewFile();
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        
        }
    }
    
    public static void lerArquivo(ArrayList<Livro> listaLivros) throws IOException{

        listaLivros.clear();

        try (FileReader fileReader = new FileReader(ARQUIVO_LIVRO);
        BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            String linha;
            while ((linha = bufferedReader.readLine()) != null) {
                
                Livro tempLivro = new Livro();

                tempLivro.fromString(linha);
               
                listaLivros.add(tempLivro);

            }

        } 

    }

    public static void salvarLivroNoArquivo(ArrayList<Livro> listaLivros) throws IOException{

        try (FileWriter fileWriter = new FileWriter(ARQUIVO_LIVRO);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {

                for(Livro tempLivro : listaLivros) {

                    bufferedWriter.write(tempLivro.toString() + "\n");

                }
        }

    }

}
