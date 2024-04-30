package exercicios;

public class Coordenador extends Funcionario implements FolhaPagamento{
    
    private String curso;
    private float gratificacao;

    public Coordenador() {

    }

    public Coordenador(int matricula, String nome, 
                        float valorHora, float horasTrab, 
                        String curso, float gratificacao) {
        super(matricula, nome, valorHora, horasTrab);
        this.curso = curso;
        this.gratificacao = gratificacao;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public float getGratificacao() {
        return gratificacao;
    }

    public void setGratificacao(float gratificacao) {
        this.gratificacao = gratificacao;
    }

    @Override
    public float calcularSalario() {
       return valorHora * getHorasTrab() + gratificacao;
    }

    @Override
    public String toString() {
       
        return super.toString() +
                "\nCurso que coordena: " + curso +
                "\nGratificação: R$ " + gratificacao +
                "\nSalário: " + calcularSalario();
    }
    
    

}
