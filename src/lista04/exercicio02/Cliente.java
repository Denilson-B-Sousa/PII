package lista04.exercicio02;

import java.time.LocalDate;
import java.util.ArrayList;

public class Cliente {
    private String nome;
    private String cpf;
    private LocalDate dataNascimento;
    private ArrayList<ContaBancaria> conta;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public Cliente(String nome, String cpf, LocalDate dataNascimento, ArrayList<ContaBancaria> conta) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.conta = conta;
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
        return conta;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", conta=" + conta +
                '}';
    }
}
