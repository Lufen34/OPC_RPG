import java.util.Scanner;

public class Game {
    private Personnage joueur1;
    private Personnage joueur2;

    /**
     * Apply input in the variable
     * @return input
     */

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
    private Personnage creationPersonnage(Personnage joueur){
        Scanner scan = new Scanner(System.in);
        int input, niveau, force, agilité, intel;
        System.out.println("Veuillez choisir la classe de votre personnage (1 : Guerrier, 2 : Rôdeur, 3 : Mage)");
        input = scan.nextInt();
        do  {
            switch (input){
                case 1:
                    System.out.println("Niveau du personnage ?");
                    niveau = setStat();
                    System.out.println("Force du personnage ?");
                    force = setStat();
                    System.out.println("Agilité du personnage ?");
                    agilité = setStat();
                    System.out.println("Intelligence du personnage ?");
                    intel = setStat();
                    joueur = new Guerrier(niveau, force, agilité, intel);
                    joueur.setClasse(Classe.Guerrier);
                    break;
                case 2:
                    System.out.println("Niveau du personnage ?");
                    niveau = setStat();
                    System.out.println("Force du personnage ?");
                    force = setStat();
                    System.out.println("Agilité du personnage ?");
                    agilité = setStat();
                    System.out.println("Intelligence du personnage ?");
                    intel = setStat();
                    joueur = new Rodeur(niveau, force, agilité, intel);
                    joueur.setClasse(Classe.Rodeur);
                    break;
                case 3:
                    System.out.println("Niveau du personnage ?");
                    niveau = setStat();
                    System.out.println("Force du personnage ?");
                    force = setStat();
                    System.out.println("Agilite du personnage ?");
                    agilité = setStat();
                    System.out.println("Intelligence du personnage ?");
                    intel = setStat();
                    joueur = new Mage(niveau, force, agilité, intel);
                    joueur.setClasse(Classe.Mage);
                    break;
            }
        } while (input < 1 || input > 3);
    return joueur;
    }

    public Game() {
        System.out.println("Création du personnage du Joueur 1:");
        joueur1 = creationPersonnage(new Personnage());
        System.out.println(joueur1.toString());
        joueur2 = creationPersonnage(new Personnage());
        System.out.println(joueur2.toString());
    }

    public void run()
    {

    }
}
