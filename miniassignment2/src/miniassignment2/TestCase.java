package miniassignment2;

public class TestCase {
	 public static void main(String[] args){
		 State[] s = PearlUtil.createFromString("@.@+-.+.#");
		 int idx = PearlUtil.findRightmostMovableBlock(s, s.length-1);
		 System.out.println(idx);

		 System.out.println(State.toString(s));
		 PearlUtil.moveBlocks(s);
		 System.out.println(State.toString(s));

	 }
}
