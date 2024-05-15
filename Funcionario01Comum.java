package Exercicio1;

class Funcionario01Comum extends Funcionario01 {

    public Funcionario01Comum(String nome, double valorHora, int horasTrabalhadas) {
        super(nome, valorHora, horasTrabalhadas);
    }

    @Override
    public double calcularSalario() {
        return valorHora * horasTrabalhadas;
    }
}