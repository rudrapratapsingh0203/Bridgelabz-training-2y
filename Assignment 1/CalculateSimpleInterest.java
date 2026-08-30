//question 6  calculate simple interest
import java.util.Scanner;
public class CalculateSimpleInterest {
    public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);   

 System.out.print("Enter Principal Amount: ");
         float principal = sc.nextFloat();

         System.out.print("Enter Rate of Interest: ");
         float rate = sc.nextFloat();

         System.out.print("Enter Time (in years): ");
         float time = sc.nextFloat();

       
         float simpleInterest = (principal * rate * time) / 100;

         System.out.println("Simple Interest = " + simpleInterest);

         sc.close();
     }
}
