import java.util.*;

public class q2 {

    public static boolean isEven(int n){
        if(n%2 ==0){
            return true;
        }
        else{
        return false;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to know if it is even or not");
        int a = sc.nextInt();
        if(isEven(a)){
            System.out.println("The number is even");
        }

        else{
            System.out.println("The number is odd");
        }
    }
}
