/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pazaak;

import java.util.Random;

/**
 *
 * @author Kenny
 */
public class Player {
    private int score;
    private boolean stood;
    private int[] deck;
    
    public Player()
    {
        score = 0;
        stood = false;
        deck = new int[4];
        NewDeck();
    }
    
    private void NewDeck()
    {
        Random randomGenerator = new Random();
        for(int i = 0; i < 4; i++)
        {
            int rn = randomGenerator.nextInt(6) + 1;
            int sign = randomGenerator.nextInt(2);
            
            if(sign == 0)
                deck[i] = rn * -1;
            else
                deck[i] = rn;
        }
    }
    
    public void EndTurn()
    {
        Random randomGenerator = new Random();
        
        int rn = randomGenerator.nextInt(10) + 1;
        
        if(getScore() < 20)
            score += rn;
    }
    
    public void Stand()
    {
        stood = true;
    }

    /**
     * @return the score
     */
    public int getScore() {
        return score;
    }

    /**
     * @return the stood
     */
    public boolean isStood() {
        return stood;
    }
    
    public void PlayCard(int card)
    {
        switch(card)
        {
            case 1: score = score + deck[0];
                deck[0] = 0;
                break;
            case 2: score = score + deck[1];
                deck[1] = 0;
                break;
            case 3: score = score + deck[2];
                deck[2] = 0;
                break;
            case 4: score = score + deck[3];
                deck[3] = 0;
                break;
            default:
                break;
  
        }
    }
    
    public void PrintDeck()
    {
        System.out.printf("Card 1\tCard 2\tCard 3\tCard 4\n");
        for(int i = 0; i < 4; i++)
        {
            System.out.printf("%4d", deck[i]);
            System.out.printf("    ");
        }   
        System.out.println();
    }
}
