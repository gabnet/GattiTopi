/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gattitopi.automi;

import gattitopi.concetti.Posizione;
import gattitopi.automi.pezzi.Direzione;
import gattitopi.automi.pezzi.NasoGatto;
import gattitopi.automi.pezzi.ZampeGatto;
import java.util.ArrayList;

/**
 *
 * @author gorig
 */
public class Gatto extends AutomaBase{

    public Gatto(Posizione posizione) {
        super(EnumAutomi.GATTO, Ids.nuovo(), posizione, new NasoGatto(), new ZampeGatto());
    }

    @Override
    public Posizione muovi() {
        
        ArrayList<Direzione> muri = zampe.muriCose(posizione);
        
        return zampe.zitzit(posizione, naso.sniff(posizione, muri));
    }
}
