package OopsConcepts;

public class MethodOverridingBikeRCKTM extends MethodOverridingBikeOld
{
	//Here we are Overriding method of MethodOverridingBikeOld Class
	//Static Methods cannot be overridden because Static Methods belongs to Class, they are not part of Objects.
	
	//Below Overriding Non-Static Method
	//It is always good to put @Override for methods which we Override
	//Because if we are going to Override Static methods, @Override won't allow to do it.
	
	@Override
	public void start()
	{
		System.out.println("KTM Bike Bike Startf");
	}
	public void star() {
		
	}
	
	public static void main(String args[])
	{
		MethodOverridingBikeOld newBike = new MethodOverridingBikeRCKTM();
		newBike.start();
		newBike.stop();
		newBike.gear();
		//newBike.star();
		
	}
}

//Note: 
//When we do not put @Override for methods in Child Class >> We can Override Parent Class Static Methods in Child Class
//We get updated data from Child Class Static Methods When we call those Static Methods.
//Because Parent Class Static Method will get Hidden and Child class Static Methods will be executed.
//<<<<<<< Above Concept We call it as Method Hiding >>>>>>>