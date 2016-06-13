/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gattitopi.ambiente;

import gattitopi.automi.Automa;
import gattitopi.automi.EnumAutomi;
import gattitopi.automi.FabbricaAutomi;
import gattitopi.automi.Nullo;
import gattitopi.automi.Posizione;
import java.util.Random;

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
        if (riga < 0 || riga > righe - 1 || colonna < 0 || colonna > colonne - 1)
            return new Nullo(new Posizione(riga, colonna));
        return matrice[riga][colonna];
    }
    
    public void posiziona(Automa automa, Posizione posizione){
        matrice[posizione.riga][posizione.colonna] = automa;
    }
    
    public void aggiungiAutomi(EnumAutomi tipo, int qta, Popolazione popolazione){
        
        Random dado = new Random();
        
        while (qta > 0)
            for (int riga = 0; riga < righe() && qta > 0; riga++)
                for (int colonna = 0; colonna < colonne()  && qta > 0; colonna++){
                    if (EnumAutomi.NULLO.equals(prendi(riga, colonna).tipo())){
                        
                        if (dado.nextInt(righe() * colonne()) % 97 == 0){
                            
                            Automa automa = FabbricaAutomi.crea(tipo, riga, colonna, this);
                            
                            posiziona(automa, new Posizione(riga, colonna));
                            popolazione.aggiungiAutoma(automa);
                            
                            qta--;
                        }
                    }
                }
    }
    
    public static Prato pratoVuoto(int maxX, int maxY){
        Prato prato = new Prato(maxX, maxY);
        
        for (int riga = 0; riga < prato.righe(); riga++)
            for (int colonna = 0; colonna < prato.colonne(); colonna++)
                prato.posiziona(new Nullo(new Posizione(riga, colonna)), new Posizione(riga, colonna));
        
        return prato;
    }

    public boolean valido(int riga, int colonna) {
        return riga >= 0 && riga < righe && colonna >= 0 && colonna < colonne;
    }

    public void sposta(Automa daMuovere, Posizione nuova) {
        posiziona(new Nullo(daMuovere.copiaPosizione()), daMuovere.copiaPosizione());
        posiziona(daMuovere, nuova);
        daMuovere.sposta(nuova);
    }
}
