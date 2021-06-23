
public class E1Practice {
	public static void main(String[] args) {
		System.out.println("Hello World. This is Felipe");
		
		//E1.2
		int intsum = 0;
		for (int number=1; number<=10; number ++) {
			intsum += number;
		}
		
		//Just practice
		System.out.println("Sum of first ten integers is: " + intsum);
		
		for (int i=0; i<20; i++) {
			System.out.println(i);
		}
		
		//E1.5
		
		//Line 1
		
		printLine(Name.length());

		System.out.println("");
		
		System.out.println(Name);
		
		printLine(Name.length());
	}
	
	public static void printLine(int length) {
		for (int i=0; i<length; i++) {
			System.out.print("-");
		}
	}
	
	public static String Name = new String("|Felipe|");
}
