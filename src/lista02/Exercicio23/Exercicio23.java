package lista02.Exercicio23;

public class Exercicio23 {

    public static void main(String[] args) {
        String text = "programacao";
        char character = 'a';
        System.out.println(countOccurences(text, character, 0));
    }

    public static int countOccurences(String text, char character, int index) {
        // Caso base: se o índice alcança o comprimento da string, retorne 0
        if (index == text.length()) {
            return 0;
        }
        // Verifica se o caractere no índice atual corresponde ao caractere buscado
        int currentCount = (text.charAt(index) == character) ? 1 : 0;

        // Soma 1 se o caractere for encontrado e chama a função recursiva para o próximo índice
        return currentCount + countOccurences(text, character, index + 1);
    }
}
