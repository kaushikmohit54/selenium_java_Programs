
public class ReverseNumber {

	public static void main(String[] args) {
		int n =121;
		int rev=0;
		int rem;
		int temp=n;
		
		
		while (n>0) {
			
			rev=rev*10+n%10;
			//rev=rev*10+rem;
			n=n/10;
			
			
		}
		System.out.println("reverse number:"+ rev);
		
		if(temp==rev) {
			System.out.println("number is palidrome number");
		}
		else
		{
			System.out.println("not palidrome number");
		}
	}

}
