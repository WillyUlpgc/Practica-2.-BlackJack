/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.ulpgc.dis;

/**
 *
 * @author thewi
 */
public class Ace extends Card {

    @Override
    public int getValue() {
        return 11;
    }
    
    public int getSecondValue(){
        return 1;
    }
    
    @Override
    public boolean isSpecial(){
        return true;
    }
}
