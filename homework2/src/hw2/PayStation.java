package hw2;

public class PayStation {
	public double totalPayments;
	public TimeClock clock;
	public boolean cardInserted;
	public ParkingCard currentCard;
	
	public PayStation(TimeClock givenClock) {
		totalPayments = 0.0;
		clock = givenClock;
		cardInserted = false;
	}
	
	public void insertCard(ParkingCard t) {
		cardInserted = true;
		currentCard = t;
	}
	
	public ParkingCard getCurrentCard() {
		if (cardInserted) {
			return currentCard;	
		}else {
			return null;
		}
	}
	
	public boolean inProgress() {
		return cardInserted;
	}
	
	public double getPaymentDue() {
		if (inProgress()) {
			double costDue;
			int timeDiff = clock.getTime() - currentCard.getStartTime();
			if (currentCard.getPaymentTime() != 0) {
				costDue = RateUtil.calculateCost(timeDiff) - (RateUtil.calculateCost(currentCard.getPaymentTime() - currentCard.getStartTime()));
			}else {
				costDue = RateUtil.calculateCost(timeDiff);
			}
			return costDue;
		}else {
			return 0;
		}
	}
	
	public void makePayment() {
		if (inProgress()) {
			currentCard.setPaymentTime(clock.getTime());
			totalPayments += getPaymentDue();
		}else {
			
		}
	}
	
	public void ejectCard() {
		if(inProgress()) {
			currentCard = null;
			cardInserted = false;
		}
	}
	
	public double getTotalPayments() {
		return totalPayments;
	}
}
