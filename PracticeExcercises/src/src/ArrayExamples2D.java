package src;
import java.util.Arrays;

/**
 * A few simple 2D array examples.
 */
public class ArrayExamples2D
{
  public static void main(String[] args)
  {
    // Creates a grid with 3 rows and 4 columns
    // Initially all values are zeros
    int[][] arr = new int[3][4];
    
    // Set the element in row 0, column 2
    arr[0][2] = 42;
    System.out.println(arr);
    /*
    // Number of rows is length of the array
    System.out.println("Number of rows: " + arr.length);
    
    // Number of columns is the length of one of the rows
    System.out.println("Number of columns: " + arr[0].length);
    System.out.println();
        
    // We can initialize a 2D array this way too.  This one
    // has two rows and four columns.
    double[][] values = { 
        {1.0, 2.0, 3.0, 4.0},
        {5.0, 6.0, 7.0, 8.0} };

       
    System.out.println("Sum: " + findSum(values));   
    System.out.println();

    System.out.println("Sums of columns: ");
    double[] columnSums = findColumnSums(values);
    System.out.println(Arrays.toString(columnSums));
    */
  }
  
  
  /**
   * Returns the sum of all elements in a 2D array of doubles
   * @param arr
   * @return
   */
  public static double findSum(double[][] arr)
  {
    double total = 0.0;
    for (int row = 0; row < arr.length; row += 1)
    {
      for (int col = 0; col < arr[0].length; col += 1)
      {
        total += arr[row][col];
      }
    }
    return total;
  }
  
  /**
   * Returns the sums of all columns in a 2D array of doubles.
   * @param arr
   * @return
   */
  public static double[] findColumnSums(double[][] arr)
  {
    int numColumns = arr[0].length;
    double[] result = new double[numColumns];
    for (int col = 0; col < numColumns; col += 1)
    {
      for (int row = 0; row < arr.length; row += 1)
      result[col] += arr[row][col];
    }
    return result;
  }

}