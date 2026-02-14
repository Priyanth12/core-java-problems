package oops;
import java.util.Scanner;
public class string_to_integer {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sc.nextLine();
		
		int num = Integer.parseInt(str);
		System.out.println("string value:" +str);
		System.out.println("integer value:" +num);
		sc.close();
		
	}

}
