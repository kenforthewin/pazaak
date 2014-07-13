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
    
    public Player()
    {
        score = 0;
        stood = false;
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
}
