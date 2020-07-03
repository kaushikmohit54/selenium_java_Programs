package javaPrograms;

public class SplittheStr {

	public static void main(String[] args) {
		String s = "abc,def,xyz"; 
		String[] str=s.split(",");
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
		
		String s1="Selenium java";
		String s2="Webdriver";
		
		String s3=s1.replace(" "," " +s2+" ");
		System.out.println(s3);
		
		

	}

}
