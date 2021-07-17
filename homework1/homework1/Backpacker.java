package homework1;

public class Backpacker {
	public static final int SYMPATHY_FACTOR = 30;
	
	public int funds;
	public String journal;
	public int nightsInTrainStation = 0;
	public int totalPostcardsSent = 0;
	public Location currentLocation;
	
	public Backpacker (int initialFunds, Location initialLocation) {
		funds = initialFunds;
		currentLocation = initialLocation;
		journal = initialLocation.getName() + "(start),";
	}
	
	public Location getCurrentLocation() {
		return currentLocation;
	}
	
	public int getCurrentFunds() {
		return funds;
	}
	
	public String getJournal() {
		return journal;
	}
	
	public boolean isSOL() {
		return (funds <= currentLocation.costToSendPostcard());
	}
	
	public int getTotalNightsInTrainStation() {
		return nightsInTrainStation;
	}
	
	public void visit(Location c, int numNights) {
		currentLocation = c;
		journal = journal + currentLocation.getName()	+ "(" + String.valueOf(numNights) + "),";	
		nightsInTrainStation += Math.max(0, (numNights - currentLocation.maxLengthOfStay(funds)));
		funds = funds - ((numNights - nightsInTrainStation) * currentLocation.lodgingCost());
	}
	
	public void sendPostcardsHome(int howMany) {
		int maxPostcards = currentLocation.maxNumberOfPostcards(funds);
		int postcardsSent = Math.min(howMany, maxPostcards);
		funds -= postcardsSent * currentLocation.costToSendPostcard();
		totalPostcardsSent += postcardsSent;
		
	}
	
	public void callHomeForMoney() {
		funds = funds + SYMPATHY_FACTOR * totalPostcardsSent;
		totalPostcardsSent = 0;
	}
	
}
