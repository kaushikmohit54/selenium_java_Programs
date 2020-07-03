package basicJavaProgram;

public class SecondLargestArraynumber {

	public static void main(String[] args) {
		int[] a = { 5, 7, 1, 6 };

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {

				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}

			}
			
			
		}
		for (int j = 0; j < a.length; j++) {
			System.out.println(a[j]);
		}
		
		System.out.println(a[1]);

	}

}
