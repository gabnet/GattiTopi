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
    
    private final Naso naso;
    private final Zampe zampe;

    public AutomaBase(EnumAutomi tipo, Posizione posizione, Naso naso, Zampe zampe) {
        this.tipo = tipo;
        this.posizione = posizione;
        id = Ids.nuovo();
        this.naso = naso;
        this.zampe = zampe;
    }

    public EnumAutomi tipo(){
        return tipo;
    }

    public Integer id() {
        return id;
    }
    
    public char simbolo(){
        return tipo.simbolo();
    }
}
