public class Funcionario {
    
    // ATRIBUTOS
    private String nome;
    private float horasTrab;
    private float valorHora;
    private float salario;

    // GETTERS
    public String getNome() {
        return nome;
    }

    public float getHorasTrab() {
        return horasTrab;
    }

    public float getValorHora() {
        return valorHora;
    }

    public float getSalario() {
        return salario;
    }

    // SETTERS
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setHorasTrab(float horasTrab) {
        this.horasTrab = horasTrab;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    // Usar o setSalario apenas se quiser setar o valor
    // diretamente. Caso contrário, utilizar o método
    // calcularSalario
    public void setSalario(float salario) {
        this.salario = salario;
    }

    // CONSTRUTORES

    // PADRÃO
    public Funcionario() {

    }

    // PARAMETRIZADO (parcialmente)
    public Funcionario(String nome, float horasTrab, float valorHora) {
        this.nome = nome;
        this.horasTrab = horasTrab;
        this.valorHora = valorHora;
        calcularSalario();
    }


    // MÉTODOS PRÓPRIOS
    public void calcularSalario() {
        salario = horasTrab * valorHora;
    }

    public void exibirFolhaPagamento() {

        System.out.println("Funcionário: " + nome);
        System.out.println("Horas trabalhadas: " + horasTrab);
        System.out.println("Valor da hora: R$ "+ valorHora);
        System.out.println("Salário: " + salario);

    }

}
