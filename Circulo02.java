package Exercicio2;

class Circulo02 extends Shape02 {
    private double raio;

    public Circulo02(double raio) {
        super("Círculo");
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }
}