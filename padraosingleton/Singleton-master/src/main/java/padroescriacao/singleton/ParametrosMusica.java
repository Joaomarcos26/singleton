package padroescriacao.singleton;

public class ParametrosMusica {

    private ParametrosMusica() {}
    private static ParametrosMusica instance = new ParametrosMusica();
    public static ParametrosMusica getInstance() {
        return instance;
    }
    private String musicaAtual;
    private int volume;
    private String cantor;

    public String getmusicaAtual() {
        return musicaAtual;
    }
    public void setmusicaAtual(String musicaAtual) {
        this.musicaAtual = musicaAtual;
    }

    public int getvolume() {
        return volume;
    }
    public void setvolume(int volume) {
        this.volume = volume;
    }

    public String getcantor() {
        return cantor;
    }

    public void setcantor(String cantor) {
        this.cantor = cantor;
    }
}
