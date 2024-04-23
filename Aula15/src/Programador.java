public class Programador extends Funcionario {

    private String senioridade;

    public Programador(String nome, int matricula, String senioridade) {
        super(nome, matricula);
        this.senioridade = senioridade;
    }

    public String getSenioridade() {
        return senioridade;
    }

    public void setSenioridade(String senioridade) {
        this.senioridade = senioridade;
    }

    @Override
    public String toString() {

        return super.toString() +
        "\nSenioridade: " + senioridade;
    }

    
    
}
