package lista04.exercicio03;

import java.time.LocalDate;

public class Aplicativo {
    public static void main(String[] args) {

        Jogador jogador1 = new Jogador("Denilson", 10);
        Jogador jogador2 = new Jogador("Everton", 40);
        Jogador jogador3 = new Jogador("Thiago", 30);

        Jogo jogo = new Jogo("Xadrez", LocalDate.of(2024, 12, 9));
        jogo.adicionarJogador(jogador1);
        jogo.adicionarJogador(jogador2);
        jogo.adicionarJogador(jogador3);

        jogo.verificarVencedor();
        jogo.exibirClassificacao();
        jogo.reiniciarJogo();

        System.out.println("\nPontuação Jogador 1: " + jogador1.exibirPontuacao());
        System.out.println("Pontuação Jogador 2: " + jogador2.exibirPontuacao());
        System.out.println("Pontuação Jogador 3: " + jogador3.exibirPontuacao());

    }
}
