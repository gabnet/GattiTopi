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
public class NasoGatto extends Naso {

    public NasoGatto(Prato prato) {
        super(prato);
    }

    @Override
    public Direzione sniff(Posizione posizione, ArrayList<Direzione> muri) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
