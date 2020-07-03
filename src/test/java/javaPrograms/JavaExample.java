package javaPrograms;


public class JavaExample {
    public static void main(String args[]) {
	String str1 = "Cow"; 
	//This is an empty string
	String str2 = "";
	String str3 = "Goat";
		
	System.out.println(str1.compareTo(str2));

	if(str1.compareTo(str2)==0) {
		System.out.println("equal");
	}
	else {
		System.out.println("not equal");
	}
	System.out.println(str2.compareTo(str3));
   }
}