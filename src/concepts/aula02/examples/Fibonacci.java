package concepts.aula02.examples;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe quantos números da sequência devem aparecer: ");
        int quantity = scanner.nextInt();

        for(int i = 0; i < quantity; i++) {
            System.out.print(" " + fibonacci(i));
        }

    }

    public static int fibonacci(int number) {
        if( number ==  0) return 0;
        if(number == 1 ) return 1;

        // Retorna a soma dos dois números anteriores
        return fibonacci(number - 1) + fibonacci(number - 2);
    }

   /* *
      fibonacci(0) -> Retorna 0
      fibonacci(1) -> Retorna 1
      fibonacci(2) → retorna 1 (soma de fibonacci(1) e fibonacci(0)).
      fibonacci(3) → retorna 2 (soma de fibonacci(2) e fibonacci(1)).
      fibonacci(4) → retorna 3 (soma de fibonacci(3) e fibonacci(2),
   * */
}