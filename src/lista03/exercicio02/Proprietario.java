package lista03.exercicio02;

import java.time.LocalDate;
import java.time.Period;

public class Proprietario {

    private String nome;
    private String cpf;
    private String rg;
    private String telefone;
    private String rua;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;
    private String complemento;
    private LocalDate dataNascimento;


    public Proprietario(String nome, String cpf, String rg) {
        this.nome = nome;
        this.rg = rg;
        this.cpf = (verificarCpf(cpf))  ? cpf.replaceAll("^\\D", "") : "0";
    }

    public Proprietario(String nome, String cpf, String rg, String telefone, String rua, String bairro, String cidade, String estado, String cep, String complemento, LocalDate dataNascimento) {
        this.nome = nome;
        this.cpf = (verificarCpf(cpf))  ? cpf.replaceAll("\\D", "") : "0";
        this.rg = rg;
        this.telefone = telefone;
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.complemento = complemento;
        this.dataNascimento = dataNascimento;
    }

    public void exibirDados() {
        System.out.println("\nNome: " + this.nome);
        System.out.println("Idade: " + this.exibirIdade() + " anos");
        System.out.println("CPF: " + this.cpf);
        System.out.println("RG: " + this.rg);
        System.out.println("Telefone: " + this.telefone);
        System.out.println("Rua: " + this.rua);
        System.out.println("Bairro: " + this.bairro);
        System.out.println("Cidade: " + this.cidade);
        System.out.println("Estado: " + this.estado);
        System.out.println("CEP: " + this.cep);
        System.out.println("Complemento: " + this.complemento);

    }

    private boolean verificarCpf(String cpf) {

        final String CPF_REGEX = "^(\\d{3}\\.?\\d{3}\\.?\\d{3}-?\\d{2})$";

        if(!cpf.matches(CPF_REGEX)) return false;

        String cpfNumerico = cpf.replaceAll("[^0-9]", "");

        if(cpfNumerico.length() != 11) return false;

        if(cpfNumerico.chars().distinct().count() == 1) return false;

        return validarDigitoVerificador(cpfNumerico);
    }

    private boolean validarDigitoVerificador(String cpfNumerico) {

        int primeiroDigitoVerificador = Character.getNumericValue(cpfNumerico.charAt(9));
        int segundoDigitoVerificador = Character.getNumericValue(cpfNumerico.charAt(10));

        String cpfDigitos = cpfNumerico.substring(0, 9);

        int primeiroDigitoCalculado = calculoDigitoVerificador(cpfDigitos, 10);
        int segundoDigitoCalculado = calculoDigitoVerificador(cpfDigitos + primeiroDigitoCalculado, 11);

        return primeiroDigitoVerificador == primeiroDigitoCalculado && segundoDigitoVerificador == segundoDigitoCalculado;

    }

    private int calculoDigitoVerificador(String cpfDigitos, int pesoInicial) {

        int somatoria = 0;
        for(int i = 0; i < cpfDigitos.length(); i++) {
            int digito = Character.getNumericValue(cpfDigitos.charAt(i)) * (pesoInicial - i);
            somatoria += digito;
        }

        int resto = somatoria % 11;

        return (resto < 2) ? 0 : 11 - resto;

    }

    private Integer exibirIdade() {

        if (this.dataNascimento == null) return null;

        LocalDate dataAtual = LocalDate.now();

        return Period.between(this.dataNascimento, dataAtual).getYears();
    }

    public String getCpf() {
        return cpf;
    }
}
