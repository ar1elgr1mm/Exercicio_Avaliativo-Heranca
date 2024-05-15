package Exercicio2;

public class Main02 {
    public static void main(String[] args) {
        Shape02 retangulo = new Retangulo02(5, 3);
        Shape02 circulo = new Circulo02(4);
        Shape02 losango = new Losango02(6, 4, 5);
        Shape02 hexagono = new Hexagono02(6);
        Shape02 pentagono = new Pentagono02(4, 5);

        System.out.println(retangulo.getNome() + ":");
        System.out.println("Área: " + retangulo.calcularArea());
        System.out.println("Perímetro: " + retangulo.calcularPerimetro());
        System.out.println();

        System.out.println(circulo.getNome() + ":");
        System.out.println("Área: " + circulo.calcularArea());
        System.out.println("Perímetro: " + circulo.calcularPerimetro());
        System.out.println();

        System.out.println(losango.getNome() + ":");
        System.out.println("Área: " + losango.calcularArea());
        System.out.println("Perímetro: " + losango.calcularPerimetro());
        System.out.println();

        System.out.println(hexagono.getNome() + ":");
        System.out.println("Área: " + hexagono.calcularArea());
        System.out.println("Perímetro: " + hexagono.calcularPerimetro());
        System.out.println();

        System.out.println(pentagono.getNome() + ":");
        System.out.println("Área: " + pentagono.calcularArea());
        System.out.println("Perímetro: " + pentagono.calcularPerimetro());
    }
}