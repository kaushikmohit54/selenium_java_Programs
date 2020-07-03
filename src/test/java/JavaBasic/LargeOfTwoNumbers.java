package JavaBasic;

import java.util.Scanner;

public class LargeOfTwoNumbers {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c=30;
		
		if(a>b && a>c) {
			System.out.println("a is greator than b");
		}
		else if(b>a && b>c)
		{
			System.out.println("a is smaller than b");
		}
		else
		{
			System.out.println("c is greastor");
		}

	}

}
