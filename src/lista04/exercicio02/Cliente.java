package lista04.exercicio02;

import lista04.utils.DateFormatter;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class Cliente {
    private final String nome;
    private final String cpf;
    private LocalDate dataNascimento;
    private ArrayList<ContaBancaria> contas = new ArrayList<>();

    DateFormatter dateFormatter = new DateFormatter("dd/MM/yyyy");

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public Cliente(String nome, String cpf, LocalDate dataNascimento, ArrayList<ContaBancaria> contas) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;

        if(contas == null || contas.isEmpty()) {
            throw new IllegalArgumentException("O cliente deve possuir ao menos uma conta!");
        }

        this.contas = contas;
    }

    public void exibirInformacoes() {
        System.out.println("Nome do cliente: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.print("Data de Nascimento: " + dateFormatter.format(getDataNascimento()));
        getConta().forEach(System.out::println);
        System.out.println("\tIdade Atual: " + calcularIdade() + " anos.");
        System.out.println(verificarMaioridade());
        System.out.println(totalDeContas());
    }

    public void adicionarConta(ContaBancaria contaBancaria) {
        this.contas.add(contaBancaria);
    }

    private Integer calcularIdade() {
        LocalDate dataAtual = LocalDate.now();

        return Period.between(this.dataNascimento, dataAtual).getYears();
    }

    protected String verificarMaioridade() {
        final int MAIORIDADE = 18;

        if(!(calcularIdade() >= MAIORIDADE)) return "Cliente menor de idade";

        return "Cliente maior de idade";
    }

    public String totalDeContas() {

        if(contas.isEmpty()) return "Cliente não possui contas!";

        if(contas.size() == 1) return "O cliente possui " + this.contas.size() + " conta.";

        return "O cliente possui " + this.contas.size() + " contas.";
    }


    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public ArrayList<ContaBancaria> getConta() {
        return contas;
    }

}
