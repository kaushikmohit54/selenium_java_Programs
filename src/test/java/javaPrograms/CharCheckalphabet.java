package javaPrograms;
import java.util.Scanner;

public class CharCheckalphabet {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a character");
		char ch=sc.next().charAt(0);
		
		if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')){
			System.out.println("character is an alphabet");
		}
		else{
			System.out.println("character is not an alphabet");
		}

	}

}