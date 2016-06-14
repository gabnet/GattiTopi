/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gattitopi.automi.pezzi;

import gattitopi.concetti.Direzione;
import gattitopi.concetti.Posizione;
import java.util.ArrayList;

/**
 *
 * @author gorig
 */
public abstract class Zampe extends Pezzo {
    public abstract Posizione zitzit(Posizione posizione, Direzione direzione);
    public abstract ArrayList<Direzione> muriCose(Posizione posizione);
}
