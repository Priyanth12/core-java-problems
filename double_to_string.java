package oops;
import java.util.Scanner;
public class double_to_string {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter a double element");
	Double d = sc.nextDouble();
	
	String str = Double.toString(d);
	System.out.println("Double value:" +d);
	System.out.println("String value:" +str);
	sc.close();
	
}
}
