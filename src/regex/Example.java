package regex;

import java.util.Scanner;
import static java.util.regex.Pattern.matches;

public class Example {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Utilizada para validar o formato do CPF
        System.out.println("Entre com um CPF válido: ");
        String CPF = scanner.nextLine();

        System.out.println(verificarCPF(CPF));

    }

    public static boolean verificarCPF(String cpf) {

        // Padrão: 123-456-789-12 || 12345678912
        final String CPF_REGEX = "^(\\d{3}\\.?\\d{3}\\.?\\d{3}-?\\d{2})$";

        //Verifica compatibilidade com padrão determinado pela REGEX
        if(!matches(CPF_REGEX, cpf)) return false;

        // Remove todo caractere especial
        String cpfNumerico = cpf.replaceAll("\\D", "");

        // Verifica se o cpf é diferente de 11 dígitos
        if(cpfNumerico.length() != 11) return false;

        // Verifica se o cpf possui todos números iguais ex: 111.111.111.11
        //chars() retorna um IntStream (Código unicode de cada caractere da string) fluxo de inteiros
        //distinct() Verifica se o fluxo de inteiros unicode possui valores duplicados e mantém apenas valores únicos
        //count() retorna a quantidade de caracteres únicos
        if(cpf.chars().distinct().count() == 1) return false;


        return verificarDigito(cpfNumerico);
    }

    public static boolean verificarDigito(String cpf) {

        String cpfDigitos = cpf.substring(0, 9);

        int primeiroDigitoVerificador = calcularDigito(cpfDigitos, 10);
        int segundoDigitoVerificador = calcularDigito(cpfDigitos + primeiroDigitoVerificador, 11);

        int digitoVerificador1 = Character.getNumericValue(cpf.charAt(9));
        int digitoVerificador2 = Character.getNumericValue(cpf.charAt(10));

        System.out.println(digitoVerificador1);
        System.out.println(digitoVerificador2);

        return primeiroDigitoVerificador == digitoVerificador1 && segundoDigitoVerificador == digitoVerificador2;
    }

    private static int calcularDigito(String cpf, int pesoInicial) {

        int somatoria = 0;

        for(int i = 0; i < cpf.length(); i++) {
            int digito = Character.getNumericValue(cpf.charAt(i));
            somatoria += digito * (pesoInicial - i);
        }

        int resto = somatoria % 11;

        // resto < 2 porque a excessão ocorre no resto == 0 ou resto == 1
        // 11 - resto é o retorno do dígito verificador
        return (resto < 2) ? 0 : 11 - resto;
    }
}
