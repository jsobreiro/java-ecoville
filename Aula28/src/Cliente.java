public class Cliente {
    
    private String nome;
    private String email;
    private String endereco;
    
    public Cliente(String nome, String email, String endereco) {
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String exibirDadosCliente() {
        return "\nNome: " + nome +
                "\nE-mail: " + email +
                "\nEndereço: " + endereco;
    }


}