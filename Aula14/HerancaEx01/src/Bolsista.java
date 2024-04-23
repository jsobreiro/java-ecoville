public class Bolsista extends Aluno {
    
    private float percentualBolsa;
    
    
    public Bolsista() {
    }

    public Bolsista(String nome, int idade, int rgm, float percentualBolsa) {
        super(nome, idade, rgm);
        this.percentualBolsa = percentualBolsa;
    }

    public float getPercentualBolsa() {
        return percentualBolsa;
    }

    public void setPercentualBolsa(float percentualBolsa) {
        this.percentualBolsa = percentualBolsa;
    }

    @Override
    public String toString() {
        
        String txt = super.toString() + 
        "\nPercentual da bolsa: " + percentualBolsa;

        return txt;
    }

}
