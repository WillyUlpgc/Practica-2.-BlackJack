/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.ulpgc.dis;

/**
 *
 * @author thewi
 */
public class PipCard extends Card {
    private final int value;
    
    public PipCard(int value){
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return this.value;
    }
    
            
    @Override
    public boolean isSpecial(){
        return false;
    }
}
