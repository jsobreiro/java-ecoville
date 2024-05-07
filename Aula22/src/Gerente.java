public class Gerente extends Funcionario {

    private String nomeProjeto;
    private float valorBonus;

    public Gerente(int matricula, String nome, float horasTrab, float valorHora, String nomeProjeto, float valorBonus) {
        super(matricula, nome, horasTrab, valorHora);
        this.nomeProjeto = nomeProjeto;
        this.valorBonus = valorBonus;
    }

    @Override
    public void calcularSalLiquido() {
        
        salLiq = salBruto - ir - inss + valorBonus;
        
    }

    @Override
    public String retornarDados() {
        
        String txt = "\nMatrícula: " + matricula + 
        "\nNome do Gerente: " + nome +
        "\nNome do Projeto: " + nomeProjeto +
        "\nValor da hora de trab.: R$ " + valorHora +
        "\nHoras trabalhadas: " + horasTrab + "h" +
        "\nValor do Bônus: R$ " + valorBonus +
        "\nIR do mês: R$ " + ir +
        "\nINSS do mês: R$ " + inss +
        "\nFGTS recolhido: R$ " + fgts +
        "\nSalário Líquido: R$ " + salLiq;

        return txt;
    }

    

    


}
