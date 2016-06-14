/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gattitopi.concetti;

import gattitopi.automi.Automa;
import gattitopi.automi.Automi;
import gattitopi.automi.EnumAutomi;
import java.util.Iterator;

/**
 *
 * @author gorig
 */
public class Popolazione implements Iterable<Automa> {
    
    private Automi automi;
    
    public Popolazione(){
        automi = new Automi();
    }
    
    public void aggiungiAutoma(Automa automa) {
        automi.add(automa);
    }

    @Override
    public Iterator<Automa> iterator() {
        return automi.iterator();
    }

    public void aggiungiAutomi(Automi automi) {
        this.automi.addAll(automi);
    }

    public int quantiAutomi() {
        return automi.size();
    }
    
    public int quantiTopi() {
        return (int) automi.stream().filter(a -> EnumAutomi.TOPO.equals(a.tipo())).count();
    }
    
    public int quantiGatti() {
        return (int) automi.stream().filter(a -> EnumAutomi.GATTO.equals(a.tipo())).count();
    }

    public Automa prendiAutoma(int indice) {
        return automi.get(indice);
    }
}
