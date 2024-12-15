package lista05.clinica;


import lista05.clinica.dominio.Consulta;
import lista05.clinica.dominio.Medico;

import java.util.ArrayList;

public class ClinicaMedica {

    private String nome;
    private Endereco endereco;
    private ArrayList<Medico> medicos = new ArrayList<>();

    public ClinicaMedica(String nome, Endereco endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public void adicionarMedico(Medico medico) {
        medicos.add(medico);
    }

    public void exibirInformacoes() {
        System.out.println("Clínica: " + getNome());
        System.out.println(endereco.getRua() + ", " + endereco.getLogradouro());
        System.out.println(endereco.getBairro() + " - " + endereco.getCidade() + "/" + endereco.getEstado());
        System.out.println("CEP: " + endereco.getCep());
    }


    public String getNome() {
        return nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public ArrayList<Medico> getMedicos() {
        return medicos;
    }
}
