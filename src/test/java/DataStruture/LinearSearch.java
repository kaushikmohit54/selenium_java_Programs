package DataStruture;


public class LinearSearch {

	public static void main(String[] args) {
		int[] arr= {2,5,7,9,10};
		
		int search=7;
		int temp=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==search) {
				System.out.println("elemnt is presnt: " +i+ " at index");
				temp=temp+1;
				
			}
		}
		if(temp==0) {
			System.out.println("element not found");
		}

	}

}
