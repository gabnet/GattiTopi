/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gattitopi.automi;

import gattitopi.automi.medioautomi.MedioAutoma;
import gattitopi.concetti.Posizione;
import gattitopi.concetti.Prato;

/**
 *
 * @author gorig
 */
public interface Automa extends MedioAutoma {
    public Posizione muovi();
    public void setPrato(Prato aThis);
}
