/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gattitopi.concetti;

import java.util.HashSet;

/**
 *
 * @author gorig
 */
public class Ids {
    
    private static HashSet<Integer> ids = new HashSet<>();
    private static int contatore = 0;
    
    public static int nuovo(){
        
        Integer nuovo = ++contatore;

        ids.add(nuovo);
        
        return nuovo;
    }
}
