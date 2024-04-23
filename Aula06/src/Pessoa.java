public class Pessoa {
    String nome;
    int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Pessoa() {

    }

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public Pessoa(int idade) {
        nome = "Zé"; // hard coded
        this.idade = idade;
    }
}
