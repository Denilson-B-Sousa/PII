package lista04.exercicio05;

import java.util.ArrayList;

public class Professor {

    private String nome;
    private String matricula;
    private ArrayList<Turma> turmas = new ArrayList<>();

    public Professor(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public ArrayList<Turma> getTurmas() {
        return turmas;
    }


    @Override
    public String toString() {
        return "Professor{" +
                "nome='" + nome + '\'' +
                ", matricula='" + matricula + '\'' +
                ", turmas=" + turmas +
                '}';
    }
}
