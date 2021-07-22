package miniassignment2;

public class TestCase {
	 public static void main(String[] args){
		 State[] s = PearlUtil.createFromString("@.@..#");
		 /*
		 System.out.println(State.toString(s));
		 PearlUtil.collectPearls(s, 0, 5);
		 System.out.println(State.toString(s));
		 */
		 //int idx = PearlUtil.findRightmostMovableBlock(s, s.length-1);
		 
		 System.out.println(PearlUtil.isValidForMoveBlocks(s));
	 }
}
