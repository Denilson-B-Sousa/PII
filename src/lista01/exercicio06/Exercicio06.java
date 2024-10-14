package lista01.exercicio06;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double workedHours;
        double workedHoursValue;
        BigDecimal salary;
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

        System.out.println("Entre com o número de horas trabalhadas: ");
        workedHours = Double.parseDouble(scanner.nextLine());

        System.out.println("Entre com o valor recebido por hora trabalhada: ");
        workedHoursValue = Double.parseDouble(scanner.nextLine());

        salary = BigDecimal.valueOf(workedHours * workedHoursValue);

        System.out.println("Salário Total: " + currencyInstance.format(salary));

    }
}

/*
* 6- Cálculo de salário: Desenvolva um programa que leia o número de
horas trabalhadas e o valor por hora, e calcule o salário total.

* */