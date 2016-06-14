/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gattitopi.automi;

import gattitopi.concetti.Ids;
import gattitopi.concetti.Posizione;
import gattitopi.concetti.Direzione;
import gattitopi.automi.pezzi.NasoGatto;
import gattitopi.automi.pezzi.ZampeGatto;
import java.util.ArrayList;

/**
 *
 * @author gorig
 */
public class AutomaGatto extends AutomaBase{

    public AutomaGatto(Posizione posizione) {
        super(EnumAutoma.GATTO, Ids.nuovo(), posizione, new NasoGatto(), new ZampeGatto());
    }

    @Override
    public Posizione muovi() {
        
        ArrayList<Direzione> muri = zampe.muriCose(posizione);
        
        return zampe.zitzit(posizione, naso.sniff(posizione, muri));
    }
}
