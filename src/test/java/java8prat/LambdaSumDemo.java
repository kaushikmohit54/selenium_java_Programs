package java8prat;


public class LambdaSumDemo {
 
    interface MyInter{
        void add(int x, int y);
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        MyInter myInter = (x,y) -> {System.out.println("Sum is " + (x+y));};
        
        myInter.add(10,15);
    }
 
}
