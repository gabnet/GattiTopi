/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gattitopi.automi;

import gattitopi.concetti.Posizione;

/**
 *
 * @author gorig
 */
public class FabbricaAutomi {
    
    public static Automi creaAutomi(EnumAutomi tipo, int qta){
        Automi automi = new Automi();
        
        for (int i = 0; i < qta; i++)
            automi.add(FabbricaAutomi.crea(tipo));
        
        return automi;
    }
        
            /*
            for (int riga = 0; riga < righe() && qta > 0; riga++)
                for (int colonna = 0; colonna < colonne()  && qta > 0; colonna++){
                    if (EnumAutomi.NULLO.equals(prendi(riga, colonna).tipo())){
                        
                        if (dado.nextInt(righe() * colonne()) % 97 == 0){
                            
                            Automa automa = FabbricaAutomi.crea(tipo, riga, colonna, this);
                            
                            automi.add(automa);
                            
                            posiziona(automa, new Posizione(riga, colonna));
                            popolazione.aggiungiAutoma(automa);
                            
                            qta--;
                        }
                    }
                }
    }*/
    
    public static Automa crea(EnumAutomi tipo){
        
        switch (tipo){
            case TOPO:
                return new Topo(new Posizione(-1, -1));
            case GATTO:
                return new Gatto(new Posizione(-1, -1));
            default:
                return new Nullo(new Posizione(-1, -1));
        }
    }
    
    public static MicroAutoma prendiMicroNull() {
        return new MicroAutoma(EnumAutomi.NULLO, 0);
    }

}
