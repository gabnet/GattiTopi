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
public class AsyncCampo implements Campo{
    protected MicroAutoma[][] matrice;
    
    public AsyncCampo(int x, int y){ 
        matrice = new MicroAutoma[x][y];
    }
    
    public AsyncCampo(int x, int y, MicroAutoma[][] matrice){
        this.matrice = matrice;
    }
    
    @Override
    public void set(int x, int y, MicroAutoma microAutoma){
        matrice[x][y] = microAutoma;
    }
    
    @Override
    public MicroAutoma get(int x, int y){
        return matrice[x][y];
    }
}
