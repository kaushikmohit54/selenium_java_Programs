package DataStruture;

public class FindMissingNumberArray {

	public static void main(String[] args) {
		int arr[]= {5,3,2,9,10,8,7,6,4};
		int sum1=0;
		int n=10;
		int sum2=0;
		int sum3=n*(n+1)/2;
		
		
		for (int i = 0; i < arr.length; i++) {
			sum1=sum1+arr[i];
			
		}
		System.out.println(sum1);
		
		for (int i = 0; i <=10; i++) {
			sum2=sum2+i;
			
		}
		System.out.println(sum2);
		System.out.println("missing number is : "+(sum2-sum1));
		System.out.println(sum3-sum1);
		

	}

}
