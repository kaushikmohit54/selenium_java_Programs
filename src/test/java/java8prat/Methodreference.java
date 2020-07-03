package java8prat;

@FunctionalInterface 
interface MyInterface{  
    void display();  
}  
public class Methodreference {  
    public void myMethod(){  
	System.out.println("Instance Method");  
    }  
    public static void main(String[] args) {  
    	Methodreference mr = new Methodreference();   
	// Method reference using the object of the class
	MyInterface ref = mr::myMethod;  
	// Calling the method of functional interface  
	ref.display();  
    }  
}
