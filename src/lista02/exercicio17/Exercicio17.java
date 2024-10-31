package lista02.exercicio17;

public class Exercicio17 {

    public static void main(String[] args) {
        int number = 12345;
        System.out.println("O número de dígitos é: " + countDigits(number));
    }

    public static int countDigits(int n) {

        return (n < 10) ?  1 : 1 + countDigits(n / 10);

    }

}
