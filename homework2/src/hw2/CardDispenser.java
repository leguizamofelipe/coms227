package hw2;
/*
 * Object to represent a card dispenser, takes card and gives it 
 * status information
 * @author dfl
 */

public class CardDispenser {
	/*
	 * Representation of time in form of TimeClock object
	 */
	TimeClock Clock;
	
	/*
	 * Constructor for CardDispenser class, uses given TimeClock object
	 * @param givenClock
	 * 	Clock object being used
	 */
	public CardDispenser(TimeClock givenClock) {
		Clock = givenClock;
	}
	
	/*
	 * Creates new parking card and returns with current timestamp
	 * @return ParkingCard
	 * 	parking card with timestamp
	 */
	public ParkingCard takeCard() {
		return new ParkingCard(Clock.getTime());
	}
}
