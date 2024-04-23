public class Pessoa {

    String nome;
    int idade;

    @Override
    public String toString() {
        String txt = "Nome " + nome + "\n" +
                     "Idade: " + idade;
        return txt;
    }
    
}
