package FinalFinallyFinalize;

public class FinalMethod 
{
	//Final Methods Cannot be Overridden, because Final Keyword is to Prevent Overriding.
	//Private Methods also cannot be Overridden, because methods declared as private in parent class--
	//--Won't be visible in Child Class.
	
	public final void show()
	{
		System.out.println("Final Method Cannot be Overridden");
	}
	
	public static void main(String[] args)
	{
		
	}
}
