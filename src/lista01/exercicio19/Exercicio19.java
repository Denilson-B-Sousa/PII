package lista01.exercicio19;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

        double productValue;
        double discountPercentage;

        System.out.println("Entre com o valor do produto: ");
        productValue = scanner.nextDouble();

        System.out.println("Entre com o percentual de desconto: ");
        discountPercentage = scanner.nextDouble();

        double discountValue = productValue * discountPercentage / 100;

        double finalProductPrice = productValue - discountValue;

        System.out.println("\nValor final do produto com desconto aplicado: " + currencyInstance.format(finalProductPrice));

    }
}