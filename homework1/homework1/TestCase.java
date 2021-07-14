package homework1;

class TestCase {

	public static void main(String[] args) {
		Location p = new Location("Paris", 100);
		Location m = new Location("Madrid", 80);
		Location r = new Location("Rome", 70);
		Location l = new Location("London", 150);
		
		Backpacker b = new Backpacker(500, p);
		
		int funds = 400;
		/*
		System.out.println("Location Name: " + c.getName());
		System.out.println("Cost for one night: " + c.lodgingCost());
		System.out.println("Cost for postcard: " + c.costToSendPostcard());
		System.out.println("Max length of stay: " + c.maxLengthOfStay(funds));
		System.out.println("Max postcards: " + c.maxNumberOfPostcards(funds));
		*/
		
		b.visit(m, 2);
		b.visit(r, 4);
		b.visit(l, 4);
		
		System.out.println("Journal: " + b.getJournal());

	}

}
