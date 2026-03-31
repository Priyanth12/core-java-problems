package scanner;
import java.util.Scanner;
public class simple_interest_calculation {
	
	public static void main(String[]args)
	{
		
		Scanner scanner = new Scanner(System.in);
	System.out.println("principle");	
	int p= scanner.nextInt();
	System.out.println("annual");	
	int r=scanner.nextInt();
	System.out.println("time");	
	int t =scanner.nextInt();
  int SI  = (p * r * t) / 100;
System.out.println(SI);
scanner.close();
	}
	
	}


