/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gattitopi.automi;

/**
 *
 * @author gorig
 */
public class Posizione {

    public int riga;
    public int colonna;

    public Posizione(int riga, int colonna) {
        this.riga = riga;
        this.colonna = colonna;
    }
    
    public Posizione copia(){
        return new Posizione(riga, colonna);
    }
    
    @Override
    public String toString(){
        return String.format("x%s:y%s", riga, colonna);
    }
}
