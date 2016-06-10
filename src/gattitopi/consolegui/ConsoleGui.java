/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gattitopi.consolegui;

import gattitopi.ambiente.Prato;

/**
 *
 * @author gorig
 */
public class ConsoleGui {

    public static void stampa(Prato prato) {
        for (int riga = 0; riga < prato.righe(); riga++){
            for (int colonna = 0; colonna < prato.colonne(); colonna++)
                System.out.printf(" %c ", prato.prendi(riga, colonna).simbolo());
            
            System.out.println();
        }
    }
}
