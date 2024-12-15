package lista04.exercicio02;

import lista04.utils.MoneyFormatter;

import java.math.BigDecimal;

public class ContaBancaria {
    private String numero;
    private String agencia;
    public enum TipoConta {
        POUPANCA,
        CORRENTE,
        SALARIO,
        ESPECIAL
    };

    private TipoConta tipoConta = TipoConta.POUPANCA;
    private BigDecimal saldo;

    MoneyFormatter currency = new MoneyFormatter();


    public void depositar(BigDecimal valor) {

        if(valor.compareTo(BigDecimal.ZERO) < 0) throw new IllegalArgumentException("Valor não pode ser negativo!");

        this.saldo = this.saldo.add(valor);

    }

    public void sacar(BigDecimal valor) {

        if(valor.compareTo(saldo) > 0) throw new IllegalArgumentException("Saldo insuficiente!");

        this.saldo = this.saldo.subtract(valor);
    }

    public void exibirSaldo() {
        System.out.println("Saldo em conta: " + currency.currencyFormatter(this.saldo));
    }

    public ContaBancaria(String numero, String agencia, BigDecimal saldo, TipoConta tipoConta) {
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
        this.tipoConta = tipoConta;
    }

    public String getNumero() {
        return numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public TipoConta getTipoConta() {
        return tipoConta;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

}
