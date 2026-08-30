//question 3 celsius to fahrenheit
import java.util.Scanner;
public class CelsiusToFarenheight {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the temperature");
     float Celsius = sc.nextFloat();
     float fahrenheit = (Celsius *9/5)+32;
     System.out.println("the temperature in farenheit is");
     System.out.println(fahrenheit);
     sc.close();
    }
 }

