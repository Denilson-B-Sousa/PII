package lista03.exercicio01;

import lista03.exercicio01.utils.MoneyFormatter;

import java.math.BigDecimal;

public class Funcionario {

    private String nome;
    private String sobrenome;
    private BigDecimal salarioMensal;
    private BigDecimal TAXA_AUMENTO = new BigDecimal("0.10");

    public Funcionario(String nome, String sobrenome, BigDecimal salarioMensal) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salarioMensal = salarioMensal;
    }

    public void exibirDados() {
        MoneyFormatter currencyFormatter = new MoneyFormatter();

        System.out.println("\nNome: " + this.nome);
        System.out.println("Sobrenome: " + this.sobrenome);
        System.out.println("Salário Anual: " + currencyFormatter.format(this.exibirSalarioAnual()));
    }


    public BigDecimal exibirSalarioAnual() {
        BigDecimal salarioAnual = salarioMensal.multiply(new BigDecimal("12"));
        BigDecimal aumento = salarioAnual.multiply(TAXA_AUMENTO);

        return salarioAnual.add(aumento);
    }

    public String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    private void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public BigDecimal getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(BigDecimal salarioMensal) {
        if(salarioMensal.compareTo(BigDecimal.ZERO) < 0) {
            this.salarioMensal = new BigDecimal("0.0");
        } else {
            this.salarioMensal = salarioMensal;
        }
    }



}
