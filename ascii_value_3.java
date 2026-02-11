package oops;
import java.util.Scanner;

public class ascii_value_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ASCII values from A to Z:");
        ascii();

        sc.close();
    }

    public static void ascii() {
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.println(ch + " = " + (int) ch);
      }
    }
}
