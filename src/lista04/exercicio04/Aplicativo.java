package lista04.exercicio04;

import lista04.exercicio02.Cliente;
import lista04.utils.MoneyFormatter;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Aplicativo {
    public static void main(String[] args) {

        Produto produto1 = new Produto(101, "Notebook", "Dell", new BigDecimal("3500.00"));
        Produto produto2 = new Produto(102, "Mouse", "Logitech", new BigDecimal("150.00"));
        Produto produto3 = new Produto(103, "HeadPhone", "Lenovo", new BigDecimal("450.00"));

        ItemPedido itemPedido1 = new ItemPedido(produto1, 12);
        ItemPedido itemPedido2 = new ItemPedido(produto2, 10);
        ItemPedido itemPedido3 = new ItemPedido(produto3, 5);

        Cliente cliente = new Cliente("Denilson", "12345678909");
        Pedido pedido = new Pedido(4, LocalDate.of(2024, 12, 15), cliente);

        pedido.adicionarItem(itemPedido1);
        pedido.adicionarItem(itemPedido2);
        pedido.removerItem(itemPedido3);
        pedido.exibirResumo();

    }
}
