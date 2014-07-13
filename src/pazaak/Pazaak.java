/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pazaak;

import java.util.Scanner;

/**
 *
 * @author Kenny
 */
public class Pazaak {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerone = new Player();
        Player playertwo = new Player();
        boolean gameOver = false;
        Scanner reader = new Scanner(System.in);
        
        while(!gameOver)
        {
            int choice;
            int cardchoice;
            playerone.EndTurn();
            System.out.println("Current score: " + playerone.getScore());
            System.out.println();
            playerone.PrintDeck();
            System.out.println();
            System.out.printf("Enter card number or 0: ");
            cardchoice = reader.nextInt();
            playerone.PlayCard(cardchoice);
            System.out.println("Current score: " + playerone.getScore());
            System.out.println();
            System.out.printf("Enter 1 to end turn, 2 to stand: ");
            choice = reader.nextInt();
            
            switch(choice)
            {
                case 1:
                    if(playerone.getScore() >= 20)
                        gameOver = true;
                    playerone.EndTurn();
                    break;
                case 2: playerone.Stand();
                    gameOver = true;
                    break;
                default: System.out.println("Incorrect choice!");
                    break;
            }
            
            
            
        }
        
        
        
        System.out.println("Final score: " + playerone.getScore());
    }
    

}
