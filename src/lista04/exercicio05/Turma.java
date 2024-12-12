package lista04.exercicio05;

import java.time.LocalDate;
import java.util.ArrayList;

public class Turma {

    private String nomeTurma;
    private Integer anoLetivo;
    private ArrayList<Aluno> alunos = new ArrayList<>();
    private Professor professor;

    public Turma(String nomeTurma, Integer anoLetivo, Professor professor) {
        this.nomeTurma = nomeTurma;
        this.anoLetivo = anoLetivo;
        this.alunos = new ArrayList<>();
        this.professor = professor;
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void listarAprovados() {

        alunos.stream().filter(c -> c.calcularMediaDeNotas() > 6.0).forEach(System.out::println);
    }

    public void trocarProfessor(Professor novoProfessor) {
        this.professor.getTurmas().remove(this);
        this.professor = novoProfessor;
        novoProfessor.getTurmas().add(this);
    }

    public void exibirInformacoes() {
        System.out.println("Nome da Turma: " + nomeTurma);
        System.out.println("Ano Letivo: " + anoLetivo);
        System.out.println("Professor: " + professor.getNome());
        System.out.println("Alunos: ");
        for(Aluno aluno : alunos) {
            System.out.println("Nome: " + aluno.getNome() + " | Matrícula: " + aluno.getMatricula() + " | Média: " + aluno.calcularMediaDeNotas());
        }
    }


}
