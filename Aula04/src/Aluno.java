public class Aluno {
    String nomeAluno;
    String curso;
    String campus;

    @Override
    public String toString() {
        String txt = "Aluno: " + nomeAluno + "\n" +
        "Curso: " + curso + " (" + campus + ")";
        return txt;
    }
}
