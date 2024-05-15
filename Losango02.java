package Exercicio2;

class Losango02 extends Shape02 {
    private double diagonalMaior;
    private double diagonalMenor;
    private double lado;

    public Losango02(double diagonalMaior, double diagonalMenor, double lado) {
        super("Losango");
        this.diagonalMaior = diagonalMaior;
        this.diagonalMenor = diagonalMenor;
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return (diagonalMaior * diagonalMenor) / 2;
    }

    @Override
    public double calcularPerimetro() {
        return 4 * lado;
    }
}