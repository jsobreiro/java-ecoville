package controller;

import java.util.ArrayList;

import model.Turma;

public class CadastroTurmas {
    
    private static ArrayList<Turma> turmas = new ArrayList<>();

    public static void cadastrarTurma(Turma turma) {
        turmas.add(turma);
    }

    public static ArrayList<Turma> getListaTurmas() {
        return turmas;
    }

    public static Turma buscarTurma(int codigoTurma) {

        for (Turma tempTurma : turmas) {

            if (tempTurma.getCodigoTurma() == codigoTurma) {
                return tempTurma;
            }
        }

        return null;
    }
    

}
