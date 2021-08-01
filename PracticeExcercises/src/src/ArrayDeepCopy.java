package src;
import java.util.Arrays;

public class ArrayDeepCopy
{

  public static void main(String[] args)
  {
    // What if the elements of the array are references instead of primitives?
    SimpleRectangle[] rects = new SimpleRectangle[2];
    rects[0] = new SimpleRectangle(1, 1);
    rects[1] = new SimpleRectangle(2, 2);
    
    // makes a "shallow copy" of rects
    SimpleRectangle[] shallowCopy = Arrays.copyOf(rects, rects.length);
    
    // Even though rects2 is an independent copy of rects, the 
    // reference rects2[0] still refers to the same Rectangle object as rects[0]
    shallowCopy[0].grow(100, 0);
    System.out.println(rects[0].getWidth());
    
    // To make a "deep copy", we have to individually copy each Rectangle object: 
    SimpleRectangle[] deepCopy = new SimpleRectangle[rects.length];
    for (int i = 0; i < rects.length; i += 1)
    {
      
      // option 1: Just make a new rectangle and initialize it to match the old one
      int width = rects[i].getWidth();
      int height = rects[i].getHeight();
      deepCopy[i] = new SimpleRectangle(width, height);
    
      // option 2: If there is one, use a copy constructor
      //rects3[i] = new SimpleRectangle(rects2[i]);
    }
  }

}



/* public */  class SimpleRectangle
{
  /**
   * Width of this rectangle.
   */
  private int width;
  
  /**
   * Height of this rectangle.
   */
  private int height;

  /**
   * Constructs a rectangle with given width and height.
   * @param givenWidth
   * @param givenHeight
   */
  public SimpleRectangle(int givenWidth, int givenHeight)
  {
    width = givenWidth;
    height = givenHeight;
  }
  
  /**
   * Copy constructor.
   * @param givenRect
   */
  public SimpleRectangle(SimpleRectangle givenRect)
  {
    width = givenRect.width;
    height = givenRect.height;
  }
  

  
  /**
   * Returns the width of this rectangle.
   * @return
   *   width of the rectangle
   */
  public int getWidth()
  {
    return width;
  }
  
  /**
   * Returns the height of the rectangle.
   * @return
   *   height of the rectangle
   */
  public int getHeight()
  {
    return height;   
  }
  
  /**
   * Causes this rectangle to grow.
   * @param h
   *   amount by which to grow horizontally
   * @param v
   *   amount by which to grow vertically
   */
  public void grow(int h, int v)
  {
    int newWidth = width + 2 * h;
    int newHeight = height + 2 * v;
    
    width = newWidth;
    height = newHeight;
  }

}