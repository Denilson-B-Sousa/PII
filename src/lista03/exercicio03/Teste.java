package lista03.exercicio03;

public class Teste {
    public static void main(String[] args) {

        Carro carro1 = new Carro(
                "Civic",
                "Preto",
                2022,
                "Honda",
                "1HGCM82633A123456",
                "João Silva",
                220.0,
                40.0,
                4,
                false,
                6,
                true,
                50.0,
                15.0
        );

        Carro carro2 = new Carro(
                "Corolla",
                "Branco",
                2023,
                "Toyota",
                "2T1BURHE0FC123456",
                "Maria Oliveira",
                200.0,
                80.0,
                4,
                true,
                5,
                true,
                55.0,
                16.0
        );

        try {
            carro1.setChassi("2T1BURHE0FC123456"); // inválido -> 2T1BURHE0FC1234
            System.out.println(carro1.getChassi());
        } catch (Error error) {
            System.out.println(error.getMessage());
        }

        double distancia = 300.0;

        carro1.acelerar();
        carro2.acelerar();

        carro1.frear();

        carro1.trocarMarcha(2);
        carro2.trocarMarcha(3);
        carro1.reduzMarcha(5);
        carro1.reduzMarcha(5);

        carro1.exibirDados();
        carro2.exibirDados();

        System.out.println("Combustível necessário para percorrer " + String.format("%.1f" , distancia) + "Km = " + String.format("%.2f", carro1.combustivelNecessario(400.0)) + " litros");


        System.out.println("Velocidade Atual: " + String.format("%.1f", carro1.getVelocidadeAtual()) + " km/h");
    }
}
