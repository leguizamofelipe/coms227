package src;
/**
 * Program that prints the coins needed to make a given amount
 * of change.  Illustrates the use of variables
 * and integer arithmetic.
 */
public class Change
{
  
  /**
   * Entry point.
   */
  public static void main(String[] args)
  {
    // Variables declared within a method are called "local" variables

    // Hard-code the amount of change here, could also use a Scanner for input...
    int amount = 148;

    // Use integer division to get the quotient and remainder...
    int quarters = amount / 25;
    amount = amount % 25;
    int dimes = amount / 10;
    amount = amount % 10;
    int nickels = amount / 5;
    int pennies = amount % 5;

    // Print everything out
    System.out.println("Quarters:" + quarters);
    System.out.println("Dimes:" + dimes);
    System.out.println("Nickels:" + nickels);
    System.out.println("Pennies:" + pennies);

  }
}
