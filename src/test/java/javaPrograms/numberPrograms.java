package javaPrograms;

public class numberPrograms {
	public static void main(String[] args) {
		sumofdigit(1234);
		countofdigit(34);
		reverseofdigit(456);
		palidromeNumber(189);
		primenumber(13);
		primenumberList();
		Amstrong(153);
		fibonic(12);
		sumofdigitfirshtandlastnumber();
		swapNumber();
		//printMaxTwoNumbers();

	}

	
		
	

	private static void primenumberList() {
		int temp=0;
		
		for (int no = 2; no<=100; no++) {
			
			
			for (int i = 2; i<=no-1;i++) {
				if (no%i==0) {
					temp=temp+1;
				}
			}
			if (temp==0) {
				System.out.println(no);
			} else {
				temp=0;

			}
		}
		
	}

	public static void sumofdigitfirshtandlastnumber() {

		int n = 1234;
		int sum = 0;
		while (n > 0) {
			int rem = n % 10;
			sum = sum + rem;
			n = n / 1000;

		}
		System.out.println(sum);
	}

	public static void fibonic(int n) {
		int a = 1;
		int b = 1;
		int c = 0;
		System.out.println(a + "" + b);
		for (int i = 3; i < n; i++) {
			c = a + b;
			System.out.println(c);
			a = b;
			b = c;

		}

	}

	public static void sumofdigit(int n) {

		int sum = 0;
		int rem;
		while (n > 0) {
			rem = n % 10;
			sum = sum + rem;
			n = n / 10;
		}
		System.out.println(sum);
	}

	public static void countofdigit(int n) {

		int count = 0;
		while (n > 0) {
			n = n / 10;
			count++;

		}
		System.out.println(count);
	}

	public static void reverseofdigit(int n) {

		// 456
		int rev = 0;
		int rem;
		while (n > 0) {
			rem = n % 10;// 6/5/4
			rev = rev * 10 + rem;// 6/65
			n = n / 10;// 5/4

		}
		System.out.println(rev);
	}

	public static void primenumber(int n) {

		boolean prime = true;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				prime = false;
				break;
			}

		}
		if (prime == true) {
			System.out.println(n + "prime number");

		} else {
			System.out.println("not priume number");

		}

	}

	public static void Amstrong(int n) {
		int temp;
		int sum = 0;
		int rem;

		temp = n;
		while (n > 0) {
			rem = n % 10;
			sum = sum + (rem * rem * rem);
			n = n / 10;

		}
		if (temp == sum) {
			System.out.println("number is ams");

		} else {
			System.out.println("not not ams");

		}

	}

	public static void palidromeNumber(int n) {

		// 456
		int rev = 0;
		int rem;
		int temp;
		temp = n;
		while (n > 0) {
			rem = n % 10;// 6/5/4
			rev = rev * 10 + rem;// 6/65
			n = n / 10;// 5/4
		}
		System.out.println(rev);
		if (temp == rev) {
			System.out.println("number is palidrome");

		} else {
			System.out.println("not palidrome");

		}
	}

	public static void swapNumber() {
		//without using thired variable
		int a=10;
		int b=5;
		
		System.out.println("Before swap value of a "+a+" and b value "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swap value of a "+a+" and b value "+b);
		
		
		//with using thired variable
				int x=10;
				int y=5;
				int temp;
				System.out.println("Before swap value of x "+x+" and y value "+y);
				temp=x;
				x=y;
				y=temp;
				
				
				System.out.println("after swap value of x "+x+" and y value "+y);
		
		

	}

}
