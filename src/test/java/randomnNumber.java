import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class randomnNumber {

	public static void main(String[] args) {
		//System.out.println(Math.random());
	//;
		//System.out.println(	ThreadLocalRandom.current().nextInt());
		
		Random r=new Random();
		System.out.println(r.nextInt(1000));
	}

}
