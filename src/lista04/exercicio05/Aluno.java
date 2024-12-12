package lista04.exercicio05;

import java.util.ArrayList;

public class Aluno {

    private String nome;
    private String matricula;
    private ArrayList<Double> notas = new ArrayList<>();

    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
        this.notas = notas;
    }

    public void adicionarNota(double nota) {
        notas.add(nota);
    }

    public Double calcularMediaDeNotas() {

        double somatoria = 0.0;
        for(double nota : notas) {
            somatoria += nota;
        }

        return somatoria / notas.size();
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public ArrayList<Double> getNotas() {
        return notas;
    }
}
