import java.util.*;

public class withparamter {
    
    public static int calculatesum(int num1, int num2){ // parameters or formal parameters
        int sum = num1 + num2;
        return sum;
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a:");
        int a = sc.nextInt();
        System.out.println("Enter b:");
        int b = sc.nextInt();
        int sum = calculatesum(a,b);  // arguments or actual parameters
        System.out.println("Sum is: " + sum);
    }
}
