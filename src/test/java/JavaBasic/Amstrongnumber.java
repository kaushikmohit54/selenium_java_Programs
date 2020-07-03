package JavaBasic;

public class Amstrongnumber  {

	public static void main(String[] args) {
		
		int n = 153;
		int t1 = n;
		int len = 0;

		while (t1 != 0) {
			t1 = t1 / 10;
			len = len + 1;
			System.out.println(len);

		}
		int t2 = n;
		int mul = 1;
		int rem;
		int rev = 0;
		int arm = 0;

		while (t2 != 0) {
			rem = t2 % 10;
			for (int i = 1; i < len; i++) {
				mul = mul * rem;

			}
			arm = arm + mul;
			

		}
		if (arm == n) {
			System.out.println("ams");
		}
		else
			System.out.println("not");

		System.out.println();
	}

}
