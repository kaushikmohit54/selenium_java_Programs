package javaPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;



public class leapyear {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a year to check");
		int year=sc.nextInt();
	
if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
                 System.out.println("Year " + year + " is a leap year");
else
                 System.out.println("Year " + year + " is not a leap year");

	}

}
