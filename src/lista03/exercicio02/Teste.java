package lista03.exercicio02;

import java.time.LocalDate;

public class Teste {
    public static void main(String[] args) {
        Proprietario proprietario1 = new Proprietario(
                "Carlos Souza",
                "123.456.789-09",
                "MG-12.345.678",
                "(31) 98765-4321",
                "Rua das Palmeiras",
                "Centro",
                "Belo Horizonte",
                "MG",
                "30123-456",
                "Casa",
                LocalDate.of(1975, 6, 10)
        );

        Proprietario proprietario2 = new Proprietario(
                "Ana Maria",
                "987.654.321-00",
                "SP-98.765.432",
                "(11) 91234-5678",
                "Avenida Brasil",
                "Jardim Paulista",
                "São Paulo",
                "SP",
                "01415-000",
                "Apto 302",
                LocalDate.of(1980, 4, 25)
        );

        System.out.println(proprietario1.getCpf());
        System.out.println(proprietario2.getCpf());

        proprietario1.exibirDados();
        proprietario2.exibirDados();

    }

}
