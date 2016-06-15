/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gattitopi.concetti;

import gattitopi.automi.FabbricaAutomi;
import gattitopi.consolegui.ConsoleGui;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gorig
 */
public class IntornoTest {
    
    private Prato pratoTest;
    
    /**
     * Test of creaIntorno method, of class Intorno.
     */
    @Test
    public void testCreaIntorno() {

        testaPrato(2, 1);
        testaPrato(1, 1);
        testaPrato(2, 2);
        testaPrato(3, 3);
        testaPrato(3, 6);
        testaPrato(4, 4);
        testaPrato(4, 1);
        testaPrato(5, 5);

    }
    
    private void testaPrato(int righe, int colonne){
        System.out.printf("creaIntorno x: %s y: %s\n", righe, colonne);
        pratoTest = riempiPrato(righe, colonne);
        ConsoleGui.stampaPrato(pratoTest);
    }

    private Prato riempiPrato(int righe, int colonne) {
        Prato result = new Prato(righe, colonne);
        
        for (int riga = 0; riga < righe; riga++)
            for (int colonna = 0; colonna < colonne; colonna++)
                result.posiziona(FabbricaAutomi.prendiMicroNull(), new Posizione(riga, colonna));
        
        return result;
    }
    
}
