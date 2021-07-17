package homework1;

class TestCase {

	public static void main(String[] args) {
		Location p = new Location("Paris", 100);
		Location m = new Location("Madrid", 80);
		Location r = new Location("Rome", 70);
		Location l = new Location("London", 150);
		
		int funds = 500;
		Backpacker b = new Backpacker(funds, p);
		
		getStatus(b);
			
		b.visit(m, 2);
		b.sendPostcardsHome(5);
		
		getStatus(b);
		
		b.visit(r, 6);
		
		getStatus(b);
		
		b.callHomeForMoney();
		b.callHomeForMoney();
		
		getStatus(b);
	}
	
	private static void getStatus(Backpacker b) {
		System.out.println("****************************************");
		Location l = b.getCurrentLocation();
		System.out.println("Location Name: " + l.getName());
		System.out.println("Cost for one night: " + l.lodgingCost());
		System.out.println("Cost for postcard: " + l.costToSendPostcard());
		System.out.println("Max length of stay: " + l.maxLengthOfStay(b.getCurrentFunds()));
		System.out.println("Max postcards: " + l.maxNumberOfPostcards(b.getCurrentFunds()));
		System.out.println("Funds: " + b.getCurrentFunds());
		System.out.println("Nights in train station: " + b.getTotalNightsInTrainStation());
		System.out.println("****************************************");
		
	}

}
