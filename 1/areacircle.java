import java.util.*;


public class areacircle{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius of circle");

        float r = sc.nextFloat();

        float area = 3.14f * r *r;

        System.out.println("The area of circle is");
        System.out.println(area);
    }
}