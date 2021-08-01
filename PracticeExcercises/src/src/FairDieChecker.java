package src;

import java.util.Random;

/**
 * Illustration of using an array as a collection of related 
 * variables.  A 6-element int array is used to define
 * 6 counters for counting the frequency of numbers 0 - 5
 * in rolling a die.  See main() method to run
 */
public class FairDieChecker
{

  public static void main(String[] args)
  {
    check(6000);
  }
  
  /**
   * Run the experiment for the given number of
   * iterations and print the percentages.
   * @param howManyRolls
   */
  public static void check(int howManyRolls)
  {
    // Array of counters to count frequency of each value 1-6
    // (automatically initialized to default value 0)
    int[] counts = new int[6];
    
    Random rand = new Random();
    
    for (int i = 0; i < howManyRolls; i += 1)
    {
      // generates a number 0 through 5 to simulate rolling a die
      int value = rand.nextInt(6);
      
      // the value itself is being used as the index 
      counts[value] += 1;
    }

    // all done, print the values
    for (int index = 0; index < 6; index += 1)
    {
      System.out.println(counts[index]);
     }
  }


}