package oops;
import java.util.Scanner;
public class integer_to_string {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a integer");
	int num = sc.nextInt();
	String str = Integer.toString(num);
	System.out.println("Integer value:" +num);
	System.out.println("String value:" +str);
	sc.close();
	
}
}
