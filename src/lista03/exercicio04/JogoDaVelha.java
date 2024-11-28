package lista03.exercicio04;

import java.util.Scanner;

public class JogoDaVelha {

    public enum Estado {
        VAZIA, JOGADOR1, JOGADOR2
    }

    // Grade 3x3
    private Estado[][] grade;

    public JogoDaVelha() {
        grade = new Estado[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                grade[i][j] = Estado.VAZIA;
            }
        }
    }

    public void exibirGrade() {
        System.out.println("Grade do Jogo da Velha:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(grade[i][j] == Estado.VAZIA ? "[ ]" : (grade[i][j] == Estado.JOGADOR1 ? "[X]" : "[O]"));
            }
            System.out.println();
        }
    }

    public boolean fazerMovimento(int linha, int coluna, Estado jogador) {
        if (linha < 0 || linha >= 3 || coluna < 0 || coluna >= 3 || grade[linha][coluna] != Estado.VAZIA) {
            return false;
        }
        grade[linha][coluna] = jogador;
        return true;
    }

    public Estado verificarVencedor() {
        for (int i = 0; i < 3; i++) {

            //Verificando Linha
            if (grade[i][0] != Estado.VAZIA && grade[i][0] == grade[i][1] && grade[i][1] == grade[i][2]) {
                return grade[i][0];
            }

            //Verificando Coluna
            if (grade[0][i] != Estado.VAZIA && grade[0][i] == grade[1][i] && grade[1][i] == grade[2][i]) {
                return grade[0][i];
            }
        }

        if (grade[0][0] != Estado.VAZIA && grade[0][0] == grade[1][1] && grade[1][1] == grade[2][2]) {
            return grade[0][0];
        }

        if (grade[0][2] != Estado.VAZIA && grade[0][2] == grade[1][1] && grade[1][1] == grade[2][0]) {
            return grade[0][2];
        }
        return Estado.VAZIA;
    }

    public boolean verificarEmpate() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (grade[i][j] == Estado.VAZIA) {
                    return false;
                }
            }
        }
        return true;
    }

    public void jogar() {
        Scanner scanner = new Scanner(System.in);
        Estado jogadorAtual = Estado.JOGADOR1;
        boolean jogoAtivo = true;

        while (jogoAtivo) {
            exibirGrade();
            System.out.println((jogadorAtual == Estado.JOGADOR1 ? "Jogador 1 (X)" : "Jogador 2 (O)") + ", faça seu movimento!");

            int linha = -1, coluna = -1;
            while (linha < 0 || linha >= 3 || coluna < 0 || coluna >= 3 || !fazerMovimento(linha, coluna, jogadorAtual)) {
                System.out.print("Informe a linha (0, 1, 2): ");
                linha = scanner.nextInt();
                System.out.print("Informe a coluna (0, 1, 2): ");
                coluna = scanner.nextInt();
            }

            Estado vencedor = verificarVencedor();
            if (vencedor != Estado.VAZIA) {
                exibirGrade();
                System.out.println((vencedor == Estado.JOGADOR1 ? "Jogador 1 (X)" : "Jogador 2 (O)") + " venceu!");
                jogoAtivo = false;
            } else if (verificarEmpate()) {
                exibirGrade();
                System.out.println("O jogo terminou em empate!");
                jogoAtivo = false;
            }

            jogadorAtual = (jogadorAtual == Estado.JOGADOR1) ? Estado.JOGADOR2 : Estado.JOGADOR1;
        }
        scanner.close();
    }

}
