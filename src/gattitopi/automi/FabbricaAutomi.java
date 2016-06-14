/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gattitopi.automi;

import gattitopi.automi.microautomi.MicroAutomaNullo;
import gattitopi.automi.microautomi.MicroAutoma;
import gattitopi.concetti.Posizione;

/**
 *
 * @author gorig
 */
public class FabbricaAutomi {
    
    public static Automi creaAutomi(EnumAutoma tipo, int qta){
        Automi automi = new Automi();
        
        for (int i = 0; i < qta; i++)
            automi.add(FabbricaAutomi.crea(tipo));
        
        return automi;
    }
    
    public static Automa crea(EnumAutoma tipo){
        
        switch (tipo){
            case TOPO:
                return new AutomaTopo(new Posizione(-1, -1));
            case GATTO:
                return new AutomaGatto(new Posizione(-1, -1));
            default:
                return new AutomaNullo(new Posizione(-1, -1));
        }
    }
    
    public static MicroAutoma prendiMicroNull() {
        return new MicroAutomaNullo();
    }

}
