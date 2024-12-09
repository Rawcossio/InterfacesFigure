package Figuras;

public class Circulo implements FigurasGeometricas {
    private double redio;
    private final double pi = 3.1416;

    public Circulo(double redio) {
        this.redio = redio;
    }

    @java.lang.Override
    public double calcularArea() {
        return pi*(redio*redio);
    }

    @java.lang.Override
    public double calcularPerimetro() {
        return 2*pi*redio;
    }

    public double getRedio() {
        return redio;
    }

    public void setRedio(double redio) {
        this.redio = redio;
    }

    public double getPi() {
        return pi;
    }
}

