package lista04.exercicio01;

import lista04.MoneyFormatter;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Produto {
    private String nome;
    private Double preco;
    private LocalDate dataValidade;
    private String codigoDeBarras;
    private Integer quantidadeEmEstoque;

    MoneyFormatter currency = new MoneyFormatter();

    public Produto(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public Produto(String nome, Double preco, LocalDate dataValidade, String codigoDeBarras, Integer quantidadeEmEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
        this.codigoDeBarras = codigoDeBarras;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public String verificarValidade() {

        LocalDate dataAtual = LocalDate.now();

        if(this.dataValidade.isAfter(dataAtual)) {
            return "Produto dentro da validade!";
        } else {
            return "Produto está vencido";
        }
    }

    private String valorTotalEmEstoque() {

        double valorTotal = this.preco * this.quantidadeEmEstoque;

        return currency.currencyFormatter(BigDecimal.valueOf(valorTotal));
    }

    protected Integer atualizarEstoque(Integer quantidadeAtual) {

        this.quantidadeEmEstoque = quantidadeAtual;

        return quantidadeEmEstoque;
    }

    public Integer getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void exibirInformacoes() {
        System.out.println("\nNome produto: " + getNome());
        System.out.println("Preço produto: " + currency.currencyFormatter(BigDecimal.valueOf(getPreco())));
        System.out.println("Data validade: " + getDataValidade());
        System.out.println("Código de Barras: " + getCodigoDeBarras());
        System.out.println("Quantidade de produtos em estoque: " + getQuantidadeEmEstoque() + " unidades.");
        System.out.println("Valor total em estoque: " + valorTotalEmEstoque());
    }

    public void aplicarDesconto(Double porcentagemDesconto) {


        Double valorDesconto = this.preco * porcentagemDesconto / 100;

        this.preco = this.preco - valorDesconto;
    }

    public String getNome() {
        return nome;
    }

    public Double getPreco() {
        return preco;
    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }

    public String getCodigoDeBarras() {
        return codigoDeBarras;
    }
}
