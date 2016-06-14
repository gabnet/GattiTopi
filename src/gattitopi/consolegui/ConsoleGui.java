/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gattitopi.consolegui;

import gattitopi.concetti.Popolazione;
import gattitopi.concetti.Prato;
import gattitopi.automi.Automa;
import gattitopi.concetti.Posizione;

/**
 *
 * @author gorig
 */
public class ConsoleGui {

    public static void stampaPrato(Prato prato) {
        for (int riga = 0; riga < prato.righe(); riga++){
            for (int colonna = 0; colonna < prato.colonne(); colonna++)
                System.out.printf(" %s ", prato.prendi(riga, colonna).toString());
            
            System.out.println();
        }
    }

    public static void stampaMovimentoAutoma(Automa automa, Posizione vecchia, Posizione nuova) {
        System.out.printf("%s: %s -> %s\n", automa.toString(), vecchia.toString(), nuova.toString());
    }

    public static void stampaEra(int e, Popolazione popolazione) {
        System.out.printf("Era: %d\n", e);
        System.out.printf("Popolazione Topi: %d Gatti: %d\n", popolazione.quantiTopi(), popolazione.quantiGatti());
    }
}
