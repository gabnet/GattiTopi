/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gattitopi.concetti;

import gattitopi.automi.EnumAutoma;
import gattitopi.automi.medioautomi.MedioAutoma;
import gattitopi.automi.medioautomi.MedioAutomaBase;
import java.util.ArrayList;

/**
 *
 * @author gorig
 */
public class Intorno extends Prato{
    
    private final Posizione centro;
    
    public Intorno(int maxX, int maxY, Campo campo, Posizione centro) {
        super(maxX, maxY);
        this.campo = campo;
        this.centro = centro;
    }

    public ArrayList<MedioAutoma> cerca(EnumAutoma enumAutoma) {
        ArrayList<MedioAutoma> gatti = new ArrayList<>();
        
        for (int x = 0; x < righe; x++)
            for (int y = 0; y < colonne; y++)
                if (enumAutoma.equals(campo.get(x, y).tipo()))
                    gatti.add(new MedioAutomaBase(campo.get(x, y), new Posizione(x, y)));
        
        return gatti;
    }
}
