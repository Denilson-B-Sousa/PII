package lista01.exercicio10;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

        System.out.println("Entre com o valor em dólares: ");
        BigDecimal dolarValue = scanner.nextBigDecimal();

        System.out.println("Entre com a taxa de câmbio: ");
        double exchangeRate = scanner.nextDouble();


        BigDecimal reais = dolarValue.multiply(BigDecimal.valueOf(exchangeRate));

        System.out.println("\nValor em Reais: " + currencyInstance.format(reais));


    }
}
