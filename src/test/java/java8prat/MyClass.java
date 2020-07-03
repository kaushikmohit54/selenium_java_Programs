package java8prat;

public class MyClass implements MyIF {
	 
    public int add(int x, int y) {
        return x+y;
    }
    
    
    public static void main(String[] args) {
        MyIF intRef = new MyClass();
        
        System.out.println("Sum = " + intRef.add(5,10));
        
        System.out.println("Product = " + intRef.multiply(5,10));
    }
}
 
