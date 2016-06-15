/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gattitopi.automi.medioautomi;

import gattitopi.automi.EnumAutoma;
import gattitopi.automi.microautomi.MicroAutoma;
import gattitopi.automi.microautomi.MicroAutomaBase;
import gattitopi.concetti.Posizione;

/**
 *
 * @author gorig
 */
public abstract class MedioAutomaBase extends MicroAutomaBase implements MedioAutoma {
    
    protected Posizione posizione;
    
    public MedioAutomaBase(EnumAutoma tipo, Integer id, Posizione posizione) {
        super(tipo, id);
        this.posizione = posizione;
    }
    
    @Override
    public Posizione posizione(){
        return posizione;
    }
    
    @Override
    public MicroAutoma prendiMicro(){
        return new MicroAutomaBase(tipo, id);
    }
        
    @Override
    public Posizione copiaPosizione(){
        return new Posizione(posizione.riga, posizione.colonna);
    }
    
    @Override
    public void setPosizione(Posizione corrente){
        this.posizione = corrente;
    }
}
