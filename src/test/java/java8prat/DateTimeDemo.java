package java8prat;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import JavaBasic.Amstring;

public class DateTimeDemo {
	
	 
    public static void main(String[] args) {
    	
 
        LocalDate date = LocalDate.now();
        System.out.println(date);
        
        LocalTime time = LocalTime.now();
        System.out.println(time);
        
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);
    }}
