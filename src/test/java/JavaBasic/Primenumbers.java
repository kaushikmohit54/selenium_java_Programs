package JavaBasic;

public class Primenumbers {

	public static void main(String[] args) {
	
		int n =7;
		int m=n/2;
		int temp=0;
		for (int i = 2; i < m; i++) {
			if(n%i==0) {
				temp=temp+1;
			}
			
				
			
		}
		
		if(temp==0) {
			System.out.println("prime number");
		}
		else {
			System.out.println("not prime");
		}

	}

}
