package java8prat;

public class FuntionalInterfaceDemo {
	/*//A lambda expression is a method without a name, access-specifier or return value declaration.

	//Lambda expressions add functional programming features to java. This simplifies and greatly
	 //reduces the amount of code written to achieve tasks.
	//A Lambda expression represents an Anonymous method.	 
	//A lambda expression contains:

	//A parameter list
	//An arrow symbol(->)
	//Body of the lambda containing statements


	//The syntax for Lambda expressions is:

	//(parameters) -> {statements;}	*/
	//A lambda expression can not be executed on its own.
	//the forms the implementation of the abstract method defined by the functional interface that specifies the target type
	//The main advantage of a functional interface is that it can be used to assign a lambda expression or it can be used as a method reference.
	
	
/*	What is a Functional Interface ?
			 

			A functional interface is an interface that specifies only one abstract method.

			A functional interface may also contain one or more static or default methods*/
	
		 
	    interface MyInter{
	        void hello();
	    }
	    public static void main(String[] args) {
	        // TODO Auto-generated method stub
	        MyInter infVar = () -> {System.out.println("Hello World");};
	        
	        infVar.hello();
	    }
	 
	}
	
	

