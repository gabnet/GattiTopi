/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gattitopi.automi;

import gattitopi.automi.medioautomi.MedioAutomaBase;
import gattitopi.concetti.Posizione;
import gattitopi.concetti.Prato;
import gattitopi.automi.pezzi.Naso;
import gattitopi.automi.pezzi.Occhi;
import gattitopi.automi.pezzi.Zampe;

/**
 *
 * @author gorig
 */
public abstract class AutomaBase extends MedioAutomaBase implements Automa {

    protected final Naso naso;
    protected final Zampe zampe;
    protected final Occhi occhi;

    public AutomaBase(EnumAutoma tipo, Integer id, Posizione posizione, Naso naso, Zampe zampe, Occhi occhi) {
        super(tipo, id, posizione);
        this.naso = naso;
        this.zampe = zampe;
        this.occhi = occhi;
    }
    
    @Override
    public void setPrato(Prato prato){
        naso.setPrato(prato);
        zampe.setPrato(prato);
        occhi.setPrato(prato);
    }
}
