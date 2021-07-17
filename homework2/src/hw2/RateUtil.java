package hw2;

public class RateUtil {
	public static final int EXIT_TIME_LIMIT = 15;
	
	private RateUtil() {
		
	}
	
	public static double calculateCost(int minutes) {
		if (minutes <= 30) {
			return 1.0;
		} else if (minutes > 30 && minutes <= 60) {
			return 2.0;
		} else {
			int hours;
			if (minutes % 60 == 0) {
				hours = minutes/60;
			}else {
				hours = minutes/60 + 1;
			}
			
			if (hours >= 1 && hours <= 5) {
				return 2 + (hours-1) * 1.5;
			} else if (hours > 5 && hours <= 8) {
				return 8 + (hours-5) * 1.25;
			} else if (hours > 8){
				//int days = 
				//return days * ;
			}
		}
	}
}
