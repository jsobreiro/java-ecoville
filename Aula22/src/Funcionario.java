public abstract class Funcionario {
    
    protected int matricula;
    protected String nome;
    protected float horasTrab;
    protected float valorHora;
    protected float salBruto;
    protected float salLiq;
    protected float ir;
    protected float inss;
    protected float fgts;

    public Funcionario(int matricula, String nome, float horasTrab, float valorHora) {
        this.matricula = matricula;
        this.nome = nome;
        this.horasTrab = horasTrab;
        this.valorHora = valorHora;

        calcularSalBruto();
    }

    public void calcularSalBruto() {
        salBruto = valorHora * horasTrab;
        calcularIr();
        calcularInss();
        calcularFgts();
        calcularSalLiquido();
    }

    public void calcularIr(){

        if (salBruto <= 1372.81f) {
            ir = 0;
            return;
        }

        if (salBruto <= 2743.25f) {
            ir = salBruto * 0.15f;
            return;
        }

        ir = salBruto * 0.275f;

    }

    public void calcularInss() {

        if (salBruto <= 868.29f) {
            inss = salBruto * 0.08f;
            return;
        }

        if (salBruto <= 1447.14f) {
            inss = salBruto * 0.09f;
            return;
        }

        if (salBruto <= 2894.27f) {
            inss = salBruto * 0.11f;
            return;
        }

        inss = 318.37f;
    }

    public void calcularFgts() {
        fgts = salBruto * 0.08f;
    }

    public abstract void calcularSalLiquido();

    public abstract String retornarDados();


}
