package basicJavaProgram;

public class SwapNumbers {
	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		
		System.out.println("Before swap value of a and b"+a +"value of b is :" +b);
		a=a+b;//30;
		b=a-b;//10;
		a=a-b;//20
		System.out.println("After swap value of a and b"+a +"value of b is :" +b);
		
		//with thired variable
		int temp; 
		temp=a;
		a=b;
		b=temp;
		
		
		System.out.println("After swap value of a and b"+a +"value of b is :" +b);
	}

}
