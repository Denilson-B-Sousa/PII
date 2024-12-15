package lista04.exercicio04;

import java.math.BigDecimal;

public class ItemPedido {

    private Produto produto;
    private Integer quantidade;

    public BigDecimal calcularSubtotal() {
        return produto.getPreco().multiply(BigDecimal.valueOf(quantidade));
    }

    public ItemPedido(Produto produto, Integer quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "ItemPedido{" +
                "produto=" + produto +
                ", quantidade=" + quantidade +
                '}';
    }
}
