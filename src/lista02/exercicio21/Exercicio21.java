package lista02.exercicio21;

public class Exercicio21 {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(recursivitySum(array, 0));
    }

    public static int recursivitySum(int[] array, int index) {
        // Caso base: se o índice for igual ao comprimento do vetor, retorne 0
        if (index == array.length) {
            return 0;
        }
        // Passo recursivo: soma o elemento atual com o somatório do restante do vetor
        return array[index] + recursivitySum(array, index + 1);
    }

}
