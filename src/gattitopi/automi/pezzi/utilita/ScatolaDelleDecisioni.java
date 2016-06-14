/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gattitopi.automi.pezzi.utilita;

import gattitopi.concetti.Decisione;
import gattitopi.concetti.Direzione;
import java.util.ArrayDeque;
import java.util.ArrayList;

/**
 *
 * @author gorig
 */
public class ScatolaDelleDecisioni {

    private static final RosaDecisioni decisioni = new RosaDecisioni();
    private static final RosaDirezioni direzioni = new RosaDirezioni();

    public final static int possibilita = 8;
    
    public static ArrayDeque<Decisione> consigliate(Direzione direzione) {
        
        ArrayDeque<Decisione> proposte = new ArrayDeque<>();
        
        int indice10 = direzioni.indexOf(direzione);
        
        for(int i = 0; i < possibilita; i++)
            proposte.push(new Decisione(direzioni.get(i + indice10), decisioni.get(i)));
        
        ArrayDeque<Decisione> proposteOrdinate = new ArrayDeque<>();
        
        proposte.stream().sorted((d1 ,d2) -> d1.peso.compareTo(d2.peso)).forEach(d -> proposteOrdinate.push(d));
        
        return proposteOrdinate;
    }
    
    public static ArrayList<Direzione> listaDirezioni(){
        
        return (ArrayList<Direzione>) direzioni.clone();
    }
}
