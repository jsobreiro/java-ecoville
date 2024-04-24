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

    public static boolean listaAlunosVazia() {
        // retorna true, se vazia, ou false, se há cadastros
        return listaAlunos.isEmpty(); 
    }

        public static Aluno buscarAluno(int matricula) {

            for(Aluno tempAluno : listaAlunos) {

                if (tempAluno.getMatricula() == matricula) {
                    return tempAluno;
                }
            }

            return null;

        }

}
