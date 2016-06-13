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
    private NasoTopo nasoFake;
    
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
        
        ArrayList<Direzione> resultMuri;
        Direzione resultSniff;
        
        System.out.println("muriCose 0 1");
        posizioneFake = new Posizione(0, 1);
        pratoFake = Prato.pratoVuoto(2, 2);
        nasoFake = new NasoTopo(pratoFake);
        pratoFake.posiziona(new Topo(posizioneFake, nasoFake, sut), posizioneFake);
        ConsoleGui.stampaPrato(pratoFake);
        sut = new ZampeTopo(pratoFake);

        resultMuri = sut.muriCose(posizioneFake);
        assertEquals(resultMuri.size(), 5);
        
        resultSniff = nasoFake.sniff(posizioneFake, resultMuri);
        assert(!resultMuri.contains(resultSniff));
        
        System.out.println("muriCose 1 1");
        posizioneFake = new Posizione(1, 1);
        pratoFake = Prato.pratoVuoto(2, 2);
        nasoFake = new NasoTopo(pratoFake);
        pratoFake.posiziona(new Topo(posizioneFake, nasoFake, sut), posizioneFake);
        ConsoleGui.stampaPrato(pratoFake);
        sut = new ZampeTopo(pratoFake);
        
        resultMuri = sut.muriCose(posizioneFake);
        assertEquals(resultMuri.size(), 5);
        
        resultSniff = nasoFake.sniff(posizioneFake, resultMuri);
        assert(!resultMuri.contains(resultSniff));
        
        System.out.println("muriCose 1 0");
        posizioneFake = new Posizione(1, 0);
        pratoFake = Prato.pratoVuoto(2, 2);
        nasoFake = new NasoTopo(pratoFake);
        pratoFake.posiziona(new Topo(posizioneFake, nasoFake, sut), posizioneFake);
        ConsoleGui.stampaPrato(pratoFake);
        sut = new ZampeTopo(pratoFake);
        
        resultMuri = sut.muriCose(posizioneFake);
        assertEquals(resultMuri.size(), 5);
        
        resultSniff = nasoFake.sniff(posizioneFake, resultMuri);
        assert(!resultMuri.contains(resultSniff));
        
        System.out.println("muriCose 0 0");
        posizioneFake = new Posizione(0, 0);
        pratoFake = Prato.pratoVuoto(2, 2);
        nasoFake = new NasoTopo(pratoFake);
        pratoFake.posiziona(new Topo(posizioneFake, nasoFake, sut), posizioneFake);
        ConsoleGui.stampaPrato(pratoFake);
        sut = new ZampeTopo(pratoFake);
        
        resultMuri = sut.muriCose(posizioneFake);
        assertEquals(resultMuri.size(), 5);
        
        resultSniff = nasoFake.sniff(posizioneFake, resultMuri);
        assert(!resultMuri.contains(resultSniff));
    }
}
