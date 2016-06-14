/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gattitopi.automi.pezzi;

import gattitopi.concetti.Direzione;
import gattitopi.automi.EnumAutoma;
import gattitopi.concetti.Posizione;
import java.util.ArrayList;

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
    
    @Override
    public ArrayList<Direzione> muriCose(Posizione posizione) {
        ArrayList<Direzione> muri = new ArrayList<>();
        
        //O
        if (!checkPrato(posizione.riga, posizione.colonna - 1) || !checkLibero(posizione.riga, posizione.colonna - 1))
            muri.add(Direzione.O);

        //NO
        if (!checkPrato(posizione.riga - 1, posizione.colonna - 1) || !checkLibero(posizione.riga - 1, posizione.colonna - 1))
            muri.add(Direzione.NO);
        
        //N
        if (!checkPrato(posizione.riga - 1, posizione.colonna) || !checkLibero(posizione.riga - 1, posizione.colonna))
             muri.add(Direzione.N);

        //NE
        if (!checkPrato(posizione.riga - 1, posizione.colonna + 1) || !checkLibero(posizione.riga - 1, posizione.colonna + 1))
             muri.add(Direzione.NE);
        
        //E
        if (!checkPrato(posizione.riga, posizione.colonna + 1) || !checkLibero(posizione.riga, posizione.colonna + 1))
             muri.add(Direzione.E);
        
        //SE
        if (!checkPrato(posizione.riga + 1, posizione.colonna + 1) || !checkLibero(posizione.riga + 1, posizione.colonna + 1))
             muri.add(Direzione.SE);
        
        //S
        if (!checkPrato(posizione.riga + 1, posizione.colonna) || !checkLibero(posizione.riga + 1, posizione.colonna))
             muri.add(Direzione.S);
        
        //SO
        if (!checkPrato(posizione.riga + 1, posizione.colonna - 1) || !checkLibero(posizione.riga + 1, posizione.colonna - 1))
             muri.add(Direzione.SO);
        
        return muri;
    }

    private boolean checkPrato(int riga, int colonna) {
        return prato.valido(riga, colonna);
    }

    private boolean checkLibero(int riga, int colonna) {
        return EnumAutoma.NULLO.equals(prato.prendi(riga, colonna).tipo());
    }
}
