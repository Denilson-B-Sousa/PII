package lista05.clinica.dominio;

import java.time.LocalDate;

public class Medico {
    private String nome;
    private String cpf;
    private LocalDate dataNascimento;
    private Character sexo;
    private String crm;

    public enum Especialidade {
        ORTOPEDIA,
        CARDIOLOGISTA,
        GINECOLOGISTA,
        PSIQUIATRIA,
        RADIOLOGIA,
    };

    public Especialidade especialidade;

    public Medico(String nome, String cpf, LocalDate dataNascimento, Character sexo, String crm, Especialidade especialidade) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.crm = crm;
        this.especialidade = especialidade;
    }

    @Override
    public String toString() {
        return "Medico{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", sexo=" + sexo +
                ", crm='" + crm + '\'' +
                '}';
    }
}
