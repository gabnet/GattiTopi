/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gattitopi;

import gattitopi.ambiente.Prato;
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
        
        Prato prato = Prato.pratoVuoto(20, 20);
        
        ConsoleGui.stampa(prato);
    }
}