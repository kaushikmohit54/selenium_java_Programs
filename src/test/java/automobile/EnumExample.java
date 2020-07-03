package automobile;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class EnumExample {
	
	enum Level{
		Low,
		Medium,
		High
		
	}

	public static void main(String[] args) {
		sum(2, 3);
		System.out.println(sum(2, 3));
		Level l=Level.Medium;
		System.out.println(l);
		LocalDate lo=LocalDate.now();
		
		System.out.println(lo);
		LocalTime ti=LocalTime.now();
		LocalDateTime lt=LocalDateTime.now();
		System.out.println(lt);
	}
	
	public static int sum(int a,int b) {
		return a+b;
	}

}
