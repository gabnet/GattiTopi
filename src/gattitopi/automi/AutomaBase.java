/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gattitopi.automi;

import gattitopi.concetti.Posizione;
import gattitopi.concetti.Prato;
import gattitopi.automi.pezzi.Naso;
import gattitopi.automi.pezzi.Zampe;

/**
 *
 * @author gorig
 */
public abstract class AutomaBase implements Automa {

    private final EnumAutomi tipo;
    protected Posizione posizione;
    private final Integer id;
    
    protected final Naso naso;
    protected final Zampe zampe;

    public AutomaBase(EnumAutomi tipo, Integer id, Posizione posizione, Naso naso, Zampe zampe) {
        this.tipo = tipo;
        this.posizione = posizione;
        this.id = id;
        this.naso = naso;
        this.zampe = zampe;
    }
        
    @Override
    public void setPosizione(Posizione corrente) {
        this.posizione = corrente;
    }
    
    @Override
    public void setPrato(Prato prato){
        naso.setPrato(prato);
        zampe.setPrato(prato);
    }
    
    @Override
    public MicroAutoma prendiMicro(){
        return new MicroAutoma(tipo, id);
    }
    
    
    
    

    
    public EnumAutomi tipo(){
        return tipo;
    }

    public Integer id() {
        return id;
    }
    
    @Override
    public Posizione posizione(){
        return posizione;
    }
    
    @Override
    public Posizione copiaPosizione(){
        return new Posizione(posizione.riga, posizione.colonna);
    }
    
    @Override
    public void sposta(Posizione posizione){
        this.posizione = posizione;
    }
}
