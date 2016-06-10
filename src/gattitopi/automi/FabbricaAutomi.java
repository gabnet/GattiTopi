/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gattitopi.automi;

import gattitopi.ambiente.Prato;
import gattitopi.automi.pezzi.Naso;
import gattitopi.automi.pezzi.Zampe;

/**
 *
 * @author gorig
 */
public class FabbricaAutomi {
    
    public static Automa crea(EnumAutomi tipo, int x, int y, Prato prato){
        
        switch (tipo){
            case TOPO:
                return new Topo(new Posizione(x, y), new Naso(prato), new Zampe(prato));
            case GATTO:
                return new Gatto(new Posizione(x, y), new Naso(prato), new Zampe(prato));
            default:
                return new Nullo(new Posizione(x, y));
        }
    }
}
