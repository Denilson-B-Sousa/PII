package lista04.exercicio03;

import java.time.LocalDate;
import java.util.ArrayList;

public class Aplicativo {
    public static void main(String[] args) {

        Jogador jogador1 = new Jogador("Denilson", 10);
        Jogador jogador2 = new Jogador("Everton", 30);
        Jogador jogador3 = new Jogador("Thiago", 40);

        ArrayList<Jogador> jogadores = new ArrayList<>();
        jogadores.add(jogador1);
        jogadores.add(jogador2);
        jogadores.add(jogador3);

        //Jogo jogo = new Jogo("Game01", LocalDate.of(2024, 12, 9), jogadores);

        Jogo jogo = new Jogo("Game01", LocalDate.of(2024, 12, 9));
        jogo.adicionarJogador(jogador1);
        jogo.adicionarJogador(jogador2);
        jogo.adicionarJogador(jogador3);


        jogo.verificarVencedor();
    }
}
