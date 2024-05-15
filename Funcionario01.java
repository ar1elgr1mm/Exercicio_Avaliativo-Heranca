package Exercicio1;

abstract class Funcionario01 {
    protected String nome;
    protected double valorHora;
    protected int horasTrabalhadas;

    public Funcionario01(String nome, double valorHora, int horasTrabalhadas) {
        this.nome = nome;
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public abstract double calcularSalario();

    public String getNome() {
        return nome;
    }
}