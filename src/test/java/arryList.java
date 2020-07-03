
public class arryList {

	public static void main(String[] args) {
		char[] mychar= {'m','b','c','d'};
		
		String s=new String(mychar);
		System.out.println(s);
		String mystr1="java-;-is fun";
		int index =mystr1.indexOf(';');
		System.out.println(mystr1.substring(index));
		System.out.println(mystr1.length());
		//System.out.println(mystr1.substring(5,7));

	}

}
