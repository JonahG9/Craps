
/**
 * This program will roll a pair of dice and be able to return the sum of the two.
 *
 * @author Jonah Goldstein
 * @version 03-02-2021
 */
public class Die
{
    // instance variables
    private static int rand;
    private static int rand2;
    /**
     * Constructor for objects of class Die
     */
    public Die()
    {
        // nothing to be constructed
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    private static void roll()
    {
        rand = (int)(((Math.random())*6)+1); // dice roll #1
        rand2 = (int)(((Math.random())*6)+1);// dice roll #2
    }
    public static int getNum(){
        roll(); // calls the roll for ease of use in Craps.java
        int sum = rand + rand2; // add the two together
        return sum; // return the sum
    }
}
