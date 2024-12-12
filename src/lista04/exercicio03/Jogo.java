package lista04.exercicio03;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

public class Jogo {

    private String nome;
    private LocalDate data;
    private ArrayList<Jogador> jogadores = new ArrayList<>();

    public Jogo(String nome, LocalDate data) {
        this.nome = nome;
        this.data = data;
    }

    public Jogo(String nome, LocalDate data, ArrayList<Jogador> jogadores) {
        this.nome = nome;
        this.data = data;
        this.jogadores = jogadores;
    }

    public void adicionarJogador(Jogador jogador) {
        this.jogadores.add(jogador);
    }

    public void verificarVencedor() {
        jogadores.stream()
            .max(Comparator.comparingInt(Jogador::getPontuacao))
                .ifPresent(jogadorComMaiorPontuacao ->
                    System.out.println("Vencedor do jogo: " +
                        jogadorComMaiorPontuacao.getNome() + " - " +
                            jogadorComMaiorPontuacao.getPontuacao() +
                            " pontos!"));

    }

}
