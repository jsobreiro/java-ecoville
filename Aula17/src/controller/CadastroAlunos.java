package controller;
import java.util.ArrayList;

import model.Aluno;

public class CadastroAlunos {
    
    private static ArrayList<Aluno> listaAlunos = new ArrayList<>();

    public static void cadastrarAluno(Aluno aluno) {
        listaAlunos.add(aluno);
    }

    public static ArrayList<Aluno> getListaAlunos() {
        return listaAlunos;
    }

}
