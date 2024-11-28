package aula02;

public class Car {

    // Características do carro
    public String marca;
    public String modelo;
    public int ano;
    public String cor;
    public double quilometragem;
    public double tanque;
    public final double capacidadeTanque;
    public final double consumo; // km/L

    public Car(String marca, String modelo, int ano, String cor, double capacidadeTanque, double consumo) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.capacidadeTanque = capacidadeTanque;
        this.consumo = consumo;
        this.quilometragem = 0;
        this.tanque = 0;
    }

    // Comportamentos do carro

    public void acelerar(int quantidade) {
        System.out.println("O carro acelerou " + quantidade + " km/h.");
    }

    public void frear() {
        System.out.println("O carro está parando.");
    }

    public void abastecer(double litros) {
        if (tanque + litros > capacidadeTanque) {
            tanque = capacidadeTanque;
            System.out.println("Tanque cheio. Litros adicionais foram descartados.");
        } else {
            tanque += litros;
            System.out.println("Carro abastecido com " + litros + " litros.");
        }
    }

    public void dirigir(double distancia) {
        double combustivelNecessario = distancia / consumo;
        if (combustivelNecessario <= tanque) {
            quilometragem += distancia;
            tanque -= combustivelNecessario;
            System.out.println("Dirigiu " + distancia + " km. Quilometragem atual: " + quilometragem + " km.");
        } else {
            System.out.println("Combustível insuficiente para essa distância.");
        }
    }

    public void exibirInformacoes() {
        System.out.println("\nMarca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
        System.out.println("Quilometragem: " + quilometragem + " km");
        System.out.println("Combustível no tanque: " + tanque + " litros");
    }
}
