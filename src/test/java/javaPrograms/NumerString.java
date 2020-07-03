package javaPrograms;

public class NumerString {

	public static void main(String[] args) {
		
		String s="ankur1511jain13";
		String s2="";
		
		String arr[]=s.split("[a-zA-Z]+");
		
		for(String s1 : arr){
			
			s2=s2+s1.trim();
			
		}
	
		char[]ch=s2.toCharArray();
		
		for(Character c : ch){
			System.out.print(c+",");
		}

	}

}