package hw2;

public class TestCase {
	public static void main(String[] args) {
		/*
		TimeClock c = new TimeClock();
		ExitGate eg = new ExitGate(c);
		
		ParkingCard p = new ParkingCard(c.getTime());
		p.setPaymentTime(10);
		c.timePasses(20);
		boolean canExit = eg.insertCard(p);
		System.out.println(canExit);
		
		ParkingCard p2 = new ParkingCard(0);
		p2.setPaymentTime(30);
		c.timePasses(60);
		canExit = eg.insertCard(p2);
		System.out.println(canExit); // expected false
		System.out.println(eg.getExitCount()); // expected 1
		*/
		
		/*
		TimeClock c = new TimeClock();
		CardDispenser cd = new CardDispenser(c);
		c.timePasses(10);
		ParkingCard p = cd.takeCard();
		System.out.println(p.getStartTime()); // Expected 10
		System.out.println(p.getPaymentTime()); // Expected 0
		*/
		/*
		
		 TimeClock c = new TimeClock();
		 PayStation ps = new PayStation(c);
		 ParkingCard p = new ParkingCard(0);
		 ps.insertCard(p);
		 System.out.println(ps.inProgress()); // expected true
		 ParkingCard current = ps.getCurrentCard();
		 System.out.println(current == p); // expected true
		 ps.ejectCard();
		 System.out.println(ps.inProgress()); // expected false
		 current = ps.getCurrentCard();
		 System.out.println(current == null); // expected true
		 */
		 /*
		 TimeClock c = new TimeClock();
		 c.timePasses(10);
		 PayStation ps = new PayStation(c);
		 ParkingCard p = new ParkingCard(c.getTime());
		 c.timePasses(60);
		 ps.insertCard(p);
		 System.out.println(ps.getPaymentDue()); // expected 2.00
		 ps.ejectCard(); // eject without paying
		 c.timePasses(75);
		 ps.insertCard(p);
		 System.out.println(ps.getPaymentDue()); // expected 5.0 (3 hours)
		*/
		
		/*
		c.timePasses(10);
		System.out.println(c.getTime());
		CardDispenser d = new CardDispenser(c);
		ParkingCard card = d.takeCard();
		*/
		//System.out.println(RateUtil.calculateCost(3000));
		
		
	}
}
