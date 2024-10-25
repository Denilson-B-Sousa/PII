package lista02.exercicio12;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com o texto: ");
        String text = scanner.nextLine();

        System.out.println("Número de vogais encontradas no texto: " + numeroVogais(text));
    }

    public static int numeroVogais(String string) {
        int count = 0;
        for (int i = 1; i < string.length(); i++) {
            if (string.charAt(i) == 'a' || string.charAt(i) == 'e' || string.charAt(i) == 'i' || string.charAt(i) == 'o' || string.charAt(i) == 'u') {
                count++;
            }
        }

        return count;
    }
}
