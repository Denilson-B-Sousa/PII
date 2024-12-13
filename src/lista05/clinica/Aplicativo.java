package lista05.clinica;

import lista05.clinica.dominio.Consulta;
import lista05.clinica.dominio.Medico;
import lista05.clinica.dominio.Paciente;

import java.time.LocalDate;
import java.time.LocalTime;

public class Aplicativo {
    public static void main(String[] args) {

        Endereco endereco = new Endereco(
                "Rua das Flores",
                "Residencial",
                "Centro",
                "12345-678",
                "São Paulo",
                "São Paulo"
        );

        ClinicaMedica clinicaMedica = new ClinicaMedica("Voll Med", endereco);

        Medico medico1 = new Medico(
                "Dr. João Silva",
                "123.456.789-00",
                LocalDate.of(1985, 5, 10),
                'M',
                "CRM12345",
                Medico.Especialidade.CARDIOLOGISTA
        );

        Medico medico2 = new Medico(
                "Dra. Maria Oliveira",
                "987.654.321-00",
                LocalDate.of(1990, 8, 20),
                'F',
                "CRM67890",
                Medico.Especialidade.CARDIOLOGISTA
        );

        clinicaMedica.adicionarMedico(medico1);
        clinicaMedica.adicionarMedico(medico2);
        clinicaMedica.exibirInformacoes();


        Paciente paciente = new Paciente(
                "Denilson",
                "12345678912",
                LocalDate.of(2004, 5, 16),
                'M'
        );

        Consulta consulta = new Consulta(
                LocalDate.of(2024, 12, 12),
                LocalTime.of(11, 30, 0),
                medico1,
                paciente

        );


        System.out.println(consulta.toString());

    }
}
