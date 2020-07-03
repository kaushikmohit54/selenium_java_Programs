package ArrayConcepts;

public class TwoDimensionalArray 
{
	public static void main(String[] args) 
	{
		int array[][] = new int[2][2];

		array[0][0] = 10;
		array[0][1] = 20;
		array[1][0] = 30;
		array[1][1] = 40;

		//To Print Size of an Array
		int sizeOfArray = array.length;
		System.out.println("The Size of 2D Array is ::: " +sizeOfArray);
		
		//To Print Required Value based on Index from Array
		System.out.println("The 3rd Value of 2D Array is ::: " +array[1][0]);
	}
}
