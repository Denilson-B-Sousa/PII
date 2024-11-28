package aula02;

public class App {
    public static void main(String[] args) {

        // Criando um novo carro com informações completas
        Car car = new Car("Toyota", "Corolla", 2021, "Preto", 50.0, 15.0);

        // Exibindo as informações do carro
        car.exibirInformacoes();

        // Abastecendo o carro
        car.abastecer(40);

        // Dirigindo o carro
        car.dirigir(100);

        // Exibindo as informações novamente para ver o status atualizado
        car.exibirInformacoes();

        // Acelerando o carro
        car.acelerar(60);

        // Parando o carro
        car.frear();

    }
}
