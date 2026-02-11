package oops;
import java.util.Scanner;
public class ascii_value_2 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Ascii value");
		int input = sc.nextInt();
		ascii(input);
		
		sc.close();
	}
public static void ascii(int input ) {
	char character = (char)input ;
	System.out.println("character: '"+ character +"' -->ASCII value:"+ input);
}
}
