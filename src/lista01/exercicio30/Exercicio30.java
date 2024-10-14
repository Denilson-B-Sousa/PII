package lista01.exercicio30;

import java.util.Scanner;

public class Exercicio30 {
    public static void main(String[] args) {

        Scanner scanner  = new Scanner(System.in);

        int potencia = 1;

        System.out.println("Entre com a base da potência: ");
        int base = scanner.nextInt();

        System.out.println("Entre com o expoente da potência:");
        int expoente = scanner.nextInt();

        for(int i = 1; i <= expoente; i++) {
            potencia *= base;

        }

        System.out.println("Valor da potência: " + base + " ^ " + expoente + " = " + potencia);
    }
}
