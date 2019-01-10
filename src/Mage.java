public class Mage extends Personnage implements Competence {


    public Mage(int niveau, int force, int agilité, int intel) {
        super(niveau, force, agilité, intel);
    }

    public Mage(int niveau, int force, int agilité) {
        super(niveau, force, agilité);
    }

    public Mage(int niveau, int force) {
        super(niveau, force);
    }

    public Mage(int niveau) {
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
}
