// Write a Java program to get a number from the user and print whether it is
// positive or negative
import java.util.*;

public class hw1 {
    public static void main(String srgs[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");

        float number = sc.nextFloat();
        if(number>0){
            System.out.println("Positive Number");
        }
        else{
            System.out.println("Negative");
        }
    }
}
