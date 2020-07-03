package java8prat;
public class MY
{
	@FunctionalInterface
	public interface Myinter {
	void show();
	

}
	
	@FunctionalInterface
	public interface Myin {
	int add(int a,int b);
	

	}
	

	@FunctionalInterface
	interface StringlengthLambda {
	int getLength(String s);
	

	}
	public static void printlampbda(StringlengthLambda l) {
	System.out.println(l.getLength("helloe world"));
		
	}
	
	
	

 
	 
	
	 public static void main(String[] args) {
		 Myinter inter=()->{System.out.println("print hello");};
		 inter.show();
		 Myin m=(a,b)->a+b;
		
		System.out.println(m.add(4, 5));
		 
		 StringlengthLambda mynlambda=(s)->s.length();
		 System.out.println(mynlambda.getLength("hello"));
		 
		 printlampbda(s->s.length());
	}
}

 