package lista01.exercicio37;

import java.util.Scanner;

public class Exercicio37 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[3][3];

        System.out.println("Preencha os valores da matriz: ");
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length; j++){
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Matriz transposta: ");
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length; j++){
                System.out.print(" " + matriz[j][i]);
            }
        }
    }
}
