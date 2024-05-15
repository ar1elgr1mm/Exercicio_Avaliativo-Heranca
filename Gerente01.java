package Exercicio1;

class Gerente01 extends Funcionario01 {

    public Gerente01(String nome, double valorHora, int horasTrabalhadas) {
        super(nome, valorHora, horasTrabalhadas);
    }

    @Override
    public double calcularSalario() {
        return valorHora * horasTrabalhadas * 1.05;
    }
}