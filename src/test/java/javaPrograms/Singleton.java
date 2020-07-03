package javaPrograms;

public class Singleton {
	
	private static Singleton single_instance=null;
	public String s;
	
	private Singleton() {
		s="Hello i am using Singleton class";
		
	}
	public static Singleton getInstance() {
		
		if(single_instance==null) {
			single_instance=new Singleton();
		}
		return single_instance;
		
	}
	public static void main(String[] args) {
		Singleton x=Singleton.getInstance();
		System.out.println(x.s);
	}

}
