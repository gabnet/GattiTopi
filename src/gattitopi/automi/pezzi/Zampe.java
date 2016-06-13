/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gattitopi.automi.pezzi;

import gattitopi.ambiente.Prato;
import gattitopi.automi.Posizione;
import java.util.ArrayList;

/**
 *
 * @author gorig
 */
public abstract class Zampe extends Pezzo {
    
    public Zampe(Prato prato) {
        super(prato);
    }
    
    public abstract Posizione zitzit(Posizione posizione, Direzione direzione);
    public abstract ArrayList<Direzione> muriCose(Posizione posizione);
}
