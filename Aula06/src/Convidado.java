public class Convidado {
    
    private String nome;
    private String email;

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

    public Convidado() {

    }

    public Convidado(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

}
