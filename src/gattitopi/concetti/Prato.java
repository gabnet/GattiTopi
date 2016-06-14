/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gattitopi.concetti;

import gattitopi.automi.Automa;
import gattitopi.automi.EnumAutoma;
import gattitopi.automi.FabbricaAutomi;
import gattitopi.automi.microautomi.MicroAutoma;
import java.util.Random;

/**
 *
 * @author gorig
 */
public class Prato {
    
    private final MicroAutoma[][] matrice;
    private final int righe;
    private final int colonne;
    
    public Prato(int maxX, int maxY) {
        matrice = new MicroAutoma[maxY][maxY];
        righe = maxX;
        colonne = maxY;
    }
    
    public int righe(){
        return righe;
    }
    
    public int colonne(){
        return colonne;
    }
    
    public MicroAutoma prendi(int riga, int colonna){
        if (riga < 0 || riga > righe - 1 || colonna < 0 || colonna > colonne - 1)
            return FabbricaAutomi.prendiMicroNull();
        return matrice[riga][colonna];
    }
    
    public void posiziona(MicroAutoma microAutoma, Posizione posizione){
        matrice[posizione.riga][posizione.colonna] = microAutoma;
    }
    
    public void aggiungiAutomi(Popolazione popolazione){
        
        Random dado = new Random();
        int numeroAutomi = popolazione.quantiAutomi();
        
        while (numeroAutomi > 0)
            for (int riga = 0; riga < righe() && numeroAutomi > 0; riga++)
                for (int colonna = 0; colonna < colonne()  && numeroAutomi > 0; colonna++){
                    if (EnumAutoma.NULLO.equals(prendi(riga, colonna).tipo())){
                        
                        if (dado.nextInt(righe() * colonne()) % 97 == 0){
                            
                            Automa automa = popolazione.prendiAutoma(numeroAutomi - 1);
                            automa.setPosizione(new Posizione(riga, colonna));
                            automa.setPrato(this);
                            posiziona(automa.prendiMicro(), automa.copiaPosizione());
                            
                            numeroAutomi--;
                        }
                    }
                }
    }
    
    public static Prato pratoVuoto(int maxX, int maxY){
        Prato prato = new Prato(maxX, maxY);
        
        for (int riga = 0; riga < prato.righe(); riga++)
            for (int colonna = 0; colonna < prato.colonne(); colonna++)
                prato.posiziona(FabbricaAutomi.prendiMicroNull(), new Posizione(riga, colonna));
        
        return prato;
    }
    
    public boolean valido(int riga, int colonna) {
        return riga >= 0 && riga < righe && colonna >= 0 && colonna < colonne;
    }

    public void sposta(MicroAutoma daMuovere, Posizione vecchia, Posizione nuova) {
        posiziona(FabbricaAutomi.prendiMicroNull(), vecchia);
        posiziona(daMuovere, nuova);
    }
}
