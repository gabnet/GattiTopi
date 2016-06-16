/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gattitopi.automi.pezzi;

import gattitopi.automi.EnumAutoma;
import gattitopi.automi.microautomi.MicroAutoma;
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
        
        MicroAutoma direzione;

        //O
        direzione = intorno.prendi(posizione.riga, posizione.colonna - 1);
        if (valida(direzione) || libera(direzione))
            muri.add(Direzione.O);

        //NO
        direzione = intorno.prendi(posizione.riga - 1, posizione.colonna - 1);
        if (valida(direzione) || libera(direzione))
            muri.add(Direzione.NO);
        
        //N
        direzione = intorno.prendi(posizione.riga - 1, posizione.colonna);
        if (valida(direzione) || libera(direzione))
             muri.add(Direzione.N);

        //NE
        direzione = intorno.prendi(posizione.riga - 1, posizione.colonna + 1);
        if (valida(direzione) || libera(direzione))
             muri.add(Direzione.NE);
        
        //E
        direzione = intorno.prendi(posizione.riga, posizione.colonna + 1);
        if (valida(direzione) || libera(direzione))
             muri.add(Direzione.E);
        
        //SE
        direzione = intorno.prendi(posizione.riga + 1, posizione.colonna + 1);
        if (valida(direzione) || libera(direzione))
             muri.add(Direzione.SE);
        
        //S
        direzione = intorno.prendi(posizione.riga + 1, posizione.colonna);
        if (valida(direzione) || libera(direzione))
             muri.add(Direzione.S);
        
        //SO
        direzione = intorno.prendi(posizione.riga + 1, posizione.colonna - 1);
        if (valida(direzione) || libera(direzione))
             muri.add(Direzione.SO);
        
        return muri;
    }

    private boolean valida(MicroAutoma direzione) {
        return direzione != null;
    }

    private boolean libera(MicroAutoma direzione) {
        return direzione != null && EnumAutoma.NULLO.equals(direzione.tipo());
    }
}
