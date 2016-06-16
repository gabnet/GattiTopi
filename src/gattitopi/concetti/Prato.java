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
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author gorig
 */
public class Prato {
    
    protected Campo campo;
    protected final int righe;
    protected final int colonne;
    
    public Prato(int maxX, int maxY) {
        campo = new SyncCampo(maxX, maxY);
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
            return null;
        return campo.get(riga, colonna);
    }
    
    public void posiziona(MicroAutoma microAutoma, Posizione posizione){
        campo.set(posizione.riga, posizione.colonna, microAutoma);
    }
    
    public void aggiungiAutomi(Popolazione popolazione){
        
        int numeroAutomi = popolazione.quantiAutomi();
        
        while (numeroAutomi > 0)
            for (int riga = 0; riga < righe() && numeroAutomi > 0; riga++)
                for (int colonna = 0; colonna < colonne()  && numeroAutomi > 0; colonna++){
                    if (EnumAutoma.NULLO.equals(prendi(riga, colonna).tipo())){
                        
                         if (ThreadLocalRandom.current().nextInt(righe() * colonne()) % 97 == 0){

                            
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
                prato.posiziona(FabbricaAutomi.prendiMicroNullo(), new Posizione(riga, colonna));
        
        return prato;
    }
    
    public boolean valido(int riga, int colonna) {
        return riga >= 0 && riga < righe && colonna >= 0 && colonna < colonne;
    }

    public void sposta(MicroAutoma daMuovere, Posizione vecchia, Posizione nuova) {
        posiziona(FabbricaAutomi.prendiMicroNullo(), vecchia);
        posiziona(daMuovere, nuova);
    }
    
    public Intorno creaIntorno(Posizione centro, int raggio){
        int limiteSopra = centro.riga - raggio - 1 < 0 ? 0 : centro.riga - raggio - 1;
        int limiteSotto = centro.riga + raggio > righe() - 1 ? righe() - 1 : centro.riga + raggio;
        
        int limiteSinistro = centro.colonna - raggio - 1 < 0 ? 0 : centro.colonna - raggio - 1;
        int limiteDestro = centro.colonna + raggio > colonne() - 1 ? colonne() - 1 : centro.colonna + raggio;
        
        int numeroColonne = limiteDestro - limiteSinistro + 1;
        int numeroRighe = limiteSotto - limiteSopra + 1;
        
        Campo nuovoAsyncCampo = new AsyncCampo(numeroRighe, numeroColonne);
        
        for (int riga = 0; riga < numeroRighe; riga++ )
            for (int colonna = 0; colonna < numeroColonne; colonna++)
                nuovoAsyncCampo.set(riga, colonna, prendi(riga + limiteSopra, colonna + limiteSinistro));
        
        return new Intorno(numeroRighe, numeroColonne, nuovoAsyncCampo, centro);
    }
}
