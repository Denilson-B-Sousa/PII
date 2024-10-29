package lista02.exercicio17;

public class Exercicio17 {

    public static void main(String[] args) {
        int number = 12345;
        System.out.println("O número de dígitos é: " + countDigits(number));
    }

    public static int countDigits(int n) {

        // números menores que 10 possui apenas 1 dígito
        if (n < 10) {
            return 1;
        }

        // Passo recursivo: remove um dígito e chama a função novamente
        return 1 + countDigits(n / 10);
    }

}
