package basicJavaProgram;

public class sort {

	public static void main(String[] args) {
		int[] a = { 5, 3, 2, 8 };
		int flag = 0;
		int swap;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					swap = a[j];
					a[j] = a[j + 1];
					a[j + 1] = swap;
					flag = 1;

				}
				if (flag == 0) {
					break;
				}
				
			}
			
			
		}
		for (int j = 0; j < a.length; j++) {
			System.out.println(a[j]);
		}

		
	}

}
