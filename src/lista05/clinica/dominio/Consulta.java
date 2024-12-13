package lista05.clinica.dominio;

import java.time.LocalDate;
import java.time.LocalTime;

public class Consulta {

    private LocalDate data;
    private LocalTime horario;
    private Medico medico;
    private Paciente paciente;

    public Consulta(LocalDate data, LocalTime horario, Medico medico, Paciente paciente) {
        this.data = data;
        this.horario = horario;
        this.medico = medico;
        this.paciente = paciente;
    }

    @Override
    public String toString() {
        return "Consulta{" +
                "data=" + data +
                ", horario=" + horario +
                ", medico=" + medico +
                ", paciente=" + paciente +
                '}';
    }
}
