package JavaBasic;

public class Amstring {
	
	public void abc() {}
	public static void main(String[] args) {
		
		
		int i=9;
		int c=0,a,temp;
		int n=153;
		temp=n;
		while(n>0) {
			a=n%10;
			n=n/10;
			c=c+(a*a*a);
			
		}
		if(temp==c) {
			System.out.println("ams");
		}
		else
		{
			System.out.println("not amstrong");
		}
		
		
		
		
	}

}
