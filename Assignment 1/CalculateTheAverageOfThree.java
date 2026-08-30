//question 9 calculate the average of three
import java.util.Scanner;
public class CalculateTheAverageOfThree {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter first number: ");
         float num1 = sc.nextFloat();
         System.out.print("Enter second number: ");
         float num2 = sc.nextFloat();
         System.out.print("Enter third number: ");
         float num3 = sc.nextFloat();
         float average = (num1 + num2 + num3) / 3;
         System.out.println("Average = " + average);

         sc.close();
     }
}
