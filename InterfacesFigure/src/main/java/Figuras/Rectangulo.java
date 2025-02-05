package Figuras;

public class Rectangulo implements FigurasGeometricas {
    private int lado1, lado2, numlados;

    public Rectangulo(int numlados, int lado1, int lado2) {
        this.numlados=numlados;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    @java.lang.Override
    public double calcularArea() {
        return lado1*lado2;
    }

    @java.lang.Override
    public double calcularPerimetro() {
        return 2*(lado1+lado2);
    }

    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

}
