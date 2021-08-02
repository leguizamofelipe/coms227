package src;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Quick demo of ArrayList and wrapper classes and autoboxing.
 */
public class ArrayListExample
{

  /**
   * @param args
   */
  public static void main(String[] args)
  {
    
    // Create an ArrayList<String> and initialize it
    ArrayList<String> aList = new ArrayList<>();
    aList.add("Dewey");
    aList.add("Cheatum");
    aList.add("Howe");
    aList.add(1, "X");

    System.out.println(aList);
    
    ArrayList<Integer> myInts = new ArrayList<>();
    myInts.add(6);
    myInts.add(75);
    myInts.add(43);
    
    System.out.println(myInts);
    /*
    System.out.println("ArrayList length before initialization " + aList.size());
    aList.add("Dewey");
    aList.add("Cheatum");
    aList.add("Howe");
    System.out.println("ArrayList length after initialization " + aList.size());
    
    for (int i = 0; i < aList.size(); i += 1)
    {
      System.out.println(aList.get(i));
    }
    System.out.println();
    
    System.out.println("Iterate using foreach loop");
    for (String name : aList)
    {
      System.out.println(name);
    }
    System.out.println();
    
    System.out.println("Insert X at index 1");
    aList.add(1, "X");
    System.out.println(aList);  // print using built-in toString method
    System.out.println();
    System.out.println("Remove element at index 0");
    aList.remove(0);
    System.out.println(aList);  // print using built-in toString method
    System.out.println();
    System.out.println("Find and remove the string \"Cheatum\"");
    aList.remove("Cheatum");
    System.out.println(aList);  // print using built-in toString method
    System.out.println();
    
    // Using a wrapper class, since we can't create ArrayList of int
    ArrayList<Integer> myInts = new ArrayList<>();
    myInts.add(17);                // automatically boxed
    myInts.add(42);                // automatically boxed
    //myInts.add(new Integer(137));  // explicitly boxed (redundant)
    myInts.add(Integer.valueOf(137));
    System.out.println(myInts);
    
    Integer bigI = myInts.get(0);  // value in ArrayList is an Integer
    int value0 = bigI.intValue(); // explicitly unboxed by calling intValue
    int value1 = myInts.get(1);    // automatically unboxed
    int result = bigI + value1;   // here bigI is automatically unboxed 
                                  // in order to do arithmetic
    System.out.println(result);
    
    
    // Here is a "gotcha" with ArrayList<Integer>.  There are two remove() methods, one that
    // takes an index, and one that takes an object to be removed.  To remove a particular
    // value from an ArrayList<Integer>, you have to explicitly convert to Integer.  
    // Otherwise, it will invoke the other remove() method and attempt to remove
    // a (nonexistent) element at index 42.
    //myInts.remove(42);
    //myInts.remove(new Integer(42));
    myInts.remove(Integer.valueOf(42));
    System.out.println(myInts);
	*/

  }
  


}