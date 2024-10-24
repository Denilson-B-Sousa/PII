package concepts.aula02.examples;

import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o número da sequência: ");
        int number = scanner.nextInt();
        System.out.println(" " + fib(number));
    }

    public static int fib(int n) {

        if(n == 0) return 0;
        if(n == 1) return 1;

        return fib(n - 1) + fib(n - 2);

    }
}
