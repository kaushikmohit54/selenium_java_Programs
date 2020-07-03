package DataStruture;

public class BinaraySearch {

	public static void main(String[] args) {
		int[] arr= {3,5,8,15,19,25,30};
		int li=0;
		int hi=arr.length-1;
		int search=19;
		int mi=(hi+li)/2;
		
		while (li<=hi) {
			
		if(arr[mi]==search) {
			
			System.out.println("element is at "+mi+ "position" +search);
			break;
		}
		else if (arr[mi]<search) {
			li=mi+1;
			
		}
		else  {
			hi=mi-1;
			
		}
		mi=(li+hi)/2;
		}
		if(li>hi) {
			System.out.println("element fot found");
		}
		

	}

}
