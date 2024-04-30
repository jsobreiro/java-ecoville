package interfaces;

public class Quadrado implements Forma, Calculo {
    
    private float a;
    private float b;

    public Quadrado() {
        a = 2.5f;
        b = a;
    }

    public float getA() {
        return a;
    }

    public float getB() {
        return b;
    }

    public void setA(float a) {
        this.a = a;
        this.b = a;
    }

    public void setB(float b) {
        this.b = b;
        this.a = b;
    }

    @Override
    public void desenhar() {
       System.out.println("Desenhei um quadrado!");        
    }

    @Override
    public float calcularArea() {
       
        return a * b;
    }

}
