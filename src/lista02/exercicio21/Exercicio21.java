package lista02.exercicio21;

public class Exercicio21 {

    public static int somatorioRecursivo(int[] vetor, int indice) {
        // Caso base: se o índice for igual ao comprimento do vetor, retorne 0
        if (indice == vetor.length) {
            return 0;
        }
        // Passo recursivo: soma o elemento atual com o somatório do restante do vetor
        return vetor[indice] + somatorioRecursivo(vetor, indice + 1);
    }

    public static void main(String[] args) {
        int[] vetor = {1, 2, 3, 4, 5};
        System.out.println(somatorioRecursivo(vetor, 0));  // Saída: 15
    }
}
