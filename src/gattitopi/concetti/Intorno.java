/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gattitopi.concetti;

import gattitopi.automi.microautomi.MicroAutoma;

/**
 *
 * @author gorig
 */
public class Intorno extends Prato{
    
    private Intorno(int maxX, int maxY, MicroAutoma[][] matrice) {
        super(maxX, maxY);
        this.matrice = matrice;
    }
    
    public static Intorno creaIntorno(Posizione posizione, Prato prato, int lato){
        int limiteSinistro = posizione.riga - lato < 0 ? 0 : posizione.riga - lato;
        int limiteDestro = posizione.riga + lato > prato.righe() ? prato.righe() : posizione.riga + lato;
        
        int limiteSopra = posizione.colonna - lato < 0 ? 0 : posizione.colonna - lato;
        int limiteSotto = posizione.colonna + lato > prato.colonne() ? prato.colonne() : posizione.colonna + lato;
        
        int latoOrizzontale = limiteSinistro - limiteDestro;
        int latoVerticale = limiteSotto - limiteSopra;
        
        MicroAutoma[][] nuovaMatrice = new MicroAutoma[latoVerticale][latoOrizzontale];
        
        for (int riga = 0; riga < latoVerticale; riga++ )
            for (int colonna = 0; colonna < latoOrizzontale; colonna++)
                nuovaMatrice[riga][colonna] = prato.prendi(riga, colonna);
        
        return new Intorno(latoVerticale, latoOrizzontale, nuovaMatrice);
    }
}
