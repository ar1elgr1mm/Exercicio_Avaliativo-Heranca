package Exercicio2;

abstract class Shape02 {
    protected String nome;

    public Shape02(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public abstract double calcularArea();
    public abstract double calcularPerimetro();
}