package lista04.exercicio02;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;

public class Aplicativo {
    public static void main(String[] args) {

        try{
            ContaBancaria conta1 = new ContaBancaria("00123", "004-A", "Poupanca", new BigDecimal("2000.00"));

            conta1.depositar(new BigDecimal("100.00")); // R$2100
            conta1.sacar(new BigDecimal("200.00")); // R$1900

            System.out.println("Saldo da conta " + conta1.getNumero() + " : " + conta1.exibirSaldo());

            ArrayList<ContaBancaria> contas = new ArrayList<>();
            contas.add(conta1);

            Cliente cliente = new Cliente("Denilson", "12345678912", LocalDate.of(2004, 5, 16), contas);

            contas.forEach(System.out::println);

        } catch (Error error) {
            System.out.println(error.getMessage());
        }
    }
}
