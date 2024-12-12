package lista04.exercicio03;

public class Jogador {

    private String nome;
    private Integer pontuacao;

    public Jogador(String nome, Integer pontuacao) {
        this.nome = nome;
        this.pontuacao = pontuacao;
    }

    public Integer calcularPontuacaoMedia(Integer numeroJogadores) {
        return this.pontuacao = this.pontuacao / numeroJogadores;
    }

    public String reiniciarJogo() {
        this.pontuacao = 0;
        return "Jogo reiniciado!";
    }

    public Integer exibirPontuacao() {
        return this.pontuacao;
    }

    public Integer getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(Integer pontuacao) {
        this.pontuacao = pontuacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
