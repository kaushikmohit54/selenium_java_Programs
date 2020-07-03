package JavastarProgramming;

public class StartPattern1 {
	public static void main(String[] args) {
		// star1();
		// star2();
		// star3();
		// star4();
		// star5();
		// star6();
		//star7();
		//star8();
		star9();
	}

	static void star1() {
		/*
		 * * * * * * * * * * *
		 */
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");

			}
			System.out.println("");

		}
	}

	static void star2() {
		/**
		 * * * * * * * * * * *
		 **/

		for (int i = 1; i <= 4; i++) {
			for (int j = 4; j >= i; j--) {
				System.out.print("* ");

			}
			System.out.println("");

		}

	}

	static void star3() {
		/**
		 * * * * * * * * * * * * * * * * *
		 */
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");

			}
			System.out.println("");

		}
		for (int i = 1; i <= 4; i++) {
			for (int j = 3; j >= i; j--) {
				System.out.print("* ");

			}
			System.out.println("");

		}

	}

	static void star4() {
		/**
		**
		***
		*****/

		for (int i = 1; i <= 4; i++) {
			for (int j = 4; j >= i; j--) {
				System.out.print(" ");

			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");

			}
			System.out.println("");

		}

	}

	static void star5() {
		/*****
		 ***
		  **
		   **/

		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");

			}
			for (int k = 4; k >= i; k--) {
				System.out.print("*");

			}
			System.out.println("");

		}

	}

	static void star6() {
		/**
		**
		***
		*****/

		for (int i = 1; i <= 4; i++) {
			for (int j = 4; j >= i; j--) {
				System.out.print(" ");

			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");

			}
			System.out.println("");

		}

		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");

			}
			for (int k = 4; k >= i; k--) {
				System.out.print("*");

			}
			System.out.println("");

		}

	}

	static void star7() {
		/*
		 *
		    * *
		   * * *
		  * * * **/
		for (int i = 1; i <= 4; i++) {
			for (int j = 4; j >= i; j--) {
				System.out.print(" ");

			}
			for (int k = 1; k <= i; k++) {
				System.out.print(" *");

			}
			System.out.println("");

		}

	}
	
	
	static void star8() {
		/**
		   ***
		  *****
		 ********/
		for (int i = 1; i <= 4; i++) {
			for (int j = 4; j >= i; j--) {
				System.out.print(" ");

			}
			for (int k = 1; k <( i*2); k++) {
				System.out.print("*");

			}
			System.out.println("");

		}

	}
	
	static void star9() {
	/*	*******
		  *****
		   ***
		    **/

		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");

			}
			for (int k = 9; k >( i*2); k--) {
				System.out.print("*");

			}
			System.out.println("");

		}

	}
	
	
	
}
