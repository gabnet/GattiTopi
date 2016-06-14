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
public enum EnumAutoma {
    GATTO('@'),
    TOPO('§'),
    NULLO('_');
    
    private char simbolo;
    
    private EnumAutoma(char c){
        this.simbolo = c;
    }
    
    public char simbolo() {
        return simbolo;
    }
}
