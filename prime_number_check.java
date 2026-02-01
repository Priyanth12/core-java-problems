package scanner;
import java.util.Scanner;
public class prime_number_check {
	
public static void main(String[]args)
{
	Scanner sc = new Scanner(System.in);
	
	
	 System.out.print("Enter a number: ");
     int num = sc.nextInt();

     boolean isPrime = true;

     if (num <= 1) {
         isPrime = false;
     } else 
     {
         for (int i = 2; i <= num / 2; i++) {
             if (num % i == 0) {
                 System.out.println("not an prime");
             }
}
     }
     if (isPrime) {
         System.out.println(num + " is a Prime number");
     } else {
         System.out.println(num + " is Not a Prime number");
     }

     sc.close();
}
}