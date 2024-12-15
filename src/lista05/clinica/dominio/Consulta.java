package lista05.clinica.dominio;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.util.UUID;

public class Consulta {

    private UUID id;
    private LocalDate data;
    private LocalTime horario;
    private Medico medico;
    private Paciente paciente;


    public Consulta(UUID id, LocalDate data, LocalTime horario, Medico medico, Paciente paciente) {
        this.id = UUID.randomUUID();
        this.data = data;
//        if(horario.isBefore(LocalTime.of(8, 0, 0)) ||
//                horario.isAfter(LocalTime.of(18, 0, 0))) {
//            throw new IllegalArgumentException("Horário de atendimento da clínica é das 8:00 às 18:00");
//        }
//
//        var horarioAtual = LocalTime.now();
//        var diferencaMinutos = Duration.between(horarioAtual, horario).toMinutes();
//
//        if(diferencaMinutos < 30) {
//            throw new IllegalArgumentException("Consulta deve ser agendada com antecedência de 30 minutos!");
//        }

        this.horario = horario;
        this.medico = medico;
        this.paciente = paciente;
    }

    public UUID getId() {
        return id;
    }

    public LocalDate getData() {
        return data;
    }

    public LocalTime getHorario() {
        return horario;
    }

    public Medico getMedico() {
        return medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

}
