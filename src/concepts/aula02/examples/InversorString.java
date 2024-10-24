package concepts.aula02.examples;

public class InversorString {

    public static void main(String[] args) {
        System.out.println(inverterString("Denilson"));

    }

    public static String inverterString(String string) {
        if (string.isEmpty()) {
            return string; // Quando a string estiver vazia significa que ela está completamente invertida.
        }

        // Retira o caractere do início e adiciona ele ao final da string
        // substring(1) retira o caracter do inicio
        // string.charAt(0) adiciona o primeiro caracter ao final da string
        return inverterString(string.substring(1)) + string.charAt(0);
    }

//    "Denilson" -> enilsonD
//    "enilson" -> nilsoe
//    "nilson" -> ilsonn
//    "ilson" -> lsoni
//    "lson" -> sonl
//    "son" -> ons
//    "on" -> no
//    "n" -> n
//    "" -> Entra na condição de parada
}
