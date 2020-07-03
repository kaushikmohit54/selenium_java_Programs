package JavaBasic;

public class revStr {

	public static void main(String[] args) {
		String s="Good morning";
		String rev="";
		int len=s.length();
		
		for(int i=len-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		
	}
		System.out.println("the reverse of "+s+ " is: " +rev);
		
		String[] oringinalarray=s.split(" ");
		String reverse="";
		
		for(String item:oringinalarray) {
			
			reverse=item+" "+reverse;
		}
		System.out.println(reverse);
	
	}

}
