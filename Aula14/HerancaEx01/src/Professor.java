public class Professor extends Pessoa{

    private int matricula;

    public Professor() {

    }
    
    public Professor(String nome, int idade, int matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        String txt = super.toString() + 
        "\nMatrícula: " + matricula;

        return txt;
    }

    
}
