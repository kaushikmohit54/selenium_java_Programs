package basicJavaProgram;

public class LargestNumberin3 {

	public static void main(String[] args) {
		int a=4;
		int b=5;
		int c=66;
		
		if(a>b&&a>c) {
			System.out.println("a is greator");
		}
		else if (b>c) {
			System.out.println("b is greator");
			
		}
		else
			System.out.println("c is greator");
	
		if(a>=b) {
			
			if (a>=c) {
				System.out.println("a is greator");
				
			}
			else
				System.out.println("c is greator");
		}
		else {
			if(b>=c) {
				System.out.println("b is greator");
			}
			else
				System.out.println("c is grator");
		}
		
	}
}
