package lista04.exercicio01;

import java.time.LocalDate;

public class Aplicativo {
    public static void main(String[] args) {

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
                LocalDate.of(2025, 3, 15),
                "9876543210987",
                100
        );


        produto1.atualizarEstoque(20);
        produto1.aplicarDesconto(10.0);
        produto1.exibirInformacoes();

        produto2.aplicarDesconto(5.0);
        produto2.exibirInformacoes();
        produto2.atualizarEstoque(10);
        produto2.exibirInformacoes();



    }
}
