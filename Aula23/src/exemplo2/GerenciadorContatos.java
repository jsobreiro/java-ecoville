package exemplo2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public abstract class GerenciadorContatos {
    
    private static final String AGENDA = "agenda.txt";

    public static void salvarContato(Contato contato) throws IOException {

        try (FileWriter fw = new FileWriter(AGENDA, true);
             BufferedWriter bw = new BufferedWriter(fw)) {

                bw.write(contato.toString() + "\n");
        }

    }

    public static ArrayList<Contato> lerContatos() throws IOException {

        ArrayList<Contato> contatos = new ArrayList<>();
        
        try (FileReader fr = new FileReader(AGENDA);
            BufferedReader br = new BufferedReader(fr)) {

            String linha;
            

            while((linha = br.readLine()) != null) {

                String[] dados = linha.split(", ");
                
                Contato tempContato = new Contato(dados[0], dados[1]);

                contatos.add(tempContato);
            }
        }

        return contatos;

    }


}
