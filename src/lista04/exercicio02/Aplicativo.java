package lista04.exercicio02;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Aplicativo {
    public static void main(String[] args) {

        ContaBancaria contaBancaria = new ContaBancaria("00123", "004-A", "Poupanca", new BigDecimal("2000.00"));

        Cliente cliente = new Cliente("Denilson", "12345678912", LocalDate.of(2004, 05, 16));


    }
}
