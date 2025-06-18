public class Ninja {
    private String nome;
    private int chakra;
    private Jutsu jutsu;

    public Ninja(String nome, Jutsu jutsu) {
        this.nome = nome;
        this.chakra = 100;
        this.jutsu = jutsu;
    }

    public void atacar(Ninja oponente) {
        if (this.chakra >= this.jutsu.getQuantidadeChakra()) {
            this.chakra -= this.jutsu.getQuantidadeChakra();
            oponente.receberGolpe(jutsu.getDano());
        }
    }

    public void receberGolpe(int dano) {
        this.chakra = Math.max(0, this.chakra - dano);
    }

    public String getNome() {
        return nome;
    }

    public int getChakra() {
        return chakra;
    }
}
