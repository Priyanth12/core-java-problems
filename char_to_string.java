package oops;

public class char_to_string {

    public static void main(String[] args) {
        char ch = 'P';
        convert(ch);
    }
public static void convert(char ch) {

  int asciiValue = (int) ch;     
  char character = (char) asciiValue;  
  String str = character + "";   

  System.out.println("String is " + str);
}
}
