//question 4 area of circle
import java.util.Scanner;
public class AreaOfCircle {
   
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     float radius = sc.nextFloat();
     float Area = (float) (Math.PI* radius * radius);
     System.out.println("the area of the circle is");
     System.out.println(Area);
      sc.close();
 }
}
