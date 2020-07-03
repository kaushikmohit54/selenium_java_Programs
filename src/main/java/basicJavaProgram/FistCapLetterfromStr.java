package basicJavaProgram;

public class FistCapLetterfromStr {

	public static void main(String[] args) {
		String s="abcABC";
		
		for (int i = 0; i < s.length(); i++) {
			
			int ascii=s.charAt(i);
			
			if((ascii>=65)&&(ascii<=90)) {
				System.out.println("First capital letter is"+s.charAt(i));
				break;
			}
					
		}

		
		
		
		
		
	}
	
	
	
	
	
	

}
