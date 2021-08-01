package src;
import java.util.Scanner;

public class Scanner_Sandbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String yeet = "yeet foo bar";
		Scanner s = new Scanner("456 5345 6545 76 65");
		
		while(s.hasNext()) {
			int i = s.nextInt();
			System.out.println(i-400);
		}
		
		s.close();
	}
}