/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gattitopi.automi;

import gattitopi.automi.microautomi.MicroAutomaBase;
import gattitopi.automi.microautomi.MicroAutoma;
import gattitopi.concetti.Posizione;
import gattitopi.concetti.Prato;
import gattitopi.automi.pezzi.Naso;
import gattitopi.automi.pezzi.Occhi;
import gattitopi.automi.pezzi.Zampe;

/**
 *
 * @author gorig
 */
public abstract class AutomaBase implements Automa {

    private final EnumAutoma tipo;
    protected Posizione posizione;
    private final Integer id;
    
    protected final Naso naso;
    protected final Zampe zampe;
    protected final Occhi occhi;

    public AutomaBase(EnumAutoma tipo, Integer id, Posizione posizione, Naso naso, Zampe zampe, Occhi occhi) {
        this.tipo = tipo;
        this.posizione = posizione;
        this.id = id;
        this.naso = naso;
        this.zampe = zampe;
        this.occhi = occhi;
    }
        
    @Override
    public void setPosizione(Posizione corrente) {
        this.posizione = corrente;
    }
    
    @Override
    public void setPrato(Prato prato){
        naso.setPrato(prato);
        zampe.setPrato(prato);
        occhi.setPrato(prato);
    }
    
    @Override
    public MicroAutoma prendiMicro(){
        return new MicroAutomaBase(tipo, id);
    }
    
    public EnumAutoma tipo(){
        return tipo;
    }

    public Integer id() {
        return id;
    }
    
    @Override
    public Posizione copiaPosizione(){
        return new Posizione(posizione.riga, posizione.colonna);
    }
}
