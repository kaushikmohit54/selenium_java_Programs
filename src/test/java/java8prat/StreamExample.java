package java8prat;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class StreamExample {
   public static void main(String[] args) {
	   
	List<String> names = Arrays.asList("Melisandre","Sansa","Jon","Daenerys","Joffery");
		
	//Creating the stream of all names
	
	Stream<String> allNames = names.stream();
		
	//Creating another stream by filtering long names using filter()
	Stream<String> longNames = allNames.filter(str -> str.length() >6);
	
		
	//displaying the long names
	//longNames.forEach(str->System.out.print(str+" "));
	//collectionFilter();
	MultiplecollectionFilter();
  }
   
   public static void collectionFilter() {
	   List<String> names = Arrays.asList("Melisandre","Sansa","Jon","Daenerys","Joffery");

       List<String> longnames = names.stream()    // converting the list to stream
               .filter(str -> str.length() > 6)   // filter the stream to create a new stream
               .collect(Collectors.toList());  // collect the final stream and convert it to a List

       longnames.forEach(System.out::println);   
   }
   public static void MultiplecollectionFilter() {
	   List<String> names = Arrays.asList("Melisandre","Sansa","Jon","Daenerys","Joffery");

       List<String> longnames = names.stream()  
               .filter(str -> str.length() > 6 && str.length() < 8) //Multiple conditions
               .collect(Collectors.toList());  

       longnames.forEach(System.out::println);   
   }
}
