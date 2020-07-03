package seleniumPrograms;

public class strPrintfromText {

	public static void main(String[] args) {
	String str="You have Ordered three(3) books. Order No is: '123098-551' Save it for reference";

		//System.out.println(str.substring(23, 24));
		String[] s=str.split(" ");
		for (int i = 0; i < s.length; i++) {
			
			if (i==3) {
				String strArr[] = s[i].split("\\(");
				System.out.println(strArr[1].substring(0, strArr[1].length()-1));
			}
		
			if(i==8) {
				
				System.out.print(s[i].substring(1,(s[i].length()-1)));
			}
		}
		
		

	}

}
