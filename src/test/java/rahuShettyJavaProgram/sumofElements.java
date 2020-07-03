package rahuShettyJavaProgram;

public class sumofElements {

	public static void main(String[] args) {
		int[] a= {2,5,7,8,10,55,22};
		int sum=sumArray(a);
		System.out.println(sum);
		/*int sum=0;
		
		for (int i = 0; i < a.length; i++) {
			sum=sum+a[i];
			
			
		}
		System.out.println("sum of elements is : "+sum);*/
	}

	private static int sumArray(int[] a) {
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
			sum=sum+a[i];
		}
		// TODO Auto-generated method stub
		return sum;
	}

}
