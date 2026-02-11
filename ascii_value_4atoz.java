package oops;
import java.util.Scanner;
public class ascii_value_4atoz {

	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("ASCII values from a to z:");
	        ascii();

	        sc.close();
	    }

	    public static void ascii() {
	        for (char ch = 'a'; ch <= 'z'; ch++) {
	            System.out.println(ch + " = " + (int) ch);
	 }
	 }
	}

