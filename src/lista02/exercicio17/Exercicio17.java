package lista02.exercicio17;

public class Exercicio17 {

    public static int contarDigitos(int n) {

        // números menores que 10 possui apenas 1 dígito
        if (n < 10) {
            return 1;
        }

        // Passo recursivo: remove um dígito e chama a função novamente
        return 1 + contarDigitos(n / 10);
    }

    public static void main(String[] args) {
        int numero = 12345;
        System.out.println("O número de dígitos é: " + contarDigitos(numero));
    }
}
