package lista04.exercicio05;

import java.time.LocalDate;
import java.util.ArrayList;

public class Aplicativo {
    public static void main(String[] args) {

        /* Instanciando e criando lista de alunos*/
        Aluno aluno1 = new Aluno("Denilson", "202410800800");
        aluno1.adicionarNota(8.0);
        aluno1.adicionarNota(7.0);

        Aluno aluno2 = new Aluno("Carlos Eduardo", "A002");
        aluno2.adicionarNota(6.0);
        aluno2.adicionarNota(7.0);

        aluno1.calcularMediaDeNotas();

        ArrayList<Aluno> alunos = new ArrayList<>();
        alunos.add(aluno1);

        /*Instanciando e criando lista de professores */
        Professor professor1 = new Professor("Wendell Bento", "102347");
        Professor professor2 = new Professor("Lucas Ribeiro", "104567");

        /*Instanciando turma, populando lista de alunos e realizando a troca de professor*/

        Turma turma = new Turma("BSI 2° Período", LocalDate.now().getYear(), professor1);

        turma.adicionarAluno(aluno1);
        turma.adicionarAluno(aluno2);
        turma.trocarProfessor(professor2);

        ArrayList<Turma> turmas = new ArrayList<>();
        turmas.add(turma);


        turma.exibirInformacoes();


    }
}
