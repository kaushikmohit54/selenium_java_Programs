package cherchertech;
import java.util.ArrayList;
import java.util.Iterator;
public class SampleIterator {
	public static void main(String args[]){
	    ArrayList products = new ArrayList();
	    products.add("Chercher tech");
	    products.add("Google");
	    products.add("Bing");

	    //Iterator it = products.iterator();
	    Iterator<String> it = products.iterator();
	    while(it.hasNext()) {
	      String obj =  it.next();
	      System.out.println("Value : " +obj);
	    }
	  }
}