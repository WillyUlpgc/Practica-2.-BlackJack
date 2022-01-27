package es.ulpgc.dis;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.junit.jupiter.api.Test;


public class BlackJackTest {
    
    
    @Test
    public void return_Player1_with_CASE_1(){
        
        List<Card> betPlayer1 = new ArrayList<Card>();
        betPlayer1.add(new CardValueTen());
        betPlayer1.add(new Ace());
        
        List<Card> betPlayer2 = new ArrayList<Card>();
        betPlayer2.add(new PipCard(10));
        betPlayer2.add(new PipCard(5));
        betPlayer2.add(new PipCard(6));
        
        List<Card> betPlayer3 = new ArrayList<Card>();
        betPlayer3.add(new PipCard(3));
        betPlayer3.add(new PipCard(6));
        betPlayer3.add(new Ace());
        betPlayer3.add(new PipCard(3));
        betPlayer3.add(new Ace());
        betPlayer3.add(new CardValueTen());
        
        List<Card> betCrupier = new ArrayList<Card>();
        betCrupier.add(new PipCard(9));
        betCrupier.add(new PipCard(7));
        
        Player player1 = new Player(betPlayer1);
        Player player2 = new Player(betPlayer2);
        Player player3 = new Player(betPlayer3);
        Player crupier = new Player(betCrupier);
        
        List<Player> listTestPlayer = new ArrayList<Player>();
        listTestPlayer.add(player1);
        
        ArrayList<Card> deck = new ArrayList<Card>();
        deck.add(new PipCard(5));
        deck.add(new PipCard(4));
        deck.add(new CardValueTen());
        deck.add(new PipCard(2));
        
        List<Player> listWinners;
        BlackJack blackjack = new BlackJack();
        
        listWinners = blackjack.getWinners(player1, player2, player3, crupier, deck);
               
        assert(listWinners.equals(listTestPlayer));
    }
    
    @Test
    public void return_Player1_and_Player3_with_CASE_2(){
        List<Card> betPlayer1 = new ArrayList<Card>();
        betPlayer1.add(new CardValueTen());
        betPlayer1.add(new PipCard(10));
        
        List<Card> betPlayer2 = new ArrayList<Card>();
        betPlayer2.add(new PipCard(10));
        betPlayer2.add(new PipCard(2));
        betPlayer2.add(new PipCard(6));
        
        List<Card> betPlayer3 = new ArrayList<Card>();
        betPlayer3.add(new PipCard(8));
        betPlayer3.add(new PipCard(8));
        betPlayer3.add(new PipCard(5));
        
        List<Card> betCrupier = new ArrayList<Card>();
        betCrupier.add(new PipCard(5));
        betCrupier.add(new PipCard(10));
        
        Player player1 = new Player(betPlayer1);
        Player player2 = new Player(betPlayer2);
        Player player3 = new Player(betPlayer3);
        Player crupier = new Player(betCrupier);
        
        List<Player> listTestPlayer = new ArrayList<Player>();
        listTestPlayer.add(player1);
        listTestPlayer.add(player3);
        
        ArrayList<Card> deck = new ArrayList<Card>();
        deck.add(new Ace());
        deck.add(new PipCard(3));
        deck.add(new CardValueTen());
        deck.add(new PipCard(2));
        
        List<Player> listWinners;
        BlackJack blackjack = new BlackJack();
        
        listWinners = blackjack.getWinners(player1, player2, player3, crupier, deck);
               
        
    }
    
    @Test
    public void return_empty_list_with_CASE_3(){
        List<Card> betPlayer1 = new ArrayList<Card>();
        betPlayer1.add(new CardValueTen());
        betPlayer1.add(new PipCard(10));
        betPlayer1.add(new PipCard(10));
        
        List<Card> betPlayer2 = new ArrayList<Card>();
        betPlayer2.add(new PipCard(10));
        betPlayer2.add(new PipCard(2));
        betPlayer2.add(new PipCard(6));
        betPlayer2.add(new PipCard(10));
        
        List<Card> betPlayer3 = new ArrayList<Card>();
        betPlayer3.add(new PipCard(8));
        betPlayer3.add(new PipCard(8));
        betPlayer3.add(new PipCard(5));
        betPlayer3.add(new PipCard(10));
        
        List<Card> betCrupier = new ArrayList<Card>();
        betCrupier.add(new PipCard(5));
        betCrupier.add(new PipCard(10));
        
        Player player1 = new Player(betPlayer1);
        Player player2 = new Player(betPlayer2);
        Player player3 = new Player(betPlayer3);
        Player crupier = new Player(betCrupier);
        
        List<Player> listTestPlayer = new ArrayList<Player>();
        
        ArrayList<Card> deck = new ArrayList<Card>();
        deck.add(new Ace());
        deck.add(new PipCard(3));
        deck.add(new CardValueTen());
        deck.add(new PipCard(2));
        
        List<Player> listWinners = new ArrayList<Player>();
        BlackJack blackjack = new BlackJack();

        listWinners = blackjack.getWinners(player1, player2, player3, crupier, deck);
        
        assert(listWinners.equals(listTestPlayer));
       
    }
    
    @Test
    public void CASE_4(){
        List<Card> betPlayer1 = new ArrayList<Card>();
        betPlayer1.add(new PipCard(9));
        betPlayer1.add(new Ace());
        betPlayer1.add(new PipCard(1));
        
        List<Card> betPlayer2 = new ArrayList<Card>();
        betPlayer1.add(new Ace());
        betPlayer1.add(new PipCard(10));
        
        List<Card> betPlayer3 = new ArrayList<Card>();
        betPlayer1.add(new Ace());
        betPlayer1.add(new CardValueTen());
        
        List<Card> betCrupier = new ArrayList<Card>();
        betCrupier.add(new Ace());
        betCrupier.add(new PipCard(10));
        
        Player player1 = new Player(betPlayer1);
        Player player2 = new Player(betPlayer2);
        Player player3 = new Player(betPlayer3);
        Player crupier = new Player(betCrupier);
        
        List<Player> listTestPlayer = new ArrayList<Player>();
        
        ArrayList<Card> deck = new ArrayList<Card>();
        deck.add(new Ace());
        deck.add(new PipCard(3));
        deck.add(new CardValueTen());
        deck.add(new PipCard(2));
        
        List<Player> listWinners = new ArrayList<Player>();
        BlackJack blackjack = new BlackJack();

        listWinners = blackjack.getWinners(player1, player2, player3, crupier, deck);
        
        assert(listWinners.equals(listTestPlayer));
    }

}
