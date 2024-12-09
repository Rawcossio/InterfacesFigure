package Figuras;

public class Triangulo implements FigurasGeometricas{
    //Atributos
    private int base, altura;

    public Triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    @java.lang.Override
    public double calcularArea() {
        return (base*altura)*2;
    }

    @java.lang.Override
    public double calcularPerimetro() {
        return base*3;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
}
