package composition.example01;

import java.util.ArrayList;

public class Teste {
    public static void main(String[] args) {

        ArrayList<Endereco> enderecos = new ArrayList<>();
        enderecos.add(new Endereco("Rua das Flores, 123", "Jardim das Acácias", "São Paulo", "SP", "12345-678", "Apt 101", 2));
        enderecos.add(new Endereco("Avenida Central, 456", "Centro", "Rio de Janeiro", "RJ", "98765-432", "Casa 2", 3));
        enderecos.add(new Endereco("Rua dos Limoeiros, 789", "Vila Nova", "Belo Horizonte", "MG", "56789-123", "Bloco B", 4));
        enderecos.add(new Endereco("Travessa da Liberdade, 321", "Liberdade", "Salvador", "BA", "34567-890", "Casa 1", 6));
        enderecos.add(new Endereco("Rua dos Jacarandás, 101", "Jardim das Palmeiras", "Curitiba", "PR", "23456-789", "Casa 3", 8));

        //Iterando apenas sobre um item da lista
//        enderecos.forEach(c -> System.out.println(c.getBairro()));

        //Iterando apenas sobre um item da lista
//        enderecos.forEach(c -> System.out.println(c.getCidade()));
//
//        int contador = 0;
//        for (var endereco : enderecos) {
//            if(endereco.getRua().equals("Rua das Flores, 123")) {
//                contador++;
//            }
//        }
//
//        System.out.println("quantidade de bairro com nome Rua das Flores: " + contador);

       //Filter e ForEach recebe uma interface funcional como parâmetro
        enderecos
                .stream()
                .filter(c -> c.getRua().equals("Rua das Flores, 123"))
                .forEach(System.out::println);

        var somatorioNumeros = enderecos
                .stream()
                .mapToInt(Endereco::getNumero)
                .sum();

        System.out.println("Somatório de números: " + somatorioNumeros);

        // Objeto chama o método passando o próprio objeto
        // Versão com method reference
        //enderecos.forEach(System.out::println);

    }
}
