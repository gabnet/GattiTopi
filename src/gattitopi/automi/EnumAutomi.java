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
public enum EnumAutomi {
    GATTO('G'),
    TOPO('T'),
    NULLO('O');
    
    private char simbolo;
    
    private EnumAutomi(char c){
        this.simbolo = c;
    }
    
    public char simbolo() {
        return simbolo;
    }
}
