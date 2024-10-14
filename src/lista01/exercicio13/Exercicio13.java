package lista01.exercicio13;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double weight;
        double height;
        double IMC;

        System.out.println("Entre com o seu peso: ");
        weight = scanner.nextDouble();

        System.out.println("Entre com sua altura: ");
        height = scanner.nextDouble();

        IMC = weight / Math.pow(height, 2);

        System.out.println("\nÍndice de massa corporal (IMC): " + String.format("%.2f", IMC));

        if(IMC < 18.5) {
            System.out.println("Abaixo do peso normal!");
        } else if (IMC >= 18.5 && IMC <= 25) {
            System.out.println("Peso normal!");
        } else if (IMC >= 25 && IMC <= 30) {
            System.out.println("Acima do peso normal!");
        }
        else if (IMC >= 30 && IMC <= 35) {
            System.out.println("Obesidade grau I");
        } else if (IMC >= 35 && IMC <= 40) {
            System.out.println("Obesidade grau II");
        } else if (IMC > 40) {
            System.out.println("Obesidade grau III");
        }

    }
}

/*
* 13.Cálculo de IMC: Desenvolva um programa que leia o peso e a
altura de uma pessoa e calcule seu Índice de Massa Corporal (IMC),
mostrando se a pessoa está abaixo, dentro ou acima do peso
*  */