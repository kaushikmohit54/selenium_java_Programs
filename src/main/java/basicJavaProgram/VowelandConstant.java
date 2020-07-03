package basicJavaProgram;

public class VowelandConstant {
public static void main(String[] args) {
	char ch='m';
	
	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
		System.out.println(ch+"number is vowel");
	}
	else

		
		System.out.println(ch+"not vowel");
	
	switch (ch) {
	case 'a':
	case 'e':
	case 'i':
	case 'o':
	case 'u':
		System.out.println(ch+"vowel");
		break;

	default:
		System.out.println(ch+"not vowel");
		break;
	}
}


}
