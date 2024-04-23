package model;

public class Professor extends Pessoa {
    
    private String disciplina;

    public Professor() {
    }

    public Professor(String nome, String email, String disciplina) {
        super(nome, email);
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public String toString() {
        
        return super.toString() +
                "\nDisciplina: " + disciplina;
    }

    

}
