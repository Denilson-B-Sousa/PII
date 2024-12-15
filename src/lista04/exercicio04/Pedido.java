package lista04.exercicio04;

import lista04.exercicio02.Cliente;
import lista04.utils.DateFormatter;

import java.time.LocalDate;
import java.util.ArrayList;

public class Pedido {

    private Integer numero;
    private LocalDate data;
    private ArrayList<ItemPedido> itensPedido = new ArrayList<>();
    private Cliente cliente;

    DateFormatter formatter = new DateFormatter("EEEE, dd 'de' MMMM 'de' yyyy");

    public Pedido(Integer numero, LocalDate data, Cliente cliente) {
        this.numero = numero;
        this.data = data;
        this.cliente = cliente;
    }

    public Pedido(Integer numero, LocalDate data, ArrayList<ItemPedido> itensPedido, Cliente cliente) {
        this.numero = numero;
        this.data = data;
        this.itensPedido = itensPedido;
        this.cliente = cliente;
    }

    public void exibirResumo() {
        System.out.println("Pedido N°: " + getNumero());
        System.out.println("Data: " + formatter.format(getData()));
        System.out.println("Quantidade de itens: " + calcularQuantidadeDeItens());
        System.out.println("Cliente: " + cliente.getNome() + " ∙ CPF: " + cliente.getCpf());
        System.out.println("Itens do pedido: ");

        if(!(verificarPedidoVazio())) {
            for(ItemPedido itemPedido : itensPedido) {
                Produto produto = itemPedido.getProduto();
                System.out.printf("- %s (%s) - %d unidade(s) - R$ %.2f%n",
                                  produto.getNome(), produto.getMarca(), itemPedido.getQuantidade(),
                                  itemPedido.calcularSubtotal());
            }
        } else {
            System.out.println("Pedido está vazio!");
        }

    }

    public void adicionarItem(ItemPedido itemPedido) {
        itensPedido.add(itemPedido);
    }

    public void removerItem(ItemPedido itemPedido) {
        itensPedido.remove(itemPedido);
    }

    public int calcularQuantidadeDeItens() {
        return itensPedido.stream().mapToInt(ItemPedido::getQuantidade).sum();
    }

    private Boolean verificarPedidoVazio() {
        return itensPedido.isEmpty();
    }

    public Integer getNumero() {
        return numero;
    }

    public LocalDate getData() {
        return data;
    }
}
