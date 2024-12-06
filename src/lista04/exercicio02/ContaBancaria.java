package lista04.exercicio02;

import java.math.BigDecimal;

public class ContaBancaria {
    private String numero;
    private String agencia;

    private String tipoConta;
    private BigDecimal saldo;

    public BigDecimal adicionarSaldo(BigDecimal valor) {

        this.saldo = this.saldo.add(valor);

        return this.saldo;
    }

    public BigDecimal retirarSaldo(BigDecimal valor) {
        this.saldo = this.saldo.subtract(valor);
        return this.saldo;
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
}
