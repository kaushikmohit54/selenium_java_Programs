package javaPrograms;

public class bubbleSortlatest {

	public static void main(String[] args) {
		int[] a = { 36, 19, 12, 29, 5 };
		
		int temp;
		int flag=0;
		int len=a.length-1;
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len-i; j++) {
				if (a[j]>a[j+1]) {
					
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					flag=1;
					
				}
				
			}
			if (flag==0) {
				break;
				
			}
		}
		for (int i : a) {
			System.out.println(i);
		}
		
		
	}

}
