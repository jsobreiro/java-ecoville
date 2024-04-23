public class ContaBancaria {

    // Atributos
    private int numeroConta;
    private String nomeTitular;
    private float saldo;

    // Setters
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    // Getters
    public int getNumeroConta() {
        return numeroConta;
    }
    public String getNomeTitular() {
        return nomeTitular;
    }

    public float getSaldo() {
        return saldo;
    }

    // Construtores
    public ContaBancaria() {}

    public ContaBancaria(int numeroConta, String nomeTitular, float saldo){
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    }

    public void sacar(float valor) {
        saldo -= valor;
        exibirSaldo();
    }

    public void depositar(float valor) {
        saldo += valor;
        exibirSaldo();
    }

    public void exibirSaldo() {
        System.out.println("Conta:" + numeroConta);
        System.out.println("Titular: " + nomeTitular);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("--------------------------\n");
    }

}
