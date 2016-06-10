/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gattitopi.automi;

import gattitopi.automi.pezzi.Direzione;
import gattitopi.automi.pezzi.NasoTopo;
import gattitopi.automi.pezzi.ZampeTopo;
import java.util.ArrayList;

/**
 *
 * @author gorig
 */
public class Topo extends AutomaBase {

    public Topo(Posizione posizione, NasoTopo naso, ZampeTopo zampe) {
        super(EnumAutomi.TOPO, posizione, naso, zampe);
    }

    @Override
    public Posizione muovi() {
        ArrayList<Direzione> muri = zampe.muri(posizione);
        
        return zampe.zitzit(naso.sniff(posizione, muri));
    }
    
}
