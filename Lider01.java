package Exercicio1;

class Lider01 extends Funcionario01 {

    public Lider01(String nome, double valorHora, int horasTrabalhadas) {
        super(nome, valorHora, horasTrabalhadas);
    }

    @Override
    public double calcularSalario() {
        return valorHora * horasTrabalhadas * 1.02;
    }
}