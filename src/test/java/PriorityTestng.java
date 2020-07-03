import org.testng.annotations.Test;

public class PriorityTestng {
	
	@Test()
	public void c_method(){
		System.out.println("I'm in method C no priority");
	}
	@Test()
	public void b_method(){
		System.out.println("I'm in method B no priority");
	}
	@Test(priority=-1)
	public void a_method(){
		System.out.println("I'm in method A -1");
	}
	@Test()
	public void aa_method(){
		System.out.println("I'm in method E Zero Priority");
	}
	@Test()
	public void aab_method(){
		System.out.println("I'm in method E Zero Priority");
	}
	@Test(priority=1)
	public void d_method(){
		System.out.println("I'm in method D 1 priority");
	}
	@Test(priority=1)
	public void f_method(){
		System.out.println("I'm in method F 1 priority");
	}

}
