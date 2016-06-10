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
public interface Automa {
    public Posizione muovi();
    public EnumAutomi tipo();
    public char simbolo();
    public Integer id();
}
