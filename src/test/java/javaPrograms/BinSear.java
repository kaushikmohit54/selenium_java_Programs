package javaPrograms;

public class BinSear {

	public static void main(String[] args) {
		int[] arr = { 2, 5, 7, 9, 12, 16, 24, 28 };
		int li=0;
		int hi=arr.length-1;
		int mi=hi+li/2;
		int srh=24;
		
		
		while (li<=hi) {
			if (arr[mi]==srh) {
				System.out.println("eleemnt found at" +mi+srh);
				break;
			}
		
			else if (arr[mi]<srh) {
				li=mi+1;
			}
			else {
				hi=mi-1;
				
			}
			mi=(li+hi)/2;
		}
		if (li>hi) {
			System.out.println("elenet is not present"+srh);
			
		}
				
		
	}

}
