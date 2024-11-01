package aula02;

import java.math.BigDecimal;
import java.util.Date;

public class Car {

    public String cor;
    public Date anoLancamento;
    public String marca;
    public String modelo;
    public BigDecimal preco;
    public Double litrosCombustivel;
    public String placa;
    public Integer porta;
    public Integer roda;

    // Objetivo do construtor é criar um objeto

    public Car(String cor, Date anoLancamento, String marca, String modelo, BigDecimal preco,
               Double litrosCombustivel, String placa, Integer porta, Integer roda) {
        this.cor = cor;
        this.anoLancamento = anoLancamento;
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
        this.litrosCombustivel = litrosCombustivel;
        this.placa = placa;
        this.porta = porta;
        this.roda = roda;
    }

    public Car() {

    }

    // Métodos utilizado para implementar o comportamento do objeto

    public double combustivelDisponivel() {
        return 48.5;
    }

    public boolean percorrer() {
       if(this.litrosCombustivel > 0) {
           this.litrosCombustivel--;
           return true;
       };

       return false;
    }


}
// Sempre nos exercícios (Sempre Utilizar Objetos)
// Padrão de projeto builder
// Classes são organizadas dentro de pacotes
// Propriedades, atributos e características
// Em POO toda função é um método
