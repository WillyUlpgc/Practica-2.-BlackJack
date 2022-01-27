/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.ulpgc.dis;

import java.util.List;

/**
 *
 * @author thewi
 */
class Player {
    private final List<Card> bet;
    
    public Player(List<Card> bet){
        this.bet = bet;
    }
    
    public List<Card> getBet(){
        return this.bet;
    }
    
    public boolean isBlackJack(){
        if(this.bet.size() <= 2){
            if(this.bet.get(0).getClass().getSimpleName() == "Ace"){
                if(this.bet.get(1).getClass().getSimpleName() == "CardValueTen"){
                    return true;
                }
                else if (this.bet.get(0).getClass().getSimpleName() == "CardValueTen"){
                    if(this.bet.get(1).getClass().getSimpleName() == "Ace"){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public int heapValue(){
        int total = 0;
        int amountOfAces = 0;
        for(Card card : bet){
            total += card.getValue();
            if(card.getValue() == 11) amountOfAces++;
            if(total > 21 && amountOfAces > 0){
                total -= 10; amountOfAces--;
            }
        }
        return total;
    }
}
