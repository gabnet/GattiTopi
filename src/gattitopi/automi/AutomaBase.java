/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gattitopi.automi;

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

    public EnumAutomi tipo(){
        return tipo;
    }

    public Integer id() {
        return id;
    }
    
    @Override
    public char simbolo(){
        return tipo.simbolo();
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
    
    @Override
    public String toString(){
        return String.format("%c|%03d", simbolo(), id());
    }
}
