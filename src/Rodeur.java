public class Rodeur extends Personnage implements Competence {

    public Rodeur(int niveau, int force, int agilité, int intel) {
        super(niveau, force, agilité, intel);
    }

    public Rodeur(int niveau, int force, int agilité) {
        super(niveau, force, agilité);
    }

    public Rodeur(int niveau, int force) {
        super(niveau, force);
    }

    public Rodeur(int niveau) {
        super(niveau);
    }

    @Override
    public int attaqueBasique(Personnage cible) {
        return 0;
    }

    @Override
    public int attaqueSpeciale(Personnage cible) {
        return 0;
    }

    @Override
    public String toString() {
        return "Tadaaaa je suis le Rodeur joueur " + playerID + " niveau " + niveau + " je possède " + vie + " de vitalité, "
                + force + " de force, " + agilité + " d'agilité et " + intel + " d'intelligence !";
    }
}
