package lista02.exercicio22;

public class Exercicio22 {

    public static void main(String[] args) {
        System.out.println(palindromo("radar"));

    }

    public static String palindromo(String string) {

        // Condição de parada se for palíndromo, ou seja,
        // quando o caracter não tiver mais comparações a
        // serem realizadas.
        if (string.length() <= 1) {
            return "é palíndromo";
        }

        // Verifica se o char inicial é diferente do char final
        if(string.charAt(0) != string.charAt(string.length() - 1)) {
            return "Não é palíndromo";
        }

        // Retirando o primeiro e último char da String
        // Retornando a string ou caracter restante
        return palindromo(string.substring(1, string.length() - 1));


    }

}
