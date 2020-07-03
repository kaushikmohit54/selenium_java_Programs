package strProgram;

public class removeChar {

	public static void main(String[] args) {
		String str1="mohit is";
		char c = 't';
		System.out.println(str1.replaceAll(Character.toString(c), ""));
		
		System.out.println(removechar("mohit is  muy", 'i'));
		
	}
	public static String removechar(String str,char c) {
		return str.replaceAll(Character.toString(c), "");
	}
		

}
