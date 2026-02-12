package oops;
import java.util.Scanner;
public class pattern_2 {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	int num = sc.nextInt();
	System.out.println("pattern");
	a(num);
	sc.close();
}

public static void a(int num) {
	 for (int i = 0; i <= num; i++) {      
	        for (int j = 0; j <i; j++) { 
	        	if(j ==0|| i == num -1) {
	            System.out.print("* ");
	            }
	        }
	            System.out.println();           
	 }
	
}
}