package homework1;


public class Location {
	public static final double RELATIVE_COST_OF_POSTCARD = 0.05;
	
	private String currentLocation = "";
	private int lodgingCost = 0;
		
	public Location(String givenName, int givenLodgingCost) {
		currentLocation = givenName;
		
	}
	
	public String getName(){
		return currentLocation;
	}
	
	public int lodgingCost() {
		return lodgingCost;
	}
	
	public int costToSendPostcard() {
		return 3;
	}
	
	public int maxLengthOfStay(int funds) {
		return 3;
	}
	
	public int maxNumberOfPostcards(int funds) {
		return 3;
	}
	
}
