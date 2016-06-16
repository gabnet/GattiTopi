/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gattitopi.automi.pezzi;

import gattitopi.automi.EnumAutoma;
import gattitopi.concetti.Direzione;
import gattitopi.concetti.Intorno;
import gattitopi.concetti.Posizione;
import java.util.ArrayList;

/**
 *
 * @author gorig
 */
public class OcchiTopo extends Occhi{

    @Override
    public ArrayList<Direzione> guarda(Posizione posizione) {
        ArrayList<Direzione> muri = new ArrayList<>();
        
        Intorno intorno = prato.creaIntorno(posizione, vista);
        
        
        
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
        return prato.prendi(riga, colonna) != null && EnumAutoma.NULLO.equals(prato.prendi(riga, colonna).tipo());
    }
}
