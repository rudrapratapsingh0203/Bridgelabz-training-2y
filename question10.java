//question 10 convert km to miles
import java.util.Scanner;
public class question10 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.print("Enter distance in kilometers: ");
         double kilometers = sc.nextDouble();
         double miles = kilometers * 0.621371;
         System.out.println("Distance in miles = " + miles);

         sc.close();
     }
}
