
public class FolhaPagamento {

    private String nomeFuncionario;
    private float valorHora;
    private float horasTrab;
    private float salBruto;
    private float salLiq;
    private float ir;
    private float inss;
    private float fgts;


    public FolhaPagamento(String nomeFuncionario, float valorHora, float horasTrab) {
        this.nomeFuncionario = nomeFuncionario;
        this.valorHora = valorHora;
        this.horasTrab = horasTrab;
        calcularSalBruto();

    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    public float getHorasTrab() {
        return horasTrab;
    }

    public void setHorasTrab(float horasTrab) {
        this.horasTrab = horasTrab;
    }

    public float getSalBruto() {
        return salBruto;
    }

    public void setSalBruto(float salBruto) {
        this.salBruto = salBruto;
    }

    public float getSalLiq() {
        return salLiq;
    }

    public void setSalLiq(float salLiq) {
        this.salLiq = salLiq;
    }

    public float getIr() {
        return ir;
    }

    public void setIr(float ir) {
        this.ir = ir;
    }

    public float getInss() {
        return inss;
    }

    public void setInss(float inss) {
        this.inss = inss;
    }

    public float getFgts() {
        return fgts;
    }

    public void setFgts(float fgts) {
        this.fgts = fgts;
    }

    
    public void calcularSalBruto() {
        salBruto = valorHora * horasTrab;
        calcularIR();
        calcularFgts();
        calcularInss();
        calcularSalLiq();
    }

    public void calcularIR() {
        if (salBruto <= 1372.81f) {
            ir = 0;
        } else if (salBruto <= 2743.25f) {
            ir = salBruto * 0.15f;
        } else {
            ir = salBruto * 0.275f;
        }
    }

    public void calcularInss() {
        if (salBruto<= 868.29f) {
            inss = salBruto * 0.08f;
        } else if (salBruto <= 1447.14f) {
            inss = salBruto * 0.09f;
        } else if (salBruto <= 2894.27f) {
            inss = salBruto * 0.11f;
        } else {
            inss = 318.37f;
        }
    }
    
    public void calcularFgts() {
        fgts = salBruto  * 0.08f;
    }

    public void calcularSalLiq() {
        salLiq = salBruto - ir - inss;
    }

    public void mostrarFolha() {
        System.out.println("\nFolha de Pagamento Mensal:");
        System.out.println("Nome do func.: " + nomeFuncionario);
        System.out.println("Horas trabalhadas: " + horasTrab);
        System.out.println("Valor da hora: R$ " + valorHora);
        System.out.println("Salário Bruto: " + salBruto);
        System.out.println("IR: R$ " + ir);
        System.out.println("INSS: R$ " + inss);
        System.out.println("FGTS: R$ " + fgts);
        System.out.println("Salário líquido: " + salLiq + "\n");
    }
   

    
}