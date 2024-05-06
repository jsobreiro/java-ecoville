public class ContaCorrente extends ContaBancaria {

    private float chequeEspecial;

    public ContaCorrente(float numeroConta, float saldo, float chequeEspecial) {
        super(numeroConta, saldo);
        this.chequeEspecial = chequeEspecial;
    }

    public float getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(float chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    @Override
    public String depositar(float valor) {
        saldo += valor;
        return "R$ " + valor + " depositado na conta " + numeroConta;
    }

    @Override
    public String sacar(float valor) throws Exception {
       
        if (valor > (saldo + chequeEspecial)) {
        throw new Exception("Saldo insuficiente para saque no valor de R$ " 
                            + valor);
       }
       saldo -= valor;
       return "R$ " + valor + " sacado da conta " + numeroConta;
    }
    
}
