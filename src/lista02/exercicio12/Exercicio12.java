package lista02.exercicio12;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com o texto: ");
        String text = scanner.nextLine();

        System.out.println("Número de vogais encontradas no texto: " + vowelCount(text));
    }

    public static int vowelCount(String string) {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            char character = Character.toLowerCase(string.charAt(i));
            if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
                count++;
            }
        }

        return count;
    }
}
