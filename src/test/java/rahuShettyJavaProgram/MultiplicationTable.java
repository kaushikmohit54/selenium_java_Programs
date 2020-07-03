package rahuShettyJavaProgram;

public class MultiplicationTable {

	
	//multiplication without multiply opertor 
	public static void main(String[] args) {
		
		int[] a= {2,5,7,8,10,55,22};
		int result=multiply(5,10);
		System.out.println(result);
		
	}

	private static int multiply(int i, int j) {
		int sum=0;
		//i has to  sum itself  j times to  get results
		
		/*int k=1;
		while (k<=j) {
			sum=sum+i;//5
		k++;	
		}*/
		for (int k = 1; k <=j; k++) {
			sum=sum+i;
		}
		return sum;
	}


}
