/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gattitopi.automi.microautomi;

import gattitopi.automi.EnumAutoma;

/**
 *
 * @author gorig
 */
public class MicroAutomaBase implements MicroAutoma{
    private EnumAutoma tipo;
    private Integer id;
    
    public MicroAutomaBase(EnumAutoma tipo, Integer id) {
        this.tipo = tipo;
        this.id = id;
    }
    
    @Override
    public EnumAutoma tipo(){
        return tipo;
    }
    
    @Override
    public Integer id(){
        return id;
    }
    
    @Override
    public String toString(){
        return String.format("%c|%03d", tipo.simbolo(), id());
    }
}
