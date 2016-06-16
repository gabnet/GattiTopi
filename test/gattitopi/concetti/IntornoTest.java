/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gattitopi.concetti;

import gattitopi.automi.FabbricaAutomi;
import gattitopi.consolegui.ConsoleGui;
import org.junit.Test;

/**
 *
 * @author gorig
 */
public class IntornoTest {
    
    private Prato pratoTest;
    private Intorno intornoTest;
    
    /**
     * Test of creaIntorno method, of class Intorno.
     */
    @Test
    public void testCreaIntorno() {

        System.out.println("Test prato piccolo");
        testaPrato(2, 1, new Posizione(1, 0), 1);
        testaPrato(2, 1, new Posizione(0, 0), 1);
        testaPrato(2, 1, new Posizione(0, 0), 2);
        
        System.out.println("Test prato medio");
        testaPrato(3, 3, new Posizione(0, 1), 1);
        testaPrato(3, 3, new Posizione(0, 1), 2);
        testaPrato(3, 3, new Posizione(0, 0), 1);
        testaPrato(3, 3, new Posizione(0, 0), 2);
        testaPrato(3, 3, new Posizione(3, 3), 1);
        testaPrato(3, 3, new Posizione(3, 3), 2);
        /*
        testaPrato(3, 6);
        testaPrato(4, 4);
        testaPrato(4, 1);
        testaPrato(5, 5);
*/
        
        assert true;
    }
    
    private void testaPrato(int righe, int colonne, Posizione centroIntorno, int raggio){
        System.out.printf("crea Prato x: %s y: %s\n", righe, colonne);
        pratoTest = riempiPrato(righe, colonne);
        ConsoleGui.stampaPrato(pratoTest);
        System.out.printf("crea intorno x: %s y: %s centro: %s, %s raggio: %s\n", righe, colonne, centroIntorno.riga, centroIntorno.colonna, raggio);
        intornoTest = pratoTest.creaIntorno(centroIntorno, raggio);
        ConsoleGui.stampaPrato(intornoTest);
    }

    private Prato riempiPrato(int righe, int colonne) {
        Prato result = new Prato(righe, colonne);
        
        for (int riga = 0; riga < righe; riga++)
            for (int colonna = 0; colonna < colonne; colonna++)
                result.posiziona(FabbricaAutomi.prendiMicroNullo(Ids.nuovo()), new Posizione(riga, colonna));
        
        return result;
    }
    
}
