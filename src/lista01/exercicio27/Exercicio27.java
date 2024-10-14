package lista01.exercicio27;

import java.util.Scanner;

public class Exercicio27 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com um número inteiro: ");
        int N = scanner.nextInt();
        int sum = 0;

        for(int i = 1; i <= N; i++){

            if(i % 2 == 0){
                sum += i;
            }
        }

        System.out.println("Soma de números pares do número 1 ao número " + N + " = " + sum);
    }
}
