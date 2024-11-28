package lista03.exercicio01;

import java.math.BigDecimal;

public class Teste {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario("João Silva", "Gerente", new BigDecimal("5000"));
        Funcionario funcionario02 = new Funcionario("Maria Oliveira", "Analista", new BigDecimal("4000"));

        funcionario.exibirDados();
        funcionario02.exibirDados();

        funcionario.exibirSalarioAnual();
    }
}
