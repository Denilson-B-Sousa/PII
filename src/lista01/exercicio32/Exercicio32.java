package lista01.exercicio32;

import java.util.Scanner;

public class Exercicio32 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        int array[] = new int[15];

        System.out.println("Entre com 15 números inteiros: ");
        for(int i = 0; i < array.length; i++){

            array[i] = scanner.nextInt();

            if(array[i] > maior){
                maior = array[i];
            }

            if(array[i] < menor){
                menor = array[i];
            }

        }

        System.out.println("Maior valor informado: " + maior);
        System.out.println("Menor valor informado: " + menor);

    }
}
