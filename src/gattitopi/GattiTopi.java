/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gattitopi;

import gattitopi.concetti.Evoluzione;
import gattitopi.concetti.Popolazione;
import gattitopi.concetti.Prato;
import gattitopi.automi.EnumAutomi;
import gattitopi.automi.FabbricaAutomi;
import gattitopi.consolegui.ConsoleGui;

/**
 *
 * @author gorig
 */
public class GattiTopi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Popolazione popolazione = new Popolazione();
        popolazione.aggiungiAutomi(FabbricaAutomi.creaAutomi(EnumAutomi.TOPO, 2));
        Prato prato = Prato.pratoVuoto(20, 20);
        prato.aggiungiAutomi(popolazione);
        
        ConsoleGui.stampaPrato(prato);
        
        Evoluzione evo = new Evoluzione(popolazione, prato, 20);
        try {
            evo.via();
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}