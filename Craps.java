
/**
 * This will run the main part of the Craps program and will go through every part of the game.
 *
 * @author Jonah Goldstein
 * @version 03-02-2021
 */
import java.util.Scanner;
public class Craps
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Craps
     */
    

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void main(String[] args)
    {
        // initialize variables
        Scanner in = new Scanner(System.in);
        String pause;
        String playGame;
        // ask if you want to play
        System.out.print("Would you instructions on how to play Craps (Y/n)?");
        playGame = in.nextLine();
        // more initialized variables
        int roll1 = 0;
        int roll2 = 0;
        int wins = 0;
        int loss = 0;
        Die die;
        // Instructions on how to play if they said yes
        if (playGame.equals("") ||
        playGame.substring(0,1).equalsIgnoreCase("y"))
        {
            System.out.println("1. Roll two six-sided dice.\n2. a. On first roll, if you get a 7 or 11 you win!\n2. b. On first roll, if you get a 2, 3, or 12 you lose!\n2. c. Any other number you don't win or lose. The die roll becomes your 'point.'\n3. Keep rolling the dice again until:\n4. a. You roll the point again and win!\n4. b. or you roll a 7 and lose.");
        }
        // do-while loop to keep asking if you want to play
        do{
            
            System.out.print("Would you like to play Craps (Y/n)?");
            playGame = in.nextLine();
            // if yes
            if (playGame.substring(0,1).equalsIgnoreCase("y"))
            {
                //rolling dice
                System.out.print("Press <Enter> to roll...");
                pause = in.nextLine();
                die = new Die();
                roll1 = die.getNum();
                System.out.println("You rolled a " + roll1);
                // if win
                if (roll1 == 7 || roll1 == 11){
                    System.out.println("You win!");
                    wins++;
                }
                // if lose
                else if(roll1 == 2 || roll1 == 3 || roll1 == 12){
                    System.out.println("You lose, better luck next time!");
                    loss++;
                }
                // if neither
                else{
                    System.out.println("You didn't win or lose. Now, to stage 2 of Craps!");
                    
                    // loop for part 2
                    do{
                        //rolling
                        System.out.print("Press <Enter> to roll...");
                        pause = in.nextLine();
                        roll2 = die.getNum();
                        System.out.println("You rolled a " + roll2);
                        // if win
                        if(roll2 == roll1){
                            System.out.println("You win!");
                            wins++;
                            break;
                        }
                        // if lose
                        else if(roll2 == 7){
                            System.out.println("Oof, you lose. Better luck next time!");
                            loss++;
                            break;
                        }
                        // if neither
                        else{
                            System.out.println("You didn't win or lose, try again!");
                        }
                    }while(roll1 == roll1);// just a place holder while until the breaks are activated.
                }
            // if no
            }
            else{System.out.println("Goodbye");
                break;
            }
        }while(playGame != " "); // just a place holder while until the breaks are activated.
        System.out.println("You had " + wins + " wins and " + loss + " losses.");
    }
}


/* 

COMMENTS FROM THE INSTRUCTOR:

This is a really nice version of the program, Jonah, and as a bonus, you're
keeping track their wins and losses--well done! At least one of your default
Y/n options doesn't work as it should. Otherwise, outstanding!

SCORE: 16/15

*/

