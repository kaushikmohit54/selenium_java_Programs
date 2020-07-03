package rahuShettyJavaProgram;

public class strPrograms {

	public static void main(String[] args) {
		
		String a="hello";
		String b="hello";
		String s1=new String("hello");
		a.concat("world");
		System.out.println(a);
		
		StringBuffer sb=new StringBuffer("hello");
		sb.append("world");
		System.out.println(sb);
		sb.insert(2, "she");
		System.out.println(sb);
		sb.replace(5, 7, "aa");
		System.out.println(sb);
		sb.deleteCharAt(5);
		sb.reverse();
		System.out.println(sb);
		System.out.println(a.equals(b));
		System.out.println(a==s1);
		
		
		//String Builder is not thread safe it is non syncronized
	}
}
