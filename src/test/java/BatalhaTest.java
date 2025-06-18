import org.junit.Assert;
import org.junit.Test;

public class BatalhaTest {
    @Test
    public void deveRetornarNinjaComJutsuMaisForteSeOsDoisGastamOMesmoChakra() {
        Jutsu jutsuSakura = new Jutsu(3, 10);
        Ninja sakura = new Ninja("Sakura", jutsuSakura);

        Jutsu jutsuIno = new Jutsu(3, 8);
        Ninja ino = new Ninja("Ino", jutsuIno);

        Batalha batalhaUm = new Batalha();

        Ninja vencedorUm = batalhaUm.lutar(sakura, ino);

        Assert.assertSame(sakura, vencedorUm);
    }

    @Test
    public void deveAtualizarOChakraDoOponenteDeAcordoComODanoDoJutsoQuandoAtacar() {
        Jutsu jutsuGaara = new Jutsu(5, 10);
        Ninja gaara = new Ninja("Gaara", jutsuGaara);

        Jutsu jutsuNaruto = new Jutsu(5, 8);
        Ninja naruto = new Ninja("Naruto", jutsuNaruto);

        int nivelChakraEsperado = 90;

        gaara.atacar(naruto);

        Assert.assertEquals(nivelChakraEsperado, naruto.getChakra());
    }

    @Test
    public void deveRetornarPrimeiroNinjaComoVencedorQuandoONomeForItachi() {
        Jutsu jutsuItachi = new Jutsu(5, 10);
        Ninja itachi = new Ninja("Itachi", jutsuItachi);

        Jutsu jutsuRockLee = new Jutsu(4, 6);
        Ninja rockLee = new Ninja("Rock Lee", jutsuRockLee);

        Batalha batalhaDois = new Batalha();

        Ninja vencedorDois = batalhaDois.lutar(itachi, rockLee);

        Assert.assertSame(itachi, vencedorDois);
    }

    @Test
    public void deveRetornarSegundoNinjaComoVencedorQuandoONomeForItachi() {
        Jutsu jutsuAtacante = new Jutsu(5, 8);
        Ninja atacante = new Ninja("Kakashi", jutsuAtacante);

        Jutsu jutsuOponente = new Jutsu(5, 10);
        Ninja oponente = new Ninja("Itachi", jutsuOponente);

        Batalha batalhaTres = new Batalha();

        Ninja vencedorTres = batalhaTres.lutar(atacante, oponente);

        Assert.assertSame(oponente, vencedorTres);
    }

    @Test
    public void deveRetornarPrimeiroNinjaComoVencedorQuandoEmpatar() {
        Jutsu jutsuNinjaUm = new Jutsu(5, 9);
        Ninja ninjaUm = new Ninja("Neji", jutsuNinjaUm);

        Jutsu jutsuNinjaDois = new Jutsu(5, 9);
        Ninja ninjaDois = new Ninja("Hinata", jutsuNinjaDois);

        Batalha batalhaQuatro = new Batalha();

        Ninja vencedorQuatro = batalhaQuatro.lutar(ninjaUm, ninjaDois);

        Assert.assertSame(ninjaUm, vencedorQuatro);
    }

    @Test
    public void deveRetornarSegundoNinjaComoVencedor() {
        Jutsu jutsuNinjaUm = new Jutsu(3, 7);
        Ninja ninjaUm =  new Ninja("Sai", jutsuNinjaUm);

        Jutsu jutsuNinjaDois = new Jutsu(5, 10);
        Ninja ninjaDois = new Ninja("Pain", jutsuNinjaDois);

        Batalha batalhaCinco = new Batalha();

        Ninja vencedorCinco = batalhaCinco.lutar(ninjaUm, ninjaDois);

        Assert.assertSame(ninjaDois, vencedorCinco);
    }

    @Test
    public void deveLimitarQuantidadeChakraDoJutsuAMaximo5() {
        Jutsu jutsu = new Jutsu(10, 5);

        int quantidadeChakraDoJutsu = 5;

        Assert.assertEquals(quantidadeChakraDoJutsu, jutsu.getQuantidadeChakra());
    }

    @Test
    public void deveLimitarDanoDoJutsuAMaximo10() {
        Jutsu jutsu = new Jutsu(5, 12);

        int quantidadeDanoDoJutsu = 10;

        Assert.assertEquals(quantidadeDanoDoJutsu, jutsu.getDano());
    }

    @Test
    public void naoDeveAtacarQuandoNaoTemChakraSuficiente() {
        Jutsu jutsuShino = new Jutsu(4, 10);
        Ninja shino = new Ninja("Shino", jutsuShino);

        Jutsu kibaJutsu = new Jutsu(2, 3);
        Ninja kiba = new Ninja("Kiba", kibaJutsu);

        shino.receberGolpe(97);

        shino.atacar(kiba);

        Assert.assertEquals(3, shino.getChakra());
        Assert.assertEquals(100, kiba.getChakra());
    }
}