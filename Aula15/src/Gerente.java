public class Gerente extends Funcionario{
    
    private String nomeProjeto;

    public Gerente(String nome, int matricula, String nomeProjeto) {
        super(nome, matricula);
        this.nomeProjeto = nomeProjeto;
    }

    public String getNomeProjeto() {
        return nomeProjeto;
    }

    public void setNomeProjeto(String nomeProjeto) {
        this.nomeProjeto = nomeProjeto;
    }

    @Override
    public String toString() {
        
        return super.toString() +
        "\nNome do projeto: " + nomeProjeto;
    }

    

}
