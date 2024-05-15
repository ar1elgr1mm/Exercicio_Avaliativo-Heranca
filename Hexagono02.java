package Exercicio2;

class Hexagono02 extends Shape02 {
    private double lado;

    public Hexagono02(double lado) {
        super("Hexágono");
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return (3 * Math.sqrt(3) * lado * lado) / 2;
    }

    @Override
    public double calcularPerimetro() {
        return 6 * lado;
    }
}