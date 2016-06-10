/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gattitopi.ambiente;

import gattitopi.automi.Automa;
import gattitopi.automi.Posizione;
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
    
    public void via() throws IOException{
        
        for (int e = 0; e < ere; e++){
            for(Automa automa : popolazione) {
                Posizione nuova = automa.muovi();
                prato.sposta(automa, nuova);
            }
            ConsoleGui.stampa(prato);
            
            new BufferedReader(new InputStreamReader(System.in)).readLine();
        }
    }
}
