package miniassignment2;

public class TestCase {
	 public static void main(String[] args){
		 State[] s = PearlUtil.createFromString(".@..@.+-#");
		 System.out.println(State.toString(s));
		 PearlUtil.movePlayer(s);
		 System.out.println(State.toString(s));
	 }
}
