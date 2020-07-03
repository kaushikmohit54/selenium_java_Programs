package java8prat;

public interface MyIF {
    
    int add(int x, int y);
    
    //default method
    default int multiply(int x, int y){
        return x*y;
    }
}
 
