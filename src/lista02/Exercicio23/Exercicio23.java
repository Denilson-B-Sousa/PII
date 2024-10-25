package lista02.Exercicio23;

public class Exercicio23 {

    public static int contarOcorrencias(String texto, char caractere, int indice) {
        // Caso base: se o índice alcança o comprimento da string, retorne 0
        if (indice == texto.length()) {
            return 0;
        }
        // Verifica se o caractere no índice atual corresponde ao caractere buscado
        int contagemAtual = (texto.charAt(indice) == caractere) ? 1 : 0;

        // Soma 1 se o caractere for encontrado e chama a função recursiva para o próximo índice
        return contagemAtual + contarOcorrencias(texto, caractere, indice + 1);
    }

    public static void main(String[] args) {
        String texto = "programacao";
        char caractere = 'a';
        System.out.println(contarOcorrencias(texto, caractere, 0));  // Saída: 3
    }
}
