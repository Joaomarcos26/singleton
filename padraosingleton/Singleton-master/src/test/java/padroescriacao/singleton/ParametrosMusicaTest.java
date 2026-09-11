package padroescriacao.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParametrosMusicaTest {
    @Test
    void deveRetornarMusicaAtual() {
        ParametrosMusica musicaAtual = ParametrosMusica.getInstance();
        assertNotNull(musicaAtual);
        musicaAtual.setmusicaAtual("Frio");
        assertEquals("Frio", musicaAtual.getmusicaAtual());
    }
    @Test
    void deveRetornarVolume() {
        ParametrosMusica.getInstance()
                .setvolume(50);
        assertEquals(50, ParametrosMusica.getInstance().getvolume());
    }

    @Test
    void deveRetornarMesmaInstancia() {
        ParametrosMusica musica1 = ParametrosMusica.getInstance();
        ParametrosMusica musica2 = ParametrosMusica.getInstance();
        assertSame(musica1, musica2);
    }

    @Test
    void deveretornarcantor() {
        ParametrosMusica cantor = ParametrosMusica.getInstance();
        assertNotNull(cantor);
        cantor.setcantor("Wiu");
        assertEquals("Wiu", cantor.getcantor());
    }
    @Test
    void deveRetornarMemsoCantor() {
        ParametrosMusica cantor1 = ParametrosMusica.getInstance();
        ParametrosMusica cantor2 = ParametrosMusica.getInstance();
        assertSame(cantor1, cantor2);
    }
}