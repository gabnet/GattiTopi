/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gattitopi.automi;

import gattitopi.ambiente.Prato;
import gattitopi.automi.pezzi.NasoGatto;
import gattitopi.automi.pezzi.NasoTopo;
import gattitopi.automi.pezzi.ZampeGatto;
import gattitopi.automi.pezzi.ZampeTopo;

/**
 *
 * @author gorig
 */
public class FabbricaAutomi {
    
    public static Automa crea(EnumAutomi tipo, int x, int y, Prato prato){
        
        switch (tipo){
            case TOPO:
                return new Topo(new Posizione(x, y), new NasoTopo(prato), new ZampeTopo(prato));
            case GATTO:
                return new Gatto(new Posizione(x, y), new NasoGatto(prato), new ZampeGatto(prato));
            default:
                return new Nullo(new Posizione(x, y));
        }
    }
}
