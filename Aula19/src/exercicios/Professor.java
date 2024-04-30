package exercicios;

public class Professor extends Funcionario implements FolhaPagamento {
    
    private String disciplina;

    public Professor() {
        super(); // chamada do construtor da superclasse
        disciplina = "Desenvolvimento de Software";
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
                "\nDisciplina: " + disciplina +
                "\nSalário: " + calcularSalario();
    }

    @Override
    public float calcularSalario() {
        return valorHora * getHorasTrab();
    }
   
}
