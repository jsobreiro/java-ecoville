public class Contato {
    private String nome;
    private String telefone;

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public Contato() {}

}
