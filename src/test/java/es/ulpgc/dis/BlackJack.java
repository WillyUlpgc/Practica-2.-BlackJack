/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.ulpgc.dis;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author thewi
 */
class BlackJack {
    
    public List<Player> getWinners(Player player1, Player player2, Player player3, Player crupier, ArrayList<Card> deck){
        
        List<Player> list = new ArrayList<Player>();
        
        if(isBlackJack(crupier)) return list;
        
        while(crupier.heapValue() < 17 && !deck.isEmpty()){
            takeCard(crupier, deck);
        }
     
        if(whoWins(player1, crupier).equals(player1)){
            list.add(player1);
        }
        
        if(whoWins(player2, crupier).equals(player2)){
            list.add(player2);
        }
        
        if(whoWins(player3, crupier).equals(player3)){
            list.add(player3);
        }
        return list;
    }
    
    public boolean isBlackJack(Player crupier){
        if(crupier.getBet().size() != 2 ) return false;
        if(crupier.getBet().get(0).isSpecial() == false && crupier.getBet().get(1).isSpecial() == false) return false;
        if(crupier.heapValue() == 21) return true;
        return false;
    }
    
    private Player whoWins(Player player, Player crupier){
        if(isBlackJack(player)) return player;
        if(crupier.heapValue() > 21 && player.heapValue() <= 21)return player;  
        if(player.heapValue() <= 21 && crupier.heapValue() <= 21 && player.heapValue() > crupier.heapValue()) return player;
        return crupier;
    }
    
    private void takeCard(Player crupier, List<Card> deck){
        Card card = deck.remove(0);
        crupier.getBet().add(card);
    }
}
