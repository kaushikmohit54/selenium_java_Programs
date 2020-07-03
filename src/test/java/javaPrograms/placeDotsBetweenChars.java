package javaPrograms;

public class placeDotsBetweenChars {

	public static void main(String[] args) {
		String s="hello";
		
		 
		String[] chrr = s.split("");
		/*char[] ch = new char[s.length()];
		for (int i = 0; i < s.length(); i++) {
			ch[i]=s.charAt(i);
		}*/
		for (String c : chrr) {
			System.out.println(c+ ".");
			
		}
			
		}

	

}
