package homework1;

public class Location {
	public static final double RELATIVE_COST_OF_POSTCARD = 0.05;
	
	private String currentLocation;
	private int lodgingCost; // Cost of staying the night
		
	public Location(String givenName, int givenLodgingCost) {
		currentLocation = givenName;
		lodgingCost = givenLodgingCost;
	}
	
	public String getName(){
		return currentLocation;
	}
	
	public int lodgingCost() {
		return lodgingCost;
	}
	
	public int costToSendPostcard() {
		return (int) (lodgingCost * RELATIVE_COST_OF_POSTCARD);
	}
	
	public int maxLengthOfStay(int funds) {
		return (int) (funds / lodgingCost);
	}
	
	public int maxNumberOfPostcards(int funds) {
		return (int) (funds/(lodgingCost * RELATIVE_COST_OF_POSTCARD));
	}
	
}
