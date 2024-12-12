package lista04.exercicio02;

import java.math.BigDecimal;

public class ContaBancaria {
    private String numero;
    private String agencia;
    private String tipoConta;
    private BigDecimal saldo;

    public void depositar(BigDecimal valor) {

        if(valor.compareTo(BigDecimal.ZERO) < 0) throw new IllegalArgumentException("Valor não pode ser negativo!");

        this.saldo = this.saldo.add(valor);

    }

    public void sacar(BigDecimal valor) {

        if(valor.compareTo(saldo) > 0) throw new IllegalArgumentException("Saldo insuficiente!");

        this.saldo = this.saldo.subtract(valor);
    }

    public BigDecimal exibirSaldo() {
        return this.saldo;
    }

    public ContaBancaria(String numero, String agencia, String tipoConta, BigDecimal saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.tipoConta = tipoConta;
        this.saldo = saldo;
    }

    public String getNumero() {
        return numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "numero='" + numero + '\'' +
                ", agencia='" + agencia + '\'' +
                ", tipoConta='" + tipoConta + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
