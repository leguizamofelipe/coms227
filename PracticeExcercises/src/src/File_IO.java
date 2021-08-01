package src;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class File_IO
{
  public static void main(String[] args) throws FileNotFoundException
  {
    File f = new File("yeet.txt");
    Scanner s = new Scanner(f);

    System.out.println(f.exists());          // true if the file exists
    System.out.println(f.getName());         // name of the file 
    System.out.println(f.getAbsolutePath()); // absolute path to the file
    System.out.println(f.length());          // size of the file
    System.out.println("Working Directory = " + System.getProperty("user.dir"));

    while (s.hasNextLine())
    {
      String line = s.nextLine();
      System.out.println(line);
    }
    s.close();
  }
}