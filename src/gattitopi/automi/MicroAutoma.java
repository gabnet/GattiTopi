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
public class MicroAutoma {
    private EnumAutomi tipo;
    private Integer id;
    
    public MicroAutoma(EnumAutomi tipo, Integer id) {
        this.tipo = tipo;
        this.id = id;
    }
    
    public EnumAutomi tipo(){
        return tipo;
    }
    
    public Integer id(){
        return id;
    }
    
    @Override
    public String toString(){
        return String.format("%c|%03d", tipo.simbolo(), id());
    }
}
