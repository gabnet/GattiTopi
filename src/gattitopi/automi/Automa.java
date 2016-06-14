/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gattitopi.automi;

import gattitopi.automi.microautomi.MicroAutoma;
import gattitopi.concetti.Posizione;
import gattitopi.concetti.Prato;

/**
 *
 * @author gorig
 */
public interface Automa {
    public Posizione muovi();
    public EnumAutoma tipo();
    public Posizione copiaPosizione();
    public void setPosizione(Posizione corrente);
    public void setPrato(Prato aThis);
    public MicroAutoma prendiMicro();
}
