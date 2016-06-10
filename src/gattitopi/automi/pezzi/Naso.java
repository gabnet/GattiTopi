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
public abstract class Naso extends Pezzo {

    public Naso(Prato prato) {
        super(prato);
    }
    
    public abstract Direzione sniff(Posizione posizione, ArrayList<Direzione> muri);
}
