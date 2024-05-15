package Exercicio2;

class Pentagono02 extends Shape02 {
    private double lado;
    private double apotema;

    public Pentagono02(double lado, double apotema) {
        super("Pentágono");
        this.lado = lado;
        this.apotema = apotema;
    }

    @Override
    public double calcularArea() {
        return (5 * lado * apotema) / 2;
    }

    @Override
    public double calcularPerimetro() {
        return 5 * lado;
    }
}