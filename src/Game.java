import java.util.Scanner;

public class Game {
    private Personnage joueur1;
    private Personnage joueur2;

    private int setStat(){
        Scanner scan = new Scanner(System.in);
        int input;
        input = scan.nextInt();
        return (int)input;
    }

    /**
     * Creation du personnage par le joueur
     * @param joueur le personnage en question
     */
    private void creationPersonnage(Personnage joueur){
        Scanner scan = new Scanner(System.in);
        int input, niveau, force, agilité, intel;
        System.out.println("Veuillez choisir la classe de votre personnage (1 : Guerrier, 2 : Rôdeur, 3 : Mage");
        input = scan.nextInt();
        switch (input){
            case 1:
                System.out.println("Niveau du personnage ?");
                niveau = setStat();
                System.out.println("Force du personnage ?");
                force = setStat();
                System.out.println("Agilité du personnage ?");
                agilité = setStat();
                System.out.printf("Intelligence du personnage ?");
                intel = setStat();
                joueur = new Guerrier(niveau, force, agilité, intel);
                break;
            case 2:
                System.out.println("Niveau du personnage ?");
                niveau = setStat();
                System.out.println("Force du personnage ?");
                force = setStat();
                System.out.println("Agilité du personnage ?");
                agilité = setStat();
                System.out.printf("Intelligence du personnage ?");
                intel = setStat();
                joueur = new Rodeur(niveau, force, agilité, intel);
                break;
            case 3:
                System.out.println("Niveau du personnage ?");
                niveau = setStat();
                System.out.println("Force du personnage ?");
                force = setStat();
                System.out.println("Agilité du personnage ?");
                agilité = setStat();
                System.out.printf("Intelligence du personnage ?");
                intel = setStat();
                joueur = new Mage(niveau, force, agilité, intel);
                break;
        }
    }

    public Game() {
        System.out.println("Création du personnage du Joueur 1:");
        creationPersonnage(joueur1);
    }
}
