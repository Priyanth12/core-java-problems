package oops;

public class int_to_str_ascii {
public static void main(String[]args) {
	String str = "12345";
	condition(str);
}

public static void condition(String str) {
	int num = 0;
	for(int i=0; i< str.length();i++) {
		char character = str.charAt(i);
		int asciiValue = (int)  character;
		int digit = asciiValue -48;
		num = num*10 + digit;
	}
		System.out.println("integer is"+num);
	
} 
}