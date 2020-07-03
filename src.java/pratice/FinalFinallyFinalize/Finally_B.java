package FinalFinallyFinalize;

public class Finally_B
{
	public static void division()
	{
		int i = 10;
		try
		{
			System.out.println("Inside Try Block");
			int k = i/0;
		}
		catch(NullPointerException e)
		{
			System.out.println("Inside Catch Block");
			System.out.println("Divide by Zero Error");
		}
		finally //Finally is a Block
		{
			System.out.println("Execute my code even after any Exception");
		}
	}
	
	public static void main(String[] args)
	{
		division();
	}
}
