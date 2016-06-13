/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gattitopi.automi.pezzi;

import gattitopi.ambiente.Prato;
import gattitopi.automi.Posizione;
import gattitopi.automi.Topo;
import gattitopi.consolegui.ConsoleGui;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gorig
 */
public class ZampeTopoTest {
    
    private ZampeTopo sut;
    private Prato pratoFake;
    private Posizione posizioneFake;
    
    public ZampeTopoTest() {
    }
    
    @Before
    public void setUp() {
        posizioneFake = new Posizione(0, 1);
        pratoFake = Prato.pratoVuoto(2, 2);
        pratoFake.posiziona(new Topo(posizioneFake, new NasoTopo(pratoFake), sut), posizioneFake);
        ConsoleGui.stampaPrato(pratoFake);
        sut = new ZampeTopo(pratoFake);
    }

    /**
     * Test of zitzit method, of class ZampeTopo.
     
    @Test
    public void testZitzit() {
        System.out.println("zitzit");
        Posizione posizione = null;
        Direzione direzione = null;
        ZampeTopo instance = null;
        Posizione expResult = null;
        Posizione result = instance.zitzit(posizione, direzione);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    */
    /**
     * Test of muriCose method, of class ZampeTopo.
     */
    @Test
    public void testMuriCose() {
        System.out.println("muriCose");

        ArrayList<Direzione> result = sut.muriCose(posizioneFake);

        assertEquals(result.size(), 5);
    }
}
