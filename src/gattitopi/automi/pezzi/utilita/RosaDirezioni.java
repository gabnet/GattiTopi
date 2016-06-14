/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gattitopi.automi.pezzi.utilita;

import gattitopi.concetti.Direzione;

/**
 *
 * @author gorig
 */
public class RosaDirezioni extends ListaCircolare<Direzione>{
    
    public RosaDirezioni(){
        for(Direzione d : Direzione.values())
            add(d);
    }
}
