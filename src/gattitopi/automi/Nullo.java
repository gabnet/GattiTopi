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
public class Nullo extends AutomaBase {

    public Nullo(Posizione posizione) {
        super(EnumAutomi.NULLO, 0, posizione, null, null);
    }

    @Override
    public Posizione muovi() {
        return posizione;
    }
}