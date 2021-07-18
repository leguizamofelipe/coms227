package hw2;

public class ExitGate {
	private TimeClock clock;
	int exitCount;
	
	public ExitGate(TimeClock givenClock) {
		clock = givenClock;
		exitCount = 0;
	}
	
	public boolean insertCard(ParkingCard c) {
		if (c.getPaymentTime() <= RateUtil.EXIT_TIME_LIMIT && c.getPaymentTime() > 0) {
			exitCount ++;
			return true;
		}else {
			return false;
		}
	}
	
	public int getExitCount() {
		return exitCount;
	}
	
}
