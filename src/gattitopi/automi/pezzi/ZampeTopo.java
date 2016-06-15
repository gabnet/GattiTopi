/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gattitopi.automi.pezzi;

import gattitopi.concetti.Direzione;
import gattitopi.concetti.Posizione;

/**
 *
 * @author gorig
 */
public class ZampeTopo extends Zampe {
    
    @Override
    public Posizione zitzit(Posizione posizione, Direzione direzione) {
        
        if (Direzione.N.equals(direzione))
            return new Posizione(posizione.riga - 1, posizione.colonna);
        
        if (Direzione.NE.equals(direzione))
            return new Posizione(posizione.riga - 1, posizione.colonna + 1);
        
        if (Direzione.E.equals(direzione))
            return new Posizione(posizione.riga, posizione.colonna + 1);
        
        if (Direzione.SE.equals(direzione))
            return new Posizione(posizione.riga + 1, posizione.colonna + 1);
        
        if (Direzione.S.equals(direzione))
            return new Posizione(posizione.riga + 1, posizione.colonna);
        
        if (Direzione.SO.equals(direzione))
            return new Posizione(posizione.riga + 1, posizione.colonna - 1);
        
        if (Direzione.O.equals(direzione))
            return new Posizione(posizione.riga, posizione.colonna - 1);
        
        if (Direzione.NO.equals(direzione))
            return new Posizione(posizione.riga - 1, posizione.colonna - 1);
        
        return posizione;
    }
}
