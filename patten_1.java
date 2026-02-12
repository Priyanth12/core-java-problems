package oops;
import java.util.Scanner;
public class patten_1 {
	public static void main(String[]args)
	{
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number of rows");
int num = sc.nextInt();
System.out.println(  "pattern");
a(num);
sc.close();
}

	public static void a(int num) {
	    for (int i = 1; i <= num; i++) {      
	        for (int j = 1; j <= i; j++) {    
	            System.out.print("* ");
	            }
	            System.out.println();           
	 }
	  }
	}