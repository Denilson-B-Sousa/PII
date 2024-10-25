package lista02.exercicio10;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com o texto para ser invertido: ");
        String text = scanner.nextLine();

        System.out.println("Texto invertido: " + inverterString(text));
    }

    public static String inverterString(String string) {

        String inverseString = "";

        for(int i = string.length() - 1; i >= 0; i--) {
            inverseString += string.charAt(i);
        }

        return inverseString;
    }
}
