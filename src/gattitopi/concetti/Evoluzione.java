/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gattitopi.concetti;

import gattitopi.concetti.Popolazione;
import gattitopi.concetti.Prato;
import gattitopi.automi.Automa;
import gattitopi.consolegui.ConsoleGui;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author gorig
 */
public class Evoluzione {
    
    private final Popolazione popolazione;
    private final Prato prato;
    private final int ere;
    
    public Evoluzione(Popolazione popolazione, Prato prato, int ere) {
        this.popolazione = popolazione;
        this.prato = prato;
        this.ere = ere;
    }
    
    public void via() throws IOException, InterruptedException{
        
        for (int e = 0; e < ere; e++){
            
            ConsoleGui.stampaEra(e, popolazione);
            ConsoleGui.stampaPrato(prato);
            
            for(Automa automa : popolazione) {

                Posizione vecchia = automa.copiaPosizione();
                Posizione nuova = automa.muovi();
                automa.setPosizione(nuova);
                prato.sposta(automa.prendiMicro(), vecchia, nuova);
            }
            Thread.sleep(1000);
        }
    }
}
