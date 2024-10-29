package lista02.exercicio10;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String text;

        System.out.println("Entre com o texto para ser invertido: ");
        text = scanner.nextLine();

        System.out.println("\nTexto invertido: " + inverterString(text));
    }

    public static String inverterString(String string) {

        return new StringBuilder(string).reverse().toString();

    }
}
