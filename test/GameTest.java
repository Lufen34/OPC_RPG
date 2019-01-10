import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {
    @Test
    public void CheckPlayerStats(){
        Personnage p = new Guerrier(10, 10, 0, 0);
        assertEquals("Woarg je suis le Guerrier joueur 1 niveau 10 je possède 100 de vitalité, 10 de force" +
                ", 0 d'agilité et 0 d'intelligence !", p.toString());
    }
}