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
public interface Campo {
    
    public void set(int x, int y, MicroAutoma microAutoma);
    public MicroAutoma get(int x, int y);
}
