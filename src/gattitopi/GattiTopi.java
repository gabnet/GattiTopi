/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gattitopi;

import gattitopi.ambiente.Evoluzione;
import gattitopi.ambiente.Popolazione;
import gattitopi.ambiente.Prato;
import gattitopi.automi.EnumAutomi;

/**
 *
 * @author gorig
 */
public class GattiTopi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Prato prato = Prato.pratoVuoto(20, 20);
        Popolazione popolazione = new Popolazione();
        prato.aggiungiAutomi(EnumAutomi.TOPO, 10, popolazione);
        
        Evoluzione evo = new Evoluzione(popolazione, prato, 5);
        evo.via();
    }
}