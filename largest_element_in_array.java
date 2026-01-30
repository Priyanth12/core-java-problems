package scanner;
import java.util.Scanner;
public class largest_element_in_array {
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter a element");
		int num1 = sc.nextInt();
		System.out.println("Enter a element");
		int num2 = sc.nextInt();
		System.out.println("Enter a element");
		int num3 = sc.nextInt();
		if(num1>num2&&num1>num3) {
			System.out.println(num1 + "largest element");
		}
		else if(num2>num3 && num2>num1)
			System.out.println(num2 +"largest element");
		else {
			System.out.println(num3 +"largest element");
		}
			
		sc.close();
		

}
}
