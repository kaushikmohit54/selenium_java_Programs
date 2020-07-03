package javaPrograms;

import java.util.ArrayList;
import java.util.Collections;

public class SwapElement {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		al.add(2);
		al.add(4);
		al.add(8);
		al.add(19);
		System.out.println("Before swapping"+al);
		Collections.swap(al, 2, 3);
		
		System.out.println("After swapping"+al);
	}

}