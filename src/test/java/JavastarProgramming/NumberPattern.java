package JavastarProgramming;

public class NumberPattern {
	public static void main(String[] args) {
		//number1();
		//number2();
		//number3();
		number4();
	}

	static void number1() {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);

			}
			System.out.println("");

		}

	}
	
	static void number2() {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);

			}
			System.out.println("");

		}

	}
	
	static void number3() {
		
		/*1 
		2 1 
		3 2 1 
		4 3 2 1 
		5 4 3 2 1 */

		for (int i = 1; i <= 5; i++) {
			for (int j = i; j >= 1; j--) {
				System.out.print(j+" ");

			}
			System.out.println("");

		}

	}
	
static void number4() {
		
		/*1 
		2 1 
		3 2 1 
		4 3 2 1 
		5 4 3 2 1 */

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j+" ");

			}
			for (int k = i-1; k>=1; k--) {
				System.out.print(k+" ");
				
			}
			System.out.println("");
			

		}

	}

}
