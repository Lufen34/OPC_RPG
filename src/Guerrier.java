public class Guerrier extends Personnage implements Competence {

    public Guerrier(int niveau, int force, int agilité, int intel) {
        super(niveau, force, agilité, intel);
    }

    public Guerrier(int niveau, int force, int agilité) {
        super(niveau, force, agilité);
    }

    public Guerrier(int niveau, int force) {
        super(niveau, force);
    }

    public Guerrier(int niveau) {
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
        return "Woarg je suis le Guerrier joueur " + playerID + " niveau " + niveau + " je possède " + vie + " de vitalité, "
                + force + " de force, " + agilité + " d'agilité et " + intel + " d'intelligence !";
    }
}
