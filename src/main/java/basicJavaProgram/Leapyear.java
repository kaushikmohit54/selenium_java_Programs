package basicJavaProgram;

public class Leapyear {
	public static void main(String[] args) {
/*
		int year = 1900;
		// year is divisible by 4 all the centuries--ending with 00
		/// century year is leap year only when it is perfectly divisable by 400
		boolean leap = false;

		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					System.out.println(year + "this year is leap year");
					leap = true;

				} else {
					leap = false;
				}

			}
			else {
				leap=false;
			}

		}
		else {
			leap=false;
		}
		
		*/
		
		int year=1900;
		
		if ((year % 4==0) ||(year%400==0)&&(year!=100)) {
			System.out.println(year+"is leap year");
			
		} else {
			System.out.println("not leap year");

		}
		
	}
}
