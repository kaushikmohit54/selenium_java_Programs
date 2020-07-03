package javaPrograms;

public class PowerCocept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int base=3;
		int exponent=4;
		long result=1;
		while (exponent!=0) {
			result=result*base;
			--exponent;
			
		}
		System.out.println(result);
		System.out.println(Math.pow(3, 4));

	}

}
