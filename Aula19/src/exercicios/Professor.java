package exercicios;

public class Professor extends Funcionario implements FolhaPagamento {
    
    private String disciplina;

    public Professor() {
      
    }


    public Professor(int matricula, String nome, 
                    float valorHora, float horasTrab, 
                    String disciplina) {
        super(matricula, nome, valorHora, horasTrab);
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
                "\nDisciplina: " + disciplina +
                "\nSalário: " + calcularSalario();
    }

    @Override
    public float calcularSalario() {
        return valorHora * getHorasTrab();
    }
   
}
