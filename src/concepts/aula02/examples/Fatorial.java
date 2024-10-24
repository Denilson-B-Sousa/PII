package concepts.aula02.examples;

public class Fatorial {
    public static int fatorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // Condição de parada
        }
        return n * fatorial(n - 1); // Chamada recursiva
    }

    public static void main(String[] args) {
        System.out.println(fatorial(5)); // Saída: 120
    }
}