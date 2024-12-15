package lista05.clinica.dominio;

import lista04.utils.DateFormatter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

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
    private ArrayList<Consulta> consultas = new ArrayList<>();

    DateFormatter dateFormatter = new DateFormatter("EEEE, dd 'de' MMMM 'de' yyyy");

    DateTimeFormatter timeformatter = DateTimeFormatter.ofPattern("'às' HH:mm");

    public Medico(String nome, String cpf, LocalDate dataNascimento, Character sexo, String crm, Especialidade especialidade) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.crm = crm;
        this.especialidade = especialidade;
    }

    public void adicionarConsulta(Consulta novaConsulta) {

        for(Consulta consulta : consultas) {
           if (consulta.getHorario().equals(novaConsulta.getHorario()) )
               throw new IllegalArgumentException("Já existe uma consulta agendada para o horário especificado!");
        }
        consultas.add(novaConsulta);
    }

    public void cancelarConsulta(Consulta consulta) {
        boolean removed = consultas.removeIf(c -> c.getId() == consulta.getId());

        if (removed) {
            System.out.println("Consulta cancelada com sucesso:");
            System.out.printf("Paciente: %s\nData: %s\nHorário: %s\n\n",
                              consulta.getPaciente().getNome(),
                              dateFormatter.format(consulta.getData()),
                              timeformatter.format(consulta.getHorario()));

        } else {
            throw new IllegalArgumentException("Consulta não encontrada!");
        }
    }

    public void agendaDeConsultas() {

        System.out.println("\nAgendas de consultas : " + this.nome);

        if(!(consultas.isEmpty())) {
            for(Consulta consulta : consultas) {
                System.out.println("\nPaciente: " + consulta.getPaciente().getNome());
                System.out.print("Data: " + dateFormatter.format(consulta.getData()));
                System.out.println("\tHorário: " + timeformatter.format(consulta.getHorario()));
            }
        }
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

    public Character getSexo() {
        return sexo;
    }

    public String getCrm() {
        return crm;
    }

    public Especialidade getEspecialidade() {
        return especialidade;
    }
}
