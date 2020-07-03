package Exceptions;

public class TryCatch
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
			int k = i/0;
			System.out.println("The Division Result is ::: " +k);
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Something Went Wrong <> Please Check Exception " +e.getMessage());
			System.out.println("Bingo - Enter Value > 0");
		}
		
		System.out.println("The End");
	}
}
