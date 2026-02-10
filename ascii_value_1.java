package oops;
import java.util.Scanner;
public class ascii_value_1 {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a string ");
	String input = sc.next();
    ascii(input);
    
    sc.close();
}

public static void ascii(String input) {
    System.out.println("\nASCII values:");
    for (int i = 0; i < input.length(); i++) {
        char ch = input.charAt(i);
        int asciiValue = (int) ch;
        System.out.println("Character '" + ch + "' = " + asciiValue);
    }
}
}

