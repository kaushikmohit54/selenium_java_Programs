package DataStruture;

public class Find2MaximumNumbersInArray  {
	
	public static void main(String[] args) {
		printTwoMaximumNumbers();
	}
	public static void printTwoMaximumNumbers()
	{	int numbers[] = {2,5,8,6,7,90};
		int maxOne = 0;
		int maxTwo = 0;
		
		for(int number : numbers)
		{
			if(maxOne < number)
			{
				maxTwo = maxOne;
				maxOne = number;//5
			}
			else if(maxTwo < number)
			{
				maxTwo =  number;
			}
		}
		
		System.out.println("First Maximum Number is ::: " +maxOne);
		System.out.println("Second Maximum Number is ::: " +maxTwo);
	}
	
}
