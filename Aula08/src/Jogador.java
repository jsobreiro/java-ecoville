public class Jogador {

    private String nomeJogador;
    private int pontuacao;
    private int nivel;

    // getters
    public int getNivel() {
        return nivel;
    }

    public String getNomeJogador() {
        return nomeJogador;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    // setters
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    public void setNomeJogador(String nomeJogador) {
        this.nomeJogador = nomeJogador;
    }
    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public Jogador() {}

    public Jogador(String nomeJogador, int pontuacao, int nivel){
        this.nomeJogador = nomeJogador;
        this.pontuacao = pontuacao;
        this.nivel = nivel;
    }

    public void aumentarPontuacao (int valor) {
        System.out.println("Jogador " + nomeJogador);
        System.out.println("Pontuação anterior: " + pontuacao);
        pontuacao += valor;
        System.out.println("Nova pontuação: " + pontuacao);
        System.out.println();
    }

    public void subirNivel(){
        nivel++;
        System.out.println("Jogador " + nomeJogador + 
        " subiu para o nível " + nivel);
        System.out.println();
    }

    public void exibirStatusJogador() {
        System.out.println("Jogador: " + nomeJogador);
        System.out.println("Pontuação: " + pontuacao);
        System.out.println("Nível atual: " + nivel);
        System.out.println("------------------------------\n");
    }


}
