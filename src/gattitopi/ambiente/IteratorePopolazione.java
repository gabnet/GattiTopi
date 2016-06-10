/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gattitopi.ambiente;

import gattitopi.automi.Automa;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author gorig
 */
public class IteratorePopolazione implements Iterator<Automa> {

    private final ArrayList<Automa> iteratore = new ArrayList<>();
    private int indice = 0;
    
    
    public IteratorePopolazione(Topi topi, Gatti gatti){
        iteratore.addAll(topi);
        iteratore.addAll(gatti);
    }
    
    @Override
    public boolean hasNext() {
        return indice < iteratore.size();
    }

    @Override
    public Automa next() {
        Automa automa = iteratore.get(indice);
        indice++;

        return automa;
    }
}
