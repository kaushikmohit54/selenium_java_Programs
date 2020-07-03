package DataStruture;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = { 52, 38, 88, 7, 4, 9, 66 };
		int min , temp = 0;

		for (int i = 0; i < arr.length; i++) {
			min = i;
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[j] < arr[min]) {
					min = j;//38,j=2-arr[2<]

				}
			}
			temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;

		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
