package java8prat;



 
import java.util.Arrays;
import java.util.stream.Stream;
 
 
public class Stream3 {
 
    public static void main(String[] args) {
        //Create array of Integers
        Integer arr[] = {10,20,30,40,50};
        
        //Create stream from the array using Stream.of()
        Stream stream = Arrays.stream(arr);
        
        //Display element of the stream
        stream.forEach(System.out::println);
    }
 

 
 
}
