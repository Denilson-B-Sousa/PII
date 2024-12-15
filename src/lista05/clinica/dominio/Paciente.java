package lista05.clinica.dominio;

import java.time.LocalDate;

public class Paciente {

    private String nome;
    private String cpf;
    private LocalDate dataNascimento;
    private Character sexo;

    public Paciente(String nome, String cpf, LocalDate dataNascimento, Character sexo) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public Character getSexo() {
        return sexo;
    }
}
