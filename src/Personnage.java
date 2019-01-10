public class Personnage {
    protected Classe classe;
    protected int niveau = 1;
    protected int vie = 100;
    protected int force = 0;
    protected int agilité = 0;
    protected int intel = 0;
    protected int playerID;
    private static int amountPlayer = 0;


    public Personnage(int niveau, int force, int agilité, int intel) {
        this(niveau, force, agilité);
        this.intel = intel;
    }

    public Personnage(int niveau, int force, int agilité) {
        this(niveau, force);
        this.agilité = agilité;
    }

    public Personnage(int niveau, int force){
        this(niveau);
        this.force = force;
    }

    public Personnage(int niveau){
        this.niveau = niveau;
        this.vie = vie;
        amountPlayer++;
        playerID = amountPlayer;
    }

    public Personnage(){

    }

    public int getNiveau() {
        return niveau;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    public int getVie() {
        return vie;
    }

    public void setVie(int vie) {
        this.vie = vie;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public int getAgilité() {
        return agilité;
    }

    public void setAgilité(int agilité) {
        this.agilité = agilité;
    }

    public int getIntel() {
        return intel;
    }

    public void setIntel(int intel) {
        this.intel = intel;
    }

    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }
}
