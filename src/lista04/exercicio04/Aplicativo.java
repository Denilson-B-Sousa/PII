package lista04.exercicio04;

import lista04.exercicio02.Cliente;
import lista04.MoneyFormatter;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Aplicativo {
    public static void main(String[] args) {

        MoneyFormatter formatter = new MoneyFormatter();

        Produto produto1 = new Produto(123, "Produto A", "Marca A", new BigDecimal("1000.00"));
        Produto produto2 = new Produto(124, "Produto B", "Marca B", new BigDecimal("500.00"));

        ItemPedido itemPedido1 = new ItemPedido(produto1, 12);
        ItemPedido itemPedido2 = new ItemPedido(produto2, 10);

        Cliente cliente = new Cliente("Denilson", "12345678909");
        Pedido pedido = new Pedido(4, LocalDate.of(2024, 12, 10), cliente);

        pedido.adicionarItemAoPedido(itemPedido1);
        pedido.adicionarItemAoPedido(itemPedido2);

        pedido.exibirResumoPedido();
        System.out.println("Valor Total: " + formatter.currencyFormatter(itemPedido1.calcularValorTotal().add(itemPedido2.calcularValorTotal())));

    }
}
