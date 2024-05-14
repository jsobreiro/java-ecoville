package exemplo1;

import java.io.*;

public abstract class GerenciarCarros {
    
    private static final String ARQUIVO = "carros.txt";

    public static void salvarCarro(Carro carro) {

        try (FileWriter fw = new FileWriter(ARQUIVO, true);
        BufferedWriter bw = new BufferedWriter(fw)) {

            bw.write(carro.toString());

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

    }

    public static void apagarDados() {
        // TRY WITH RESOURCES:
        try (FileWriter fw = new FileWriter(ARQUIVO);
        BufferedWriter bw = new BufferedWriter(fw)) {
            // sobrescrever arquivo com uma String em branco
            bw.write("");

        } catch (IOException e) { // Captura exceção de I/O
            System.out.println(e.getMessage());
        }

    }

    public static void listarCarros() {

        try (FileReader fr = new FileReader(ARQUIVO);
        BufferedReader br = new BufferedReader(fr)) {
            
            String linha;
            while ((linha = br.readLine()) != null) {
                System.out.println("Carro: " + linha);
            }
            
        } catch (IOException e) {
           System.out.println("Erro ao criar ou acessar o arquivo: " + e.getMessage());
        }


    }

}
