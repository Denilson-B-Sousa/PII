package lista04.exercicio02;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;

public class Aplicativo {
    public static void main(String[] args) {

        ContaBancaria conta1 = new ContaBancaria(
                "00123",
                "004-A",
                new BigDecimal("2000.00"),
                ContaBancaria.TipoConta.POUPANCA
        );

        ContaBancaria conta2 = new ContaBancaria(
                "00124",
                "004-B",
                new BigDecimal("1000.00"),
                ContaBancaria.TipoConta.CORRENTE
        );

        ContaBancaria conta3 = new ContaBancaria(
                "00122",
                "004-C",
                new BigDecimal("3000.00"),
                ContaBancaria.TipoConta.ESPECIAL
        );

        ArrayList<ContaBancaria> contas = new ArrayList<>();
        contas.add(conta1);
        contas.add(conta2);

        conta1.depositar(new BigDecimal("100.00"));
        conta1.sacar(new BigDecimal("200.00"));

        Cliente cliente = new Cliente(
                "Denilson",
                "12345678912",
                LocalDate.of(2004, 5, 16),
                contas
        );

        cliente.adicionarConta(conta3);
        cliente.exibirInformacoes();
        conta1.exibirSaldo();


    }
}
