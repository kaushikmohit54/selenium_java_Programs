package DataStruture;

public class BubbleSort {

	public static void main(String[] args) {

		int[] arr = { 4, 6, 8, 3, 6, 9, 88 };
		int flag = 0;
		int temp;
		int n = (arr.length) - 1;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					flag = 1;

				}
			}
			if (flag == 0) {
				break;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + "");
		}

	}

}
