package lista02.exercicio19;

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com texto a ser invertido: ");
        String text = scanner.nextLine();

        System.out.println("Texto invertido: " + invertedText(text));
    }

    public static String invertedText(String text) {

        return text.isEmpty() ? text : invertedText(text.substring(1)) + text.charAt(0);
    }
}
