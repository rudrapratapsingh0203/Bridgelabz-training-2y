//question 7 perimeter of a rectangle
import java.util.Scanner;   
public class question7 {
    public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);  
  System.out.println("enter the length");
  int length = sc.nextInt();
  System.out.println("enter the width");
  int width = sc.nextInt();
  int perimeter = 2*(length + width);
  System.out.println("perimeter of  rectangle");
  System.out.println(perimeter);
sc.close();
    }
}

