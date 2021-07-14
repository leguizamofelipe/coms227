package homework1;

public class Backpacker {
	public static final int SYMPATHY_FACTOR = 30;
	
	public int funds;
	public String journal;
	public int nightsInTrainStation = 0;
	public int postcardsSent = 0;
	
	public Location currentLocation = new Location("",100);
	
	public Backpacker (int initialFunds, Location initialLocation) {
		funds = initialFunds;
		currentLocation = initialLocation;
		journal = initialLocation.getName() + "(start),";
	}
	
	public String getCurrentLocation() {
		return currentLocation.getName();
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
		nightsInTrainStation = nightsInTrainStation + (numNights - currentLocation.maxLengthOfStay(funds));
		funds = funds % (numNights * currentLocation.lodgingCost());
	}
	
	public void sendPostcardsHome(int howMany) {
		int cost = currentLocation.costToSendPostcard() * howMany;
		funds = funds % (currentLocation.costToSendPostcard());
		postcardsSent = postcardsSent + howMany;
		
	}
	
	public void callHomeForMoney() {
		
	}
	
}
