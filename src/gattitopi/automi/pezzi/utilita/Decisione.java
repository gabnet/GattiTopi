/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gattitopi.automi.pezzi.utilita;

import gattitopi.automi.pezzi.Direzione;

/**
 *
 * @author gorig
 */
public class Decisione {
    public Direzione direzione;
    public Integer peso;
    
    public Decisione(Direzione direzione, Integer peso){
        this.direzione = direzione;
        this.peso = peso;
    }
}
