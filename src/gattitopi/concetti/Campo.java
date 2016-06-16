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
public class Campo {
    private MicroAutoma[][] matrice;
    
    public Campo(int x, int y){ 
        matrice = new MicroAutoma[x][y];
    }
    
    public synchronized void set(int x, int y, MicroAutoma microAutoma){
        matrice[x][y] = microAutoma;
    }
    public synchronized MicroAutoma get(int x, int y){
        return matrice[x][y];
    }
}
