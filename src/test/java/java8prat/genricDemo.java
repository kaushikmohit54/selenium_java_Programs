package java8prat;

import java.util.ArrayList;

class Container<T>{
	T value;
	public void show() {
		System.out.println(value.getClass().getName());
	}
	public void demo(ArrayList<Integer> obj) {
		
	}
}

public class genricDemo {

	
	public static void main(String[] args) {
		Container<Integer> c=new Container();
	}
}
