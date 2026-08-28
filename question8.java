//question 8 power calculation
import java.util.Scanner;
public class question8 {
   public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base: ");
        double base = sc.nextDouble();
        System.out.print("Enter the exponent: ");
        double exponent = sc.nextDouble();
        double result = Math.pow(base, exponent);
        System.out.println("Result = " + result);

        sc.close();
  }  
}
