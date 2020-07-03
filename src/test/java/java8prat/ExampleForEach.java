package java8prat;

import java.util.ArrayList;
import java.util.List;

public class ExampleForEach{  
    public static void main(String[] args) {       
       List<String> list=new ArrayList<String>();  
       list.add("Rick");         
       list.add("Negan");       
       list.add("Daryl");         
       list.add("Glenn");         
       list.add("Carl");                
       /*list.forEach(          
           // lambda expression        
           (names)->System.out.println(names)         
       );  */
       list.forEach(
    		   (names)->System.out.println(names)
    		   );
    }  
}