//question 5 volume of cylinder
import java.util.Scanner;
public class VolumeOfCylinder {
    public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the height");
  float height = sc.nextFloat();
  System.out.println("Enter the radius");
  float radius = sc.nextFloat();
  double volume = Math.PI * radius * radius * height;
  System.out.println("the volume of cylinder is");
  System.out.println(volume);
  sc.close();
    }
 }


