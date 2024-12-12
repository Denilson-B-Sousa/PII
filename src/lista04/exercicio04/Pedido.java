package lista04.exercicio04;

import lista04.exercicio02.Cliente;

import java.time.LocalDate;
import java.util.ArrayList;

public class Pedido {

    private Integer numero;
    private LocalDate data;
    private ArrayList<ItemPedido> pedidos = new ArrayList<>();
    private Cliente cliente;

    public Pedido(Integer numero, LocalDate data, Cliente cliente) {
        this.numero = numero;
        this.data = data;
        this.cliente = cliente;
    }

    public Pedido(Integer numero, LocalDate data, ArrayList<ItemPedido> pedidos, Cliente cliente) {
        this.numero = numero;
        this.data = data;
        this.pedidos = pedidos;
        this.cliente = cliente;
    }

    public void adicionarItemAoPedido(ItemPedido itemPedido) {
        pedidos.add(itemPedido);
    }

    public int calcularQuantidadeDeItensPedidos() {
        return pedidos.size();
    }

    /**
     * Verifica se o pedido está vazio
     * @return "Pedido está vazio" caso o pedido estiver vazio ou
     * uma representação em string do objeto caso não estiver vazio
     */
    public String verificarPedido() {
        if (pedidos.isEmpty()) return "Pedido está vazio!";

        return pedidos.toString();
    }

    public void exibirResumoPedido() {
        System.out.println("Pedido: " + getNumero());
        System.out.println("Data: " + getData());
        System.out.println("Quantidade de itens: " + calcularQuantidadeDeItensPedidos());
        System.out.println("Cliente: " + cliente.getNome());
    }

    public Integer getNumero() {
        return numero;
    }

    public LocalDate getData() {
        return data;
    }
}
