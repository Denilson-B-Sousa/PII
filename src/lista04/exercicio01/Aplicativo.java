package lista04.exercicio01;

import lista04.MoneyFormatter;

import java.time.LocalDate;

public class Aplicativo {
    public static void main(String[] args) {

        MoneyFormatter currencyFormatter = new MoneyFormatter();

        Produto produto1 = new Produto(
                "Arroz Integral",
                15.99,
                LocalDate.of(2024, 5, 20),
                "9876543210987",
                50
        );

        Produto produto2 = new Produto(
                "Feijão",
                8.99,
                LocalDate.of(2026, 3, 15),
                "9876543210987",
                100
        );

        Produto produto3 = new Produto(
                "Azeite de Oliva",
                29.99,
                LocalDate.of(2024, 12, 30),
                "1112233445566",
                30
        );

        produto1.verificarValidade();

        produto1.exibirInformacoes();

    }
}
