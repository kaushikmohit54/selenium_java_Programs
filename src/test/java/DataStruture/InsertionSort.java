package DataStruture;

public class InsertionSort {
public static void main(String[] args) {
	
	Insertionsort();
	
}
static void Insertionsort() {
	int arr[]= {4,8,2,6,44,77,33};
	int search=44;
	int temp,min=0;
	int j;
	
	for (int i = 1; i < arr.length; i++) {
		
		temp=arr[i];
		j=i;
		while (j>0 && arr[j-1]>temp) {
			arr[j]=arr[j-1];
			j=j-1;
			arr[j]=temp;
			
		}
		
	}
	for (int i = 0; i < arr.length; i++) {
		System.out.println(arr[i]);
	}
}
}
