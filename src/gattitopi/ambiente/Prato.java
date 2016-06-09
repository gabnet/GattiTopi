/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gattitopi.ambiente;

import gattitopi.automi.Automa;
import gattitopi.automi.Nullo;
import gattitopi.automi.Posizione;

/**
 *
 * @author gorig
 */
public class Prato {
    
    private final Automa[][] matrice;
    private final int righe;
    private final int colonne;
    
    public Prato(int maxX, int maxY) {
        matrice = new Automa[maxY][maxY];
        righe = maxX;
        colonne = maxY;
    }
    
    public int righe(){
        return righe;
    }
    
    public int colonne(){
        return colonne;
    }
    
    public Automa prendi(int riga, int colonna){
        return matrice[riga][colonna];
    }
    
    public void posiziona(Automa automa, int riga, int colonna){
        matrice[riga][colonna] = automa;
    }
    
    public static Prato pratoVuoto(int maxX, int maxY){
        Prato prato = new Prato(maxX, maxY);
        
        for (int riga = 0; riga < prato.righe(); riga++)
            for (int colonna = 0; colonna < prato.colonne(); colonna++)
                prato.posiziona(new Nullo(new Posizione(riga, colonna)), riga, colonna);
        
        return prato;
    }
}
