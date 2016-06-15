/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gattitopi.automi;

import gattitopi.concetti.Posizione;

/**
 *
 * @author gorig
 */
public class AutomaNullo extends AutomaBase {

    public AutomaNullo(Posizione posizione) {
        super(EnumAutoma.NULLO, 0, posizione, null, null, null);
    }

    @Override
    public Posizione muovi() {
        return posizione;
    }
}