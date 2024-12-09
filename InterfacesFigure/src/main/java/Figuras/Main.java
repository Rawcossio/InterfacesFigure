package Figuras;

public class Main {
    public static void main(String[] args) {
        Rectangulo rectangulo=new Rectangulo(4,5,3);
        Triangulo triangulo=new Triangulo(5,3);
        Circulo circulo=new Circulo(3);

//        System.out.println("el area del rectangulo es: "+rectangulo.calcularArea());
//        System.out.println("el perimetro del rectangulo es: "+rectangulo.calcularPerimetro());
//        System.out.println("el area del triangulo es: "+triangulo.calcularArea());
//        System.out.println("el perimetro del triangulo es: "+triangulo.calcularPerimetro());

        System.out.println("el area del triangulo es: "+circulo.calcularArea());
        System.out.println("el perimetro del triangulo es: "+circulo.calcularPerimetro());




    }
}
