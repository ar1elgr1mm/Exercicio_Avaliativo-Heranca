package Exercicio2;

class Retangulo02 extends Shape02 {
    private double largura;
    private double altura;

    public Retangulo02(double largura, double altura) {
        super("Retângulo");
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return largura * altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (largura + altura);
    }
}