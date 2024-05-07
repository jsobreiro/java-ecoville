public class ContaPoupanca extends ContaBancaria {
    
    private int taxaJuros;
    
    public ContaPoupanca(float numeroConta, float saldo, int taxaJuros) {
        super(numeroConta, saldo);
        this.taxaJuros = taxaJuros;
    }

    public int getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(int taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    @Override
    public String depositar(float valor) {
        
        float deposito = valor + (((float)taxaJuros / 100) * saldo);
        saldo += deposito;

        return "Depositado R$ " + deposito + " na conta " + numeroConta;
    }

    @Override
    public String sacar(float valor) throws Exception {
        
        if (valor > saldo) {
            throw new Exception("O valor " + valor 
            + " é superior ao saldo (R$ " + saldo + ")");
        }

        return "R$ " + valor + " sacado da conta " + numeroConta;
    }

    @Override
    public String retornarSaldo() {
        
        return super.retornarSaldo() + 
        "\nTaxa de Juros: " + (float)taxaJuros/100 + "% ao mês";
    }

    

    


}
