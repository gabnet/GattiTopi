/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gattitopi.automi.pezzi;

import gattitopi.ambiente.Prato;
import gattitopi.automi.Automa;
import gattitopi.automi.EnumAutomi;
import gattitopi.automi.Posizione;
import gattitopi.automi.pezzi.utilita.Decisione;
import gattitopi.automi.pezzi.utilita.ScatolaDelleDecisioni;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 *
 * @author gorig
 */
public class NasoTopo extends Naso {
    
    public NasoTopo(Prato prato) {
        super(prato);
    }
    
    public Direzione sniff(Posizione posizione, ArrayList<Direzione> esclusi){
        
        //O
        if (checkGatto(prato.prendi(posizione.riga, posizione.colonna -  1)))
            return calcolaDirezioneInseguito(Direzione.E, esclusi);

        //NO
        if (checkGatto(prato.prendi(posizione.riga - 1, posizione.colonna - 1)))
            return calcolaDirezioneInseguito(Direzione.SE, esclusi);
        
        //N
        if (checkGatto(prato.prendi(posizione.riga - 1, posizione.colonna)))
            return calcolaDirezioneInseguito(Direzione.S, esclusi);

        //NE
        if (checkGatto(prato.prendi(posizione.riga - 1, posizione.colonna + 1)))
            return calcolaDirezioneInseguito(Direzione.SO, esclusi);
        
        //E
        if (checkGatto(prato.prendi(posizione.riga, posizione.colonna + 1)))
            return calcolaDirezioneInseguito(Direzione.O, esclusi);
        
        //SE
        if (checkGatto(prato.prendi(posizione.riga + 1, posizione.colonna + 1)))
            return calcolaDirezioneInseguito(Direzione.NO, esclusi);
        
        //S
        if (checkGatto(prato.prendi(posizione.riga + 1, posizione.colonna)))
            return calcolaDirezioneInseguito(Direzione.N, esclusi);
        
        //SO
        if (checkGatto(prato.prendi(posizione.riga + 1, posizione.colonna - 1)))
            return calcolaDirezioneInseguito(Direzione.NE, esclusi);
        
        return calcolaDirezioneLibero(esclusi);
    }

    private boolean checkGatto(Automa automa) {
        return EnumAutomi.GATTO.equals(automa.tipo());
    }

    private Direzione calcolaDirezioneInseguito(Direzione direzione, ArrayList<Direzione> esclusi) {
        
        ArrayDeque<Decisione> direzioniConsigliate = ScatolaDelleDecisioni.consigliate(direzione);
        
        for(int i = 0; i < ScatolaDelleDecisioni.possibilita; i++){
            Decisione decisione = direzioniConsigliate.pop();
            
            if (!esclusi.contains(decisione.direzione))
                return decisione.direzione;
        }
        
        return Direzione.N;
    }

    private Direzione calcolaDirezioneLibero(ArrayList<Direzione> esclusi) {
        Random dado8 = new Random();
        
        ArrayList<Direzione> listaDirezioni = ScatolaDelleDecisioni.listaDirezioni();
        
        Collections.shuffle(listaDirezioni, dado8);
        
        for(Direzione d : listaDirezioni)
            if (!esclusi.contains(d))
                return d;
        
        return Direzione.N;
    }
}
