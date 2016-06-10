/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gattitopi.automi;

import gattitopi.automi.pezzi.Naso;
import gattitopi.automi.pezzi.Zampe;

/**
 *
 * @author gorig
 */
public class Gatto extends AutomaBase{

    public Gatto(Posizione posizione, Naso naso, Zampe zampe) {
        super(EnumAutomi.GATTO, posizione, naso, zampe);
    }

    @Override
    public Posizione muovi() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
