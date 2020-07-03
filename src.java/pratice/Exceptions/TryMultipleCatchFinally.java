package Exceptions;

public class TryMultipleCatchFinally
{
	//Exceptions are used to handle the flow of Execution during Run-Time,
	//If we do not handle then Program will be terminated when in Error Found.
	//Try Block must be used with Catch Block
	//Try Block alone is not allowed in Java.
	
	//Object Class is the Super Class of all the Classes.
	//Throwable Class is the Child of Object Class.
	//Error and Exception Classes are the Child of Throwable Class.
	public static void main(String[] args) 
	{
		int i = 10;
		try
		{
			//Below Line of Code will Throw an Exception
			int k = i/0; 
			System.out.println("The Division Result is ::: " +k);
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace(); //To Print What Exception It is Showing
			System.out.println("Something Went Wrong <> Please Check Exception " +e.getMessage());
			System.out.println("Bingo - Enter Value > 0");
		}
		catch(Exception e)
		{
			System.out.println("Please Enter Only Integer Values");
		}
		
		//Finally is a Keyword.
		//Finally is always used with Try, Catch block.
		//It does not matter if any exception is coming or no inside Try, Catch block
		//Still Finally block will be executed.
		finally
		{
			System.out.println("The End of Program");
		}
	}
}
