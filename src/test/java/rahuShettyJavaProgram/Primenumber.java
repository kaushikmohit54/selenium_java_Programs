package rahuShettyJavaProgram;

public class Primenumber {

	// max adjacent diffrence in array
	public static void main(String[] args) {
		int n=12;
		boolean prime=true;
		for (int i = 2; i <=n/2; i++) {
			if (n%i==0) {
				prime=false;
				break;	
			}
		}
		if (prime==true) {
			System.out.println("number is prime");
			
		} else {
				System.out.println("not");
		}
	}

}
