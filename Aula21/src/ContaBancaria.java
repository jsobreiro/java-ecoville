public abstract class ContaBancaria {
    
    protected float numeroConta;
    protected float saldo;

    public ContaBancaria(float numeroConta, float saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public abstract String depositar(float valor);
    public abstract String sacar(float valor) throws Exception;

    public String retornarSaldo(){
        return "Saldo da conta " + numeroConta + ": " + saldo;
    }

    

}
