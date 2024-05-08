public class Desenvolvedor extends Funcionario{

    private String linguagensProg;

    public Desenvolvedor(int matricula, String nome, float horasTrab, float valorHora, String linguagensProg) {
        super(matricula, nome, horasTrab, valorHora);
        this.linguagensProg = linguagensProg;
    }

    public String getLinguagensProg() {
        return linguagensProg;
    }

    public void setLinguagensProg(String linguagensProg) {
        this.linguagensProg = linguagensProg;
    }

    @Override
    public void calcularSalLiquido() {
        salLiq = salBruto - ir - inss;
        
    }

    @Override
    public String retornarDados() {
        String txt = "\nMatrícula: " + matricula + 
        "\nNome do Gerente: " + nome +
        "\nLinguagens que domina: " + linguagensProg +
        "\nValor da hora de trab.: R$ " + valorHora +
        "\nHoras trabalhadas: " + horasTrab + "h" +
        "\nIR do mês: R$ " + ir +
        "\nINSS do mês: R$ " + inss +
        "\nFGTS recolhido: R$ " + fgts +
        "\nSalário Líquido: R$ " + salLiq;

        return txt;
    }

    


}
