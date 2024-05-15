package Exercicio1;

public class Main01 {
    public static void main(String[] args) {
        Funcionario01 comum = new Funcionario01Comum("Ariel", 100, 10);
        Funcionario01 lider = new Lider01("Leanderson", 200, 10);
        Funcionario01 gerente = new Gerente01("Walter", 300, 10);

        System.out.println(comum.getNome() + " - Salário: R$ " + comum.calcularSalario());
        System.out.println(lider.getNome() + " - Salário: R$ " + lider.calcularSalario());
        System.out.println(gerente.getNome() + " - Salário: R$ " + gerente.calcularSalario());
    }
}