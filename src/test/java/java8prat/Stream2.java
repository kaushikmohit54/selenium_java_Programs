package java8prat;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
 
 
public class Stream2 {
 
    public static void main(String[] args) {
 
        List lst = new ArrayList();
        
        for(int i=0;i<5;i++){
            lst.add(i);
        }
        
        Stream stream = lst.stream();
        
        stream.forEach(System.out::println);
    
    }
 
}
