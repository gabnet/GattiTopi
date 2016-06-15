/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gattitopi.automi;

import gattitopi.concetti.Ids;
import gattitopi.concetti.Posizione;
import gattitopi.concetti.Direzione;
import gattitopi.automi.pezzi.NasoTopo;
import gattitopi.automi.pezzi.OcchiTopo;
import gattitopi.automi.pezzi.ZampeTopo;
import java.util.ArrayList;

/**
 *
 * @author gorig
 */
public class AutomaTopo extends AutomaBase {

    public AutomaTopo(Posizione posizione) {
        super(EnumAutoma.TOPO, Ids.nuovo(), posizione, new NasoTopo(), new ZampeTopo(), new OcchiTopo());
    }

    @Override
    public Posizione muovi() {
        ArrayList<Direzione> muri = occhi.guarda(posizione);
        
        return zampe.zitzit(posizione, naso.sniff(posizione, muri));
    }
}
