/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gattitopi.concetti;

import gattitopi.automi.microautomi.MicroAutoma;

/**
 *
 * @author gorig
 */
public class Intorno extends Prato{
    
    public Intorno(int maxX, int maxY, MicroAutoma[][] matrice) {
        super(maxX, maxY);
        this.matrice = matrice;
    }
}
