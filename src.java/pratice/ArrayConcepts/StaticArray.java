package ArrayConcepts;

public class StaticArray 
{
	public static void main(String[] args) 
	{
		//Size is Fixed in Static Array.
		//Only Integer Values can be Stored inside number[]
		//int number[] = new int[5];
		
		//Only String Values can be Stored inside employee[]
		String employee[] = new String[5];
		
		employee[0] = "Ram";
		employee[1] = "Jai";
		employee[2] = "Pavan";
		employee[3] = "Sai";
		employee[4] = "Kiran";

		//To Print Size of an Array
		int noOfEmployees = employee.length;
		System.out.println(noOfEmployees);
		
		//To Print Required Value based on Index from Array
		System.out.println("The Second Employee Name is ::: " +employee[2]);
		
		//To Iterate Array Values using For-Loop and Print
		for(int i=0; i<employee.length; i++)
		{
			System.out.println("The Employee " + i + " Name is ::: " +employee[i]);
		}
	}
}
