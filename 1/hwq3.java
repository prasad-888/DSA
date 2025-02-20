import java.util.*;

public class hwq3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter cost of ");
        float pencil= sc.nextFloat();

        System.out.println("Enter price for pen");
        float pen = sc.nextFloat();

        System.out.println("Enter price of eraser");
        float eraser = sc.nextFloat();

        float total = pen+pencil+eraser;
        
        System.out.println("The bill is");
        System.out.println(total);

    }
}