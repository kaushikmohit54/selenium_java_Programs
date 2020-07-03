package Patterns;

 class A {
	 static void a() {
		 System.out.println("class 1");
		 
	 }
	 void a1() {
		 System.out.println("a 1");
		 
	 }

	

}

 public class B extends A {
	 static void a() {
		 System.out.println("class 2");
		 
	 }
	 void a2() {
		 System.out.println("a 2");
		 
	 }
	
	 public static void main(String[] args) {
			B a=new B();
			a.a();
			B b = new B();
			b.a();
			B a1 = new B();
			a1.a();
		
		
		
	}
	 
	

	

}
