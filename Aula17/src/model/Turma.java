package model;
import java.util.ArrayList;

public class Turma {
    
    private int codigoTurma;
    private Professor professor;
    private ArrayList<Aluno> alunos;

    public Turma() {}

    public Turma(int codigoTurma, Professor professor, ArrayList<Aluno> alunos) {
        this.codigoTurma = codigoTurma;
        this.professor = professor;
        this.alunos = alunos;
    }

    public int getCodigoTurma() {
        return codigoTurma;
    }

    public void setCodigoTurma(int codigoTurma) {
        this.codigoTurma = codigoTurma;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }


    private String alunosToString() {

        String txt = "\n";

        for(Aluno temp : alunos) {
            txt += temp.getNome() + "\n";
        }

        return txt;

    }


    @Override
    public String toString() {
        
        return "\nCódigo da turma: " + codigoTurma +
        "\nProfessor: " + professor.getNome() + 
        "\nDisciplina: " + professor.getDisciplina() +
        "\nLista de Alunos: " + alunosToString();
    }
    

}
