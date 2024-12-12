package lista03.exercicio03;

public class Carro {

    private String modelo;
    private String cor;
    private Integer ano;
    private String marca;
    private String chassi;
    private String proprietario;
    private Double velocidadeMaxima;
    private Double velocidadeAtual;
    private Integer numeroPortas;
    private Boolean tetoSolar;
    private Integer numeroMarchas;
    private Boolean cambioAutomatico;
    private Double volumeCombustivel;
    private Double autonomia;

    public Carro(Double autonomia, Double volumeCombustivel, Integer numeroMarchas) {
        this.autonomia = autonomia;
        this.volumeCombustivel = volumeCombustivel;
        this.numeroMarchas = numeroMarchas;
    }

    public Carro(String modelo, String cor, Integer ano, String marca, String chassi, String proprietario, Double velocidadeMaxima, Double velocidadeAtual, Integer numeroPortas, Boolean tetoSolar, Integer numeroMarchas, Boolean cambioAutomatico, Double volumeCombustivel, Double autonomia) {
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.marca = marca;
        this.chassi = chassi;
        this.proprietario = proprietario;
        this.velocidadeMaxima = velocidadeMaxima;
        this.velocidadeAtual = velocidadeAtual;
        this.numeroPortas = numeroPortas;
        this.tetoSolar = tetoSolar;
        this.numeroMarchas = numeroMarchas;
        this.cambioAutomatico = cambioAutomatico;
        this.volumeCombustivel = volumeCombustivel;
        this.autonomia = autonomia;
    }

    public void acelerar() {
        if(velocidadeAtual < velocidadeMaxima) {
            while(velocidadeAtual < velocidadeMaxima) {
                velocidadeAtual++;
                System.out.println("Acelerando o carro: " + String.format("%.0f", velocidadeAtual) + " Km");
            }
        } else {
            System.out.println("Carro atingiu a velocidade máxima!");
        }

    }

    public void frear() {
        if(velocidadeAtual > 0) {
            while(velocidadeAtual > 0) {
                velocidadeAtual--;
                System.out.println("Freiando o carro: " + String.format("%.0f", velocidadeAtual) + " Km/h");
            }
        } else {
            System.out.println("Carro parado");
        }
    }

    public void trocarMarcha(Integer marchaAtual) {

        validarMarcha(marchaAtual);

        String[] marchas = new String[this.numeroMarchas + 1];

        marchas[0] = "R";

        for(int i = 1; i <= this.numeroMarchas; i++) {
            marchas[i] = String.valueOf(i);
        }

        for(int i = marchaAtual + 1; i <= this.numeroMarchas; i++) {
            System.out.println("Aumentando para a marcha: " + marchas[i]);
        }
    }

    public void reduzMarcha(Integer marchaAtual) {

        validarMarcha(marchaAtual);

        String[] marchas = new String[this.numeroMarchas + 1];

        marchas[0] = "R";
        for(int i = 1; i <= this.numeroMarchas; i++) {
            marchas[i] = String.valueOf(i);
        }

        for(int i = marchaAtual; i >= 0; i--) {
            System.out.println("Reduzindo para a marcha: " + marchas[i]);
        }

    }

    public boolean validarMarcha(Integer marchaAtual) {
        if(marchaAtual < 0 || marchaAtual >= this.numeroMarchas) {
            throw new IllegalArgumentException("Valor inválido para marcha atual!");
        }

        return true;
    }

    public void exibirDados() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Ano: " + ano);
        System.out.println("Marca: " + marca);
        System.out.println("Chassi: " + chassi);
        System.out.println("Proprietario: " + proprietario);
        System.out.println("Velocidade: " + velocidadeMaxima);
        System.out.println("Velocidade: " + velocidadeAtual);
        System.out.println("Numero Portas: " + numeroPortas);
        System.out.println("TetoSolar: " + tetoSolar);
        System.out.println("Numero Marchas: " + numeroMarchas);
        System.out.println("CambioAutomatico: " + cambioAutomatico);
        System.out.println("VolumeCombustivel: " + volumeCombustivel);
        System.out.println("Autonomia: " + autonomia);

    }

    public Double combustivelNecessario(Double quantidadeKm) {

        return quantidadeKm / autonomia;
    }

    public boolean validarChassi(String chassi) {
        String vinRegex = "^[A-HJ-NPR-Z0-9]{17}$";

        return chassi.matches(vinRegex);
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {

        if (ano > 1886 && ano <= 2024) {
            this.ano = ano;
        } else {
            throw new IllegalArgumentException("Ano inválido!");
        }
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {

       if(!validarChassi(chassi)) {
           throw new IllegalArgumentException("Chassi inválido");
       }

       this.chassi = chassi;


    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public Double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(Double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public Double getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(Double velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public Integer getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(Integer numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    public Boolean getTetoSolar() {
        return tetoSolar;
    }

    public void setTetoSolar(Boolean tetoSolar) {
        this.tetoSolar = tetoSolar;
    }

    public Integer getNumeroMarchas() {
        return numeroMarchas;
    }

    public void setNumeroMarchas(Integer numeroMarchas) {
        this.numeroMarchas = numeroMarchas;
    }

    public Boolean getCambioAutomatico() {
        return cambioAutomatico;
    }

    public void setCambioAutomatico(Boolean cambioAutomatico) {
        this.cambioAutomatico = cambioAutomatico;
    }

    public Double getVolumeCombustivel() {
        return volumeCombustivel;
    }

    public void setVolumeCombustivel(Double volumeCombustivel) {
        this.volumeCombustivel = volumeCombustivel;
    }

    public Double getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(Double autonomia) {
        this.autonomia = autonomia;
    }
}
