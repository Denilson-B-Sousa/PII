package lista01.exercicio01;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {

        //declaração de recurso para entrada de dados via teclado
        Scanner leia = new Scanner(System.in);

        //declaração de variáveis em java
        int numero1;
        int numero2;
        int soma = 0;

        //Solicitar ao usuário que informe um número
        System.out.println("Digite um numero: ");

        //lendo valor do número 1
        numero1 = leia.nextInt();

        //Solicitar ao usuário que informe outro número
        System.out.println("Digite outro numero: ");

        //lendo valor do número 2
        numero2 = leia.nextInt();

        //somando os dois números informados pelo usuário
        soma = numero1 + numero2;

        //apresentando o resultado da soma
        System.out.println("O resultado da soma é: " + soma);

    }

}
