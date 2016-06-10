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
public class ZampeGatto extends Zampe {

    public ZampeGatto(Prato prato) {
        super(prato);
    }

    @Override
    public Posizione zitzit(Direzione direzione) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Direzione> muri(Posizione posizione) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
