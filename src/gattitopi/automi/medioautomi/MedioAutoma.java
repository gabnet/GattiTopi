/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gattitopi.automi.medioautomi;

import gattitopi.automi.microautomi.MicroAutoma;
import gattitopi.concetti.Posizione;

/**
 *
 * @author gorig
 */
public interface MedioAutoma extends MicroAutoma {
    
    public Posizione posizione();
    public MicroAutoma prendiMicro();
    public Posizione copiaPosizione();
    public void setPosizione(Posizione corrente);
}
