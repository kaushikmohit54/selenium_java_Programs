package strProgram;

public class lenthisemplty {

	public static void main(String[] args) {
		String s="mohit";
		System.out.println(s.length());
		System.out.println(s.trim());
		if(s.isEmpty()==true) {
			System.out.println("number is empty");
		}
		int len=s.length();
		if(len==0) {
			System.out.println("empty");
		}
		
		String s1="deepak";
		String s2="java";
		System.out.println(s1+s2);
		System.out.println(s1+10);
		System.out.println(10+20+s2);
		System.out.println(s1.concat("ji"));
		System.out.println(s1.join(",", s1,s2));
		String s5="this is mohit";
		System.out.println(s5.subSequence(3, 9));
		System.out.println(s5.substring(3));
		System.out.println(s5.substring(3, 11));;
		String s6="this is demo";
		//System.out.println(s6.replace("oo", "a"));
		System.out.println(s6.replaceFirst("o", "a"));
		System.out.println(s6.replaceAll("is(.)", "a"));
		System.out.println(s6.indexOf("is"));
		System.out.println(s.lastIndexOf('i'));
		System.out.println(s6.charAt(3));
		System.out.println(s6.contains("i"));
		System.out.println(s6.startsWith("t"));
		int a=10;
		String d=String.valueOf(a);
		System.out.println(d+"mk");
		char[] c=s6.toCharArray();
		System.out.println(c);
		StringBuffer sb=new StringBuffer("mohit");
		System.out.println(sb.delete(3, 4));
		System.out.println(sb.capacity());
		System.out.println(sb.deleteCharAt(3));
		System.out.println(sb.reverse());
		System.out.println(sb.replace(3, 4, "m"));
		//sb.append("abc");

	}

}
