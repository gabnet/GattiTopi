/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gattitopi.ambiente;

import gattitopi.automi.Automa;
import gattitopi.automi.Gatto;
import gattitopi.automi.Topo;

/**
 *
 * @author gorig
 */
public class Popolazione implements Iterable<Automa> {
    
    private final Topi topi;
    private final Gatti gatti;
    
    public Popolazione(){
        topi = new Topi();
        gatti = new Gatti();
    }
    
    private void aggiungiGatto(Gatto gatto){
        gatti.add(gatto);
    }
    
    private void aggiungiTopo(Topo topo){
        topi.add(topo);
    }
    
    public Gatti gatti(){
        return gatti;
    }
    
    public Topi topi(){
        return topi;
    }
    
    public void aggiungiAutoma(Automa automa) {
        switch (automa.tipo()){
            case TOPO:
                aggiungiTopo((Topo) automa);
                break;
            case GATTO:
                aggiungiGatto((Gatto) automa);
                break;
        }
    }

    @Override
    public IteratorePopolazione iterator() {
        return new IteratorePopolazione(topi, gatti);
    }
}
