public class Batalha {
    public Ninja lutar(Ninja primeiroNinja, Ninja segundoNinja) {
        if (primeiroNinja.getNome().equals("Itachi")) {
            return primeiroNinja;
        } else if (segundoNinja.getNome().equals("Itachi")) {
            return segundoNinja;
        }

        realizarTurno(primeiroNinja, segundoNinja);
        realizarTurno(primeiroNinja, segundoNinja);
        realizarTurno(primeiroNinja, segundoNinja);

        if (primeiroNinja.getChakra() > segundoNinja.getChakra()) {
            return primeiroNinja;
        } else if (primeiroNinja.getChakra() < segundoNinja.getChakra()) {
            return segundoNinja;
        } else {
            return primeiroNinja;
        }
    }

    private void realizarTurno(Ninja primeiroNinja, Ninja segundoNinja) {
        primeiroNinja.atacar(segundoNinja);
        segundoNinja.atacar(primeiroNinja);
    }
}