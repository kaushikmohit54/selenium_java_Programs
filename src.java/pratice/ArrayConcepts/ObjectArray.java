package ArrayConcepts;

public class ObjectArray
{
	//Object Array - Using Object Array we can store all kind of data type variables.
	//But Size is fixed with.
	//To Overcome from it we use ArrayList where Size is not fixed.
	//Here Size will be taken care by JVM.
	public static void main(String[] args) 
	{
		Object employee[] = new Object[4];
		employee[0] = 123;
		employee[1] = 12.34;
		employee[2] = "Pavan";
		employee[3] = 'S';
		
		//To Print Size of an Array
		int sizeOfObjectArray = employee.length;
		System.out.println("The Size of Object Array is ::: " +sizeOfObjectArray);
		
		//To Print Required Value based on Index from Array
		System.out.println("The Value of Index 2 is ::: " +employee[2]);
		
		//To Iterate Array Values using For-Loop and Print
		for(int i=0; i<employee.length; i++)
		{
			System.out.println("The Employee " + i + " Value is ::: " +employee[i]);
		}
	}
}
