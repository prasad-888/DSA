// Finish the following code so that it prints You have a fever if your temperature
// is above 100 and otherwise prints You don't have a fever.



import java.util.*;
public class hw2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float temp= 103.6f;

        if(temp>100){
            System.out.println("You have fever");
        }
        else{
            System.out.println("You dont have fever");
        }
    }
}
